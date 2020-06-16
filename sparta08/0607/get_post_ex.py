from flask import Flask, render_template, jsonify, request
app = Flask(__name__)

# HTML을 주는 부분


@app.route('/')
def home():
    return render_template('index.html')

# API 역할을 하는 부분


@app.route('/test', methods=['POST'])
def test_post():
    # request.form => dictionary 접근가능한 딕셔너리
    # 프론트엔드에서 넘겨준 데이터이다.
    title_receive = request.form['title_give']
    print(title_receive)
    return jsonify({'result': 'success', 'msg': '이 요청은 POST!'})


@app.route('/test', methods=['GET'])
def test_get():
    # get url 뒤에 물음표 뒤에있는 문자열을 가져온다.
    title_receive = request.args.get('title_give')
    print(title_receive)
    return jsonify({'result':'success', 'msg': '이 요청은 GET!'})

if __name__ == '__main__':
    app.run('0.0.0.0',port=5000,debug=True)
