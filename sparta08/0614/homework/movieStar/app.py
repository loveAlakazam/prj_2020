from flask import Flask, jsonify ,render_template, request
app=Flask(__name__)

from pymongo import MongoClient

client=MongoClient('localhost', 27017) 
db=client.db_cek

@app.route('/')
def home():
    return render_template('index.html')

@app.route('/api/list', methods=['GET'])
def stars_list():
    # 1. my star 목록 전체를 검색한다.
    # ID를 제외하고 like가 많은 순으로 정렬
    # db의 movies collection에서 id를 제외한 모든데이터를 조회한다.
    # 'like'의 개수를 기준으로 내림차순 정렬
    stars_list= list(db.movies.find({},{'_id':False}).sort('like',-1)) #내림차순 정렬

    # 2. 성공하면 success메시지와 함께
    #  stars_list 목록을 클라이언트에 전달한다.
    # 페이지 요청에 대한 응답 response를 의미한다.
    return jsonify({'result':'success', 'stars_list': stars_list})   


# 좋아요 버튼을 누르면 서버에서 실행하는 함수.
# url: /api/like 를 요청.
@app.route('/api/like', methods=['POST'])
def stars_like():
    # 클라이언트가 전달한 name_give를 name_receive에 전달.
    name_receive= request.form['name_give']

    # movies 목록에서 find_one으로 name이 일치하는 star를 찾는다.
    # 이름 컬럼이 name_receive인 배우 데이터 한개를 찾는다.
    # id_ 칼럼을 제외한 나머지 데이터를 갖고온다.
    target_star= db.movies.find_one({'name':name_receive},{'id_':False})

    # star의 like에 1을 더해준 new_like변수를 생성
    new_like= target_star['like'] +1

    # mystar 목록에서 name이 name_receive인 문서의 like를 new_like로 변경
    # 0번째 인자: 'name'컬럼의 값이 name_receive 인 데이터로우를 구한다.
    # 1번째 인자: 그중 'like'컬럼에 해당하는 값을 new_like로 변경한다.
    # '$set': {컬럼이름: 변경값}
    db.movies.update_one({'name': name_receive},{'$set':{'like':new_like}})

    # 성공하면 success 메시지 반환
    return jsonify({'result':'success'})

@app.route('/api/delete', methods=['POST'])
def stars_delete():
    # 1. 클라이언트가 전달한 name_give를 name_receive에 전달
    name_receive=request.form['name_give']

    # 2. mystar 목록에서 delete_one 으로 name이 name_receive와 일치하는 star를 제거
    # 데이터베이스에서는 클라이언트로부터 요청한 데이터 name에 해당하는 데이터로우 한개를 삭제.
    db.movies.delete_one({'name': name_receive})

    # 3. 제거성공하면 success 메시지 반환
    return jsonify({'result':'success'})



if __name__ =='__main__':
    app.run('0.0.0.0', port=5000 ,debug=True)