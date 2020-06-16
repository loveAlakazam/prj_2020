import requests
from bs4 import BeautifulSoup
from pymongo import MongoClient
client = MongoClient('localhost', 27017)
db= client.dbsparta

# 코딩할 준비#
# 실습1
# 불러오기
target=db.movies.find_one({'title':'매트릭스'},{'rank':False, 'title':False})
target_star=target['star']
print(target_star)


# 실습2
# 모든 데이터를 가져온다
movies= db.movies.find({'star':target_star})
for movie in movies:
    title=movie['title']
    print(title)


#실습3 - 매트릭스와 같은 점수인 영화들 평점 => 0점으로 수정
# update_many : 조건에 맞는 데이터들을 한꺼번에 수정
# update_one: 한개만 수정
# update_many( {조건}, { '$set':{변경사항} } ) #{조건/ 1번째 중괄호}에 맞는 애들 모두를 {변경 사항 /2번째 중괄호}로 바꿔라
db.movies.update_many({'star':target_star}, {'$set':{'star':0}})


#쿼리 검색 : (mac) command + enter / (windows) ctrl +enter