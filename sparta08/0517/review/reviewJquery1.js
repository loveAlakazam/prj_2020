function openClose(){
    //post-box가 열려있는지(닫혀있는지) display 상태   
    let postBox=$('#post-box');
    let status=postBox.css('display');
    let postBtn=$('#posting-box-btn');
    
    //포스트박스가 열려있을때 버튼클릭
    if(status=="block"){
        postBox.hide(); //닫는다 -> postBox는 닫힌상태
        postBtn.text('포스팅 박스 열기'); //포스트박스 닫기
        
    }else{ //포스트 박스가 닫혀있음
        postBox.show(); //연다-> postBox는 열린상태
        postBtn.text('포스팅 박스 닫기');
    }
}