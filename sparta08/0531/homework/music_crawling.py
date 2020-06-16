import requests
from bs4 import BeautifulSoup

from pymongo import MongoClient
client=MongoClient('localhost', 27017)
db=client.dbsparta

# 지니뮤직 현재기준 top200
url='https://www.genie.co.kr/chart/top200?ditc=D&rtm=N'
headers = {'User-Agent' : 'Mozilla/5.0 (Windows NT 10.0; Win64; x64)AppleWebKit/537.36 (KHTML, like Gecko) Chrome/73.0.3683.86 Safari/537.36'}
data = requests.get(url ,headers=headers)

soup=BeautifulSoup(data.text , 'html.parser')

# class가 list인 tr 태그들을 모아놓은다.
musics= soup.select('#body-content > div.newest-list > div > table > tbody > tr.list')

for rank, music in enumerate(musics, 1):
    #곡제목
    title=music.select_one('td.info > a.title').text.strip()

    #가수
    artist=music.select_one('td.info > a.artist').text
    print(f'{rank} {title} {artist}')

    #음악차트 정보를 하나의 json형식으로 묶는다. 
    info={
        'rank':rank,
        'title': title,
        'artist':artist
    }

    #처음에만 시도끼워넣는다.
    # 몽고디비의 musics 콜렉션에 저장한다 (음악 차트 1개의 정보)
    db.musics.insert_one(info)

print('몽고디비 musics 콜렉션에 데이터 저장완료!')

# 노래제목이 돌덩이 를 찾는다. , 가수이름을 제외한 나머지 키(key)만 구한다.
target=db.musics.find_one({'title':'돌덩이'}, {'artist':False})

# 몽고디비에서 내가 좋아하는 노래가 몇위인지를 찾아본다
print('{} 노래는 현재 {}위 입니다.'.format(target['title'], target['rank']))
