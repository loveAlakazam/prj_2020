# 크롤링 시킨 결과물들을 서버에 저장한다.

import requests
from bs4 import BeautifulSoup
from pymongo import MongoClient

client=MongoClient('localhost',27017)
db=client.db_cek

def get_urls():
    headers={'User-Agent': 'Mozilla/5.0 (Windows NT 10.0; Win64; x64)AppleWebKit/537.36 (KHTML, like Gecko) Chrome/73.0.3683.86 Safari/537.36'}
    data= requests.get('https://movie.naver.com/movie/sdb/rank/rpeople.nhn?date=20200614&tg=1')
    
    # data를 text로 바꾸고, html코드에 대하여 Parse
    soup=BeautifulSoup(data.text, 'html.parser')

    # soup.select에 해당하는 모든 태그들을 모은다.
    trs=soup.select('#old_content > table > tbody > tr')

    urls=[]
    for tr in trs:
        a=tr.select_one('td.title > a')
        # a가 존재한다면
        if a is not None:
            baseurl='https://movie.naver.com/'
            url= baseurl+a['href']
            urls.append(url)
    return urls

def insert_star(url):
    headers = {
        'User-Agent': 'Mozilla/5.0 (Windows NT 10.0; Win64; x64)AppleWebKit/537.36 (KHTML, like Gecko) Chrome/73.0.3683.86 Safari/537.36'
    }

    data= requests.get(url, headers=headers)
    soup= BeautifulSoup(data.text, 'html.parser')

    name= soup.select_one('#content > div.article > div.mv_info_area > div.mv_info.character > h3 > a').text
    img_url=soup.select_one('#content > div.article > div.mv_info_area > div.poster > img')['src']
    recent=soup.select_one('#content > div.article > div.mv_info_area > div.mv_info.character > dl > dd > a:nth-child(1)').text

    # 영화배우 이름/이미지 url/ 최근작품/ like(좋아요수 0으로 초기화) 데이터를 json으로 묶어서 저장. 
    actor={
        'name': name,
        'img_url': img_url,
        'recent': recent,
        'like':0
    }

    # db에서 movies 콜렉션에 데이터 1ro를 추가한다.
    db.movies.insert_one(actor)
    print(f'영화배우 {name} 입력완료!')



def insert_all():
    # movies 콜렉션을 모두 지워준다.
    # 계속 업데이트
    db.movies.drop()

    # 영화인들의 정보 Url들을 얻는다.
    urls=get_urls()

    # 각 url을 호출하여 데이터베이스에 넣는다.
    for url in urls:
        insert_star(url)

if __name__=='__main__':
    insert_all()