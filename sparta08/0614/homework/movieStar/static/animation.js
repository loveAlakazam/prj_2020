// 요청한 html페이지가 모두 랜더링이 되는 순간에
// 실행하는 함수
$(document).ready(function(){
    //index.html 로드가 완료되면
    // 자동으로 show_star()함수를 실행
    $('#star-box').empty(); // star-box에 기존에 들어있는 데이터를 비운다.
    show_star(); 
});

function show_star(){
    $.ajax({
        type: 'GET',
        url: '/api/list',
        data: {},
        success: function(response){
            // 응답페이지에 대한 요청이 성공하면
            // success에 해당하는 function을 실행
            if(response['result']=='success'){
                // response에서 'result'키값에 해당하는 값이 'success' 라면

                //서버에서 얻은 몽고디비의 movies 콜렉션 안에 있는 데이터들을 가져온다.
                actors_info=response['stars_list'];

                //각 영화배우 정보에 대한 카드를 담는 영역을 구한다
                let cardsBox=$('#star-box');

                //반복문을 실행하면서, cardsBox에 영화배우 한명의 카드를 넣는다.
                actors_info.forEach(actor => {
                    let name= actor['name'];
                    let img_url= actor['img_url'];
                    let recent=actor['recent'];
                    let like=actor['like'];

                    let card=`<div class="card">
                    <div class="card-content">
                        <div class="media">
                            <div class="media-left">
                                <figure class="image is-48x48">
                                    <img src=${img_url}
                                        alt="Placeholder image" />
                                </figure>
                            </div>
                            <div class="media-content">
                                <a href="#" target="_blank" class="star-name title is-4">${name} (좋아요: ${like})</a>
                                <p class="subtitle is-6">${recent}</p>
                            </div>
                        </div>
                    </div>
                    <footer class="card-footer">
                        <a href="#" onclick="like_star('${name}')" class="card-footer-item has-text-info">
                            위로!
                            <span class="icon">
                                <i class="fas fa-thumbs-up"></i>
                            </span>
                        </a>
                        <a onclick="delete_star('${name}')" class="card-footer-item has-text-danger">
                            삭제
                            <span class="icon">
                                <i class="fas fa-ban"></i>
                            </span>
                        </a>
                    </footer>
                </div>`

                //cardsBox에 card를 담는다.
                cardsBox.append(card);
                });
            }
        }
    });
}


// 좋아요 버튼을 누르면 실행하는 함수
function like_star(name){
    $.ajax({
        type: 'POST', //POST 방식으로 전달 (url에 노출이 되지 않는다.)
        url: '/api/like',
        data:{'name_give': name},// 데이터 name을 서버에게 전달하여 웹페이지 url(/api/like)를 요청.
        success: function(response){
            // 웹페이지 요청이 성공하면
            if(response['result']=='success'){
                alert(name +"의 좋아요 수가 올라갑니다!");
                
                // 자동으로 리로딩
                window.location.reload();
            }
        }
    });
}

// name에 해당하는 배우 카드에서 삭제버튼을 눌렀을때
// 서버에게 /api/delete url을 요청.
function delete_star(name){
    $.ajax({
        type:'POST',
        url:'/api/delete',
        data:{'name_give': name},
        success: function(response){
            // 요청이 성공하면, name에 대한 카드를 없애버린다.
            if (response['result']=='success'){
                alert(name+ '배우 카드를 제거합니다!');

                //윈도우를 리로딩
                window.location.reload();
            }
        }
    });
}



