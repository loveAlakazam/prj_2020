from flask import Flask, render_template, jsonify, request
app = Flask(__name__)

import requests
from bs4 import BeautifulSoup

from pymongo import MongoClient           # pymongo를 임포트 하기(패키지 인스톨 먼저 해야겠죠?)
client = MongoClient('localhost', 27017)  # mongoDB는 27017 포트로 돌아갑니다.
db = client.dbsparta                      # 'dbsparta'라는 이름의 db를 만듭니다.

## HTML을 주는 부분
@app.route('/')
def home():
    return render_template('index.html')

@app.route('/memo', methods=['GET'])
def listing():
    # 1. 모든 document 찾기 & _id 값은 출력에서 제외하기
    # 요청을 읽어서 데이터를 처리한다.
    # articles 콜렉션 안에 있는 모든 데이터를 가져온다. / _id 필드를 제외한 나머지필드만가져옴.
    results= list(db.articles.find({},{'_id':0})) #결과값을 리스트로 나온다.
    # print(results)
    # for result in results:
    #     print('@@@@@@@')
    #     print(result) #딕셔너리 하나하나

    # 2. articles라는 키 값으로 영화정보 내려주기
    return jsonify({'result':'success', 'articles':results}) #데이터베이스안에있는 모든데이터들을 받아서 프론트 엔드에게 준다.

## API 역할을 하는 부분
@app.route('/memo', methods=['POST'])
def saving():
    # 1. 클라이언트로부터 데이터를 받기
    url_receive= request.form['url_give']
    comment_receive= request.form['comment_give']

    # 확인
    #print('url_receive: {}'.format(url_receive))
    #print('comment_receive: {}'.format(comment_receive))

    # 2. meta tag를 스크래핑하기
    headers = {'User-Agent': 'Mozilla/5.0 (Windows NT 10.0; Win64; x64)AppleWebKit/537.36 (KHTML, like Gecko) Chrome/73.0.3683.86 Safari/537.36'}
    data = requests.get(url_receive, headers=headers) #응답전체
    soup=BeautifulSoup(data.text,'html.parser' ) #응답의 내용만 가져온다. html형식으로 beautifulsoup 가공

    #하나만 가져온다.
    # select_one 리턴타입이 dictionary임.
    og_image=soup.select_one('meta[property="og:image"]') #meta태그중 Property가 og:image인 태그를 가져와라
    og_title=soup.select_one('meta[property="og:title"]')
    og_description= soup.select_one('meta[property="og:description"]')

    #print(f'og-img: {og_image} \nog-title: {og_title}\n og-description: {og_description}')

    url_image= og_image['content']
    url_title= og_title['content']
    url_description= og_description['content']

    #print(f'url-img: {url_image}\n\nurl-title: {url_title}\n\nurl-description: {url_description}')
    
    
    # 3. mongoDB에 데이터 넣기
    article={
        'url':url_receive,
        'comment':comment_receive,
        'image': url_image,
        'title': url_title,
        'description': url_description
    }

    db.articles.insert_one(article) #dictionary가 articles콜렉션에 들어있게됨.
    return jsonify({'result': 'success', 'msg':'POST 연결되었습니다!'})

if __name__ == '__main__':
   app.run('0.0.0.0',port=5000,debug=True)