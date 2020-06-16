from pymongo import MongoClient

from flask import Flask, render_template, jsonify, request
app = Flask(__name__)

client = MongoClient('localhost', 27017)
db = client.dbsparta

# HTML을 주는 부분
# 이 url 로 서버에 요청하면 바로 밑에있는 함수를 실행해줘.
@app.route('/') # url과 연결. 메인 페이지.
def home():
    return render_template('index.html') #html 을 리턴 

# API 역할을 하는 부분
@app.route('/api/list', methods=['GET']) #method: url을 구성하는 방식
def stars_list():
    # 정보를 읽는다 = GET
    # 1. mystar 목록 전체를 검색합니다. ID는 제외하고 like 가 많은 순으로 정렬합니다.
    # 참고) find({},{'_id':False}), sort()를 활용하면 굿!
    stars= list(db.mystar.find({}, {'_id': False}).sort('like', -1))
    #1: {} => 모든 데이터. / 2: 필요없는 컬럼: _id (각컬럼은 기본값은 true) / 리스트로 감싼다.
    # find_one => 조건에 만족하는 애중 가장 첫번째꺼만 가져와라.
    
    # 2. 성공하면 success 메시지와 함께 stars_list 목록을 클라이언트에 전달합니다.
    return jsonify({'result': 'success','stars_list': stars})
    #response 매개변수에 들어감.
    # 검색결과 (전체 영화배우 데이터를 response['stars_list'] 에  저장한다.)


@app.route('/api/like', methods=['POST'])
def star_like():
    # 쓴다 = 수정한다 = POST
    # 1. 클라이언트가 전달한 name_give를 name_receive 변수에 넣습니다.

    # request.form => post부분의 data 영역에 해당함.
    name_receive=request.form['name_give']

    # 2. mystar 목록에서 find_one으로 name이 name_receive와 일치하는 star를 찾습니다.
    star = db.mystar.find_one({'name':name_receive})

    # 3. star의 like 에 1을 더해준 new_like 변수를 만듭니다.
    new_like= star['like']+1

    # 4. mystar 목록에서 name이 name_receive인 문서의 like 를 new_like로 변경합니다.
    # $set: mongodb 데이터 변경: {'like': new_like} => like컬럼에 해당한 값을 new_like로 변경하라.
    db.mystar.update_one({'name': name_receive}, {'$set':{'like':new_like}})
    # 참고: '$set' 활용하기!

    # 5. 성공하면 success 메시지를 반환합니다
    return jsonify({'result': 'success','msg':'like 연결되었습니다!'})

@app.route('/api/delete', methods=['POST'])
def star_delete():
    # 삭제버튼을 누를때(삭제도 수정의 일종이다.) 실행.
    # 1. 클라이언트가 전달한 name_give를 name_receive 변수에 넣습니다.
    name_receive=request.form['name_give']

    # 2. mystar 목록에서 delete_one으로 name이 name_receive와 일치하는 star를 제거합니다.
    db.mystar.delete_one({'name': name_receive})

    # 3. 성공하면 success 메시지를 반환합니다.
    return jsonify({'result': 'success'})

if __name__ == '__main__':
    app.run('0.0.0.0', port=9000, debug=True) # 127.0.0.1 로컬호스트 / 5000번 포트 