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
    if (error == '') {
        let orderSuccess = `${orderName}님 주문하신 제품 ${orderCnt}개 주문완료했습니다.\n배달이 시작되면 ${orderTel} 로 문자 전송하겠습니다.`
        alert(orderSuccess);
    } else {
        alert(error);
    }
}


//환율정보 확인하는 페이지
//페이지 랜더링을 하게되면.
    $(document).ready(function(){
        let dollarSpan=$("#dollar_won");
        $.ajax({
            type:"GET",
            url:"https://api.manana.kr/exchange/rate.json",
            data:{},
            success: function(response){
                
                let dollarExchange= response[1]['rate'];
                let insertHtml;
                //달러 환율이 1300 이상이면 -> 글자를 빨간색으로 표시.
                if (dollarExchange>=1300){
                    insertHtml=`<strong class="higher-exchange">${dollarExchange} ($ ${(25000/dollarExchange).toFixed(3)})</strong>`;
                }else{
                    //1300 미만이라면 글자색깔 적용 x
                    insertHtml=`<strong>${dollarExchange} ($ ${(25000/dollarExchange).toFixed(3)})</strong>`;
                }
                
                dollarSpan.append(insertHtml);
                

            }
        });
    });
