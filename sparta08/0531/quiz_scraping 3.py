import requests
from bs4 import BeautifulSoup

headers = {'User-Agent' : 'Mozilla/5.0 (Windows NT 10.0; Win64; x64)AppleWebKit/537.36 (KHTML, like Gecko) Chrome/73.0.3683.86 Safari/537.36'}
data = requests.get('https://movie.naver.com/movie/sdb/rank/rmovie.nhn?sel=pnt&date=20200531',headers=headers)

soup= BeautifulSoup( data.text ,'html.parser')
movies=soup.select('#old_content > table > tbody > tr')

# 나 스스로
# for movie in movies:
#     a_tag=movie.select_one('td.title > div > a')
#     rank=movie.select_one('td.ac > img')
#     score=movie.select_one('td.point')
    
#     # a_tag가 None이 아니라면
#     if a_tag is not None:
#         title=a_tag.text
#         rank= rank.attrs['alt'] # rank의 속성중 alt를 가져온다.
#         score=score.text
#         print(f'{rank} {title} {score}')



# 선생님과 같이
# rank=1 #변수로 만들기
# for movie in movies:
#     a_tag=movie.select_one('td.title > div > a')
#     point=movie.select_one('td.point')

#     # a_tag가 None이 아니라면-> a_tag(영화제목정보)가 있어야 평점과 순위도 같이 있으니까
#     if a_tag is not None:
#         point= point.text
#         title=a_tag.text #존재하면 텍스트로 추출. 존재조차 안하는것에 텍스트 추출하면 에러남.  
#         print(f'{rank} {title} {point}') #형식은 나중에 설정한다.
#         rank+=1
#     #python- 배틱! : f'제목: {a_tag_text}'


# 순위: 
for movie in movies:
    a_tag=movie.select_one('td.title > div > a')

    # a_tag가 None이 아니라면-> a_tag(영화제목정보)가 있어야 평점과 순위도 같이 있으니까
    if a_tag is not None:
        title= a_tag.text
        point=movie.select_one('td.point').text #존재하면 텍스트로 추출. 존재조차 안하는것에 텍스트 추출하면 에러남.  
        rank=movie.select_one('td.ac > img').attrs['alt'] # 문자열 형태의 숫자.
        # print(point, title, rank)
        print(f'{int(rank)} {title} {point}') #형식은 나중에 설정한다.
        
    
