from flask import Flask, render_template
app = Flask(__name__)

# url와 함수이름은 중복이 되면 안된다.
@app.route('/')
def home():
    #서버에서 html template를 호출
    #flask 서버에 접근해서 템플릿을 불러온다. - 플라스크 서버의 형식대로 맞춰야한다.
    return render_template('index2.html')
    # return 'This is Home!'

@app.route('/mypage')
def mypage():  
   return 'This is My Page!'

if __name__ == '__main__':  
   app.run('0.0.0.0',port=5000,debug=True)
