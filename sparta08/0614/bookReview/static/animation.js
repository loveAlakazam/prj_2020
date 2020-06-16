// 화면 로딩이 되는 순간 바로 실행하는 함수
$(document).ready(function () {
    //id가 orders-box에 해당하는 태그의 내용을 없애버린다.
    $('#orders-box').html('');

    //listing()함수를 호출한다.
    listing();
});

function listing() {
    //1. 리뷰목록을 서버에 요청한다.
    //2. 요청성공 여부를 확인한다.
    //3. 요청 성공했을 때 리뷰를 올바르게 화면에 나타낸다.
    $.ajax({
        type: 'GET',
        url: '/get', // localhost:5000/get url 요청
        data: {},
        success: function (response) {
            //요청이 성공되면, success에 해당하는 함수를 실행한다.
            //요청에 대한 응답이다.

            //response json형태의 데이터중
            //키값이 'result'에 대한 값이 success라면 (요청이 성공상태라면)
            if (response['result'] == 'success') {
                // 서버로부터 reviews를 데이터를 받는다.
                let reviews= response['reviews'];

                //id가 "order-box"인 태그에 append시킨다.
                let reviewLists=$('#orders-box');

                for(let i=0; i<reviews.length; i++){
                    let current=reviews[i];
                    let insertReview=`<tr>
                    <td>${current['title']}</td>
                    <td>${current['author']}</td>
                    <td>${current['review']}</td>
                    </tr>`;
                    reviewLists.append(insertReview);
                }

            } else {
                alert('리뷰를 받아오지 못했습니다!');
            }
        }
    });
}

function make_review() {
    //1. 제목, 저자, 리뷰 내용을 가져온다.
    let title = $('#title').val();
    let author = $('#author').val();
    let review = $('#review').val();

    //2. 제목, 저자, 리뷰 중 하나라도 입력하지 않았을 경우 alert()를 띄운다.
    if (title.length == 0) {
        alert('제목을 입력해주세요!');
        $('#title').focus(); // 제목입력란을 강조표시
    } else if (author.length == 0) {
        alert('저자를 입력해주세요!');
        $('#author').focus();

    } else if (review.length == 0) {
        alert('리뷰를 입력해주세요!');
        $('#review').focus();
    }

    //3. POST방식 /reviews 에 저장을 요청한다.
    else {
        $.ajax({
            type: 'POST', //POST방식으로 웹페이지를 요청한다.
            url: '/post', // localhost:5000/reviews 페이지를 요청한다.
            //웹서버의 /reviews에 해당하는 함수 write_review()를 호출한다.
            //제목, 저자, 리뷰 에대한 데이터를 server에 요청한다.
            data: {
                title_give : title, 
                author_give: author, 
                review_give: review},
            success: function (response) {
                // 요청이 성공되면 실행되는 함수.
                if (response['result'] == 'success') {
                    alert(response['msg']);
                    window.location.reload();
                }
            }
        });
    }
}


// 리뷰의 글자수가 140자가 넘는지 확인하는 함수
function is_long(obj) {
    //this=obj= textarea태그 객체 자체를 의미한다.
    let content = $(obj).val(); // content: 리뷰작성한 내용의 길이
    if (content.length > 140) {
        alert('리뷰는 최대140자까지 기록할 수 있습니다!');
        $(obj).val(content.substring(0, content.length - 1));
    }
}

