// 화면 html파일이 로딩 시작되자마자 시작하는 함수.
$(document).ready(function () {

    $('#list-box').empty(); //주문자 리스트박스를 먼저 없애버리고.
    //listing() 함수를 실행한다.
    listing();
});

function listing() {
    //Get방식
    let list = $('#list-box'); //id=list-box 인 프로퍼티를 구한다.

    $.ajax({
        type: 'GET',
        url: '/show/orderer',
        data: {},
        success: function (response) {
            // 응답결과가 success 이면
            //list-box 에 넣는다.
            if (response['result'] == 'success') {
                // 데이터베이스 안에있는 모든 데이터를 갖고온다.
                let datas = response['orders'];
                datas.forEach(data => {
                    //주문자의 정보
                    let name = data['name']; //주문자 이름
                    let address = data['address'];// 주문자 주소
                    let cnt = data['cnt'];// 주문자 주문개수
                    let tel = data['tel'];// 주문자 전화번호
                    let pay = data['pay'];// 주문 가격

                    let orderInfo = `<tr>
                    <td>${name}</td>
                    <td>${cnt}</td>
                    <td>${address}</td>
                    <td>${tel}</td>
                    <td>${pay}</td>
                  </tr>`

                    //list에 orderInfo를 넣는다
                    list.append(orderInfo);
                });
            }
        }
    });
}


// 주문 버튼을 클릭하면 동작하는 함수
function clickOrder() {
    //이름
    let orderName = $('#order-name').val();
    //수량
    let orderCnt = $('#order-cnt').val();

    //주소
    let orderAddress = $('#order-address').val();

    //전화번호
    let orderTel = $('#order-tel').val();
    console.log('주문자 이름: ' + orderName);
    console.log('주문자 주소: ' + orderAddress);
    console.log('주문 수량: ' + orderCnt);
    console.log('주문자 전화번호: ' + orderTel);

    //다시 코드를 수정해보자.
    //이름요소가 비어있다면
    let error = "";
    if (orderName == "") {
        error = error.concat("이름을 입력해주세요!\n");
    }

    //수량이 비어있다면
    if (orderCnt == "-- 수량을 선택해주세요 --") {
        error = error.concat("수량을 선택해주세요!\n");
    }

    //주소
    if (orderAddress == '') {
        error = error.concat("주소를 입력해주세요!\n");
    }

    //전화번호
    if (orderTel == '') {
        error = error.concat("전화번호를 입력해주세요!\n");
    }

    console.log(error);
    // 입력요소중 하나라도 비어있다면
    // if (error == '') {
    //     let orderSuccess = `${orderName}님 주문하신 제품 ${orderCnt}개 주문완료했습니다.\n배달이 시작되면 ${orderTel} 로 문자 전송하겠습니다.`
    //     alert(orderSuccess);
    // } else {
    //     alert(error);
    // }

    // mongodb 데이터 베이스에 post방식으로 데이터를 전달.
    if (error.length==0) {
        $.ajax({
            type: 'POST',
            url: '/enroll/order',
            data: {
                'give_name': orderName,
                'give_cnt': orderCnt,
                'give_address': orderAddress,
                'give_tel': orderTel,
                'give_pay': (orderCnt * 25000)
            },
            success: function (response) {
                //웹페이지 요청이 성공하면, 응답합수를 호출.
                if (response['result'] == 'success') {
                    //주문완료 alert를 띄운다.
                    alert(orderName + response['msg']);

                    //페이지 리로딩
                    window.location.reload();
                }
            }
        });
    }
}


//환율정보 확인하는 페이지
//페이지 랜더링을 하게되면.
$(document).ready(function () {
    let dollarSpan = $("#dollar_won");
    $.ajax({
        type: "GET",
        url: "https://api.manana.kr/exchange/rate.json",
        data: {},
        success: function (response) {

            let dollarExchange = response[1]['rate'];
            let insertHtml;
            //달러 환율이 1300 이상이면 -> 글자를 빨간색으로 표시.
            if (dollarExchange >= 1300) {
                insertHtml = `<strong class="higher-exchange">${dollarExchange} ($ ${(25000 / dollarExchange).toFixed(3)})</strong>`;
            } else {
                //1300 미만이라면 글자색깔 적용 x
                insertHtml = `<strong>${dollarExchange} ($ ${(25000 / dollarExchange).toFixed(3)})</strong>`;
            }

            dollarSpan.append(insertHtml);
        }
    });
});
