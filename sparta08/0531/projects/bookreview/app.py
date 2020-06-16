from flask import Flask, render_template, jsonify, request
app = Flask(__name__)

# db연결
from pymongo import MongoClient           # pymongo를 임포트 하기(패키지 인스톨 먼저 해야겠죠?)
client = MongoClient('localhost', 27017)  # mongoDB는 27017 포트로 돌아갑니다.
db = client.dbsparta                     # 'dbsparta'라는 이름의 db를 만듭니다.

## HTML을 주는 부분
@app.route('/') #기본적으로 보여줄 페이지/ 메소드 GET을 사용.
def home():
    return render_template('index.html')

## API 역할을 하는 부분
@app.route('/reviews', methods=['POST']) #review를 저장하는 
def write_review():
    # 넣어둔 데이터를 받는다.
    # 요청된 데이터를 꺼낸다.
    title_receive = request.form['title_give'] #title_give란 이름으로 데이터를 보내겠다.-> title_recieve(서버입장에서 받는거)
    author_receive= request.form['author_give']
    review_receive= request.form['review_give']

    # 데이터를 저장한다.
    # 몽고디비에 저장 json형식으로
    review={
        'title':title_receive,
        'author':author_receive,
        'review':review_receive
    }

    db.reviews.insert_one(review)
    #collections이 있으면 덮어쓴다.
    #중복된 데이터에 대해서 신경쓰지 않는다.
    #데이터의 정확성이 맞지 않을 수 있다.
    return jsonify({'result':'success', 'msg': '리뷰가 성공적으로 저장되었습니다!'}) #json형식으로 리턴한다. / 화면 or data를 리턴
    #ajax의 success영역으로 이동.

@app.route('/reviews', methods=['GET']) #review를 조회
def read_reviews():
    #reviews collections 안에 있는 모든 데이터를 가져온다.
    # _id 필드를 제외한 나머지 필드들만을 가져온다.
    reviews=list(db.reviews.find({},{'_id':0}))
    
    # 데이터로 프론트엔드에게 응답으로 돌아온다. -> 그다음에는 프론트엔드는 응답데이터를 사용한다.
    return jsonify({'result':'success', 'reviews': reviews})


# 똑같은 get방식일때 route값만 다르게하면 된다.
# @app.route('/reviews2', methods=['GET']) #review를 조회
# def read_reviews2():
#     return jsonify({'result':'success', 'msg': '이 요청은 GET!'})

if __name__ == '__main__':
    app.run('0.0.0.0', port=5000, debug=True)