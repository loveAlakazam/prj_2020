function clickOrder(){
    //이름
    let orderName=$('#order-name').val();
    //수량
    let orderCnt=$('#order-cnt').val();

    //주소
    let orderAddress=$('#order-address').val();
    
    //전화번호
    let orderTel=$('#order-tel').val();

    // 입력요소중 하나라도 비어있다면
    if (orderName=="" || orderCnt=="" || orderAddress=="" || orderTel==""){
        alert("입력해주세요!");
    }else{
        let orderSuccess=`${orderName}님 주문하신 제품 ${orderCnt}개 주문완료했습니다.\n배달이 시작되면 ${orderTel} 로 문자 전송하겠습니다.`
        alert(orderSuccess);
    }
}