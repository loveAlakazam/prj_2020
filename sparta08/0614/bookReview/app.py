from flask import Flask, render_template, jsonify, request
app=Flask(__name__)

from pymongo import MongoClient
client = MongoClient('localhost', 27017)
db= client.db_cek #db_cek의 collections를 사용하겠다.

# 클라이언트가 "localhost:5000/" 라는 url을 요청하면
# home()라는 함수를 호출한다.
@app.route('/')
def home():
    # 응답의 결과는 index.html 이다.
    # render_template()은 templates 폴더에 있는 html파일을 리턴시키는 함수이다.
    return render_template('index.html')


# 클라이언트(브라우저)가 "localhost:5000/get"를 GET(read only)방식으로 웹페이지 요청하면
# read_review() 함수를 호출하여 응답(response)를 보낸다.(리턴한다.)
@app.route('/get', methods=['GET'])
def read_review():
    # mongodb의 bookReviews 콜렉션안에 있는 전체 데이터들을 수집한다.
    reviews=list(db.bookReviews.find({},{'_id':False}))

    # 클라이언트의 요청이 성공하면, 응답데이터를 반환.
    # 서버는 클라이언트가 요청한 Mongodb의 bookReviews콜렉션의 모든데이터 리스트를 준다.
    return jsonify({'result':'success', 'reviews': reviews})


# 클라이언트(브라우저)가 "localhost:5000/post"를 POST방식으로 요청하면
# write_review() 함수를 호출하여 응답(response)를 보낸다.(리턴한다.)
@app.route('/post', methods=["POST"])
def write_review():
    # 서버는 클라이언트로부터 데이터를 받는다.
    # animation.js의 make_reivew()함수에서 수집한데이터 title, author, review를
    # 각각 title_give, author_give, review_give 라는 대응하는 값으로 받는다.

    # 클라이언트로부터 요청된 데이터를 서버에서 받는다.
    title_receive=request.form['title_give']
    author_receive=request.form['author_give']
    review_receive=request.form['review_give']

    data={
        'title': title_receive,
        'author': author_receive,
        'review': review_receive
    }

    # bookReviews 라는 몽고디비 콜렉션에 data라는 딕셔너리 한개를 넣는다.
    db.bookReviews.insert_one(data)
    return jsonify({'result': 'success', 'msg':'리뷰 등록 완료했습니다!'})


if __name__=='__main__':
    app.run('0.0.0.0', port=5000, debug=True)
