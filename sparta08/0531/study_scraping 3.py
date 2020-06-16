import requests
from bs4 import BeautifulSoup

# 타겟 URL을 읽어서 HTML를 받아오고,
# headers : url보다 덜 핵심적인 메타데이터 정보지만, 내가 어디를 통해서 웹페이지에 접속한다고 알림.
# 내가 크롤러를 사용하고 있다.라고 서버에게 명시적으로 알려줌.

# 서버에서 웹페에지 접근.
# 헤더를 명시적으로 제시, 헤더를 넣으면 요청.
# 스크래핑: 사람인 척하고 싶다.


headers = {'User-Agent' : 'Mozilla/5.0 (Windows NT 10.0; Win64; x64)AppleWebKit/537.36 (KHTML, like Gecko) Chrome/73.0.3683.86 Safari/537.36'}
data = requests.get('https://movie.naver.com/movie/sdb/rank/rmovie.nhn?sel=pnt&date=20200531',headers=headers)

# HTML을 BeautifulSoup이라는 라이브러리를 활용해 검색하기 용이한 상태로 만듦
# soup이라는 변수에 "파싱 용이해진 html"이 담긴 상태가 됨
# 이제 코딩을 통해 필요한 부분을 추출하면 된다.

# BeautifulSoup : 
# data 데이터 형식을 beautiful soup를 통해서 바꿔준다.
# 편리하게 처리하기 위해서 html을 텍스트/json 형태로 바꾼다. / soup라는 이름의 handle을 달아준다.
# 데이터 형태가 html로 되어있음.
soup = BeautifulSoup(data.text, 'html.parser')



#############################
# (입맛에 맞게 코딩)

# #old_content > table > tbody
# id(old_content)안에  > table태그가 있고 > 그안에 tbody 태그가있다.
# tbody까지의 경로를 찾는다.(select: 이조건에 해당하는 모든것들을 갖고와라 => 리스트로 나온다.)
# select_one: 맨 처음나오는 딱하나만 나온다.

# 그 tbody안에 tr들만 수집
# movies=soup.select('#old_content > table > tbody')
# print(movies)

movies=soup.select('#old_content > table > tbody > tr')


# None 이 뜸
# select_one => 1개 데이터
# select=> 1개의 리스트=> 여러개의 데이터
# td라는 태그중에 title이라는 클래스를 갖고있다: td.title
# div안에 a안에 영화제목 텍스트 데이터가 들어있다.
# for movie in movies:
#     atag=movie.select_one('td.title > div > a')


# None 이 안 뜸.  
# 중간에 나오는 None 을 없애야함. 구분을 해야함. (a tag안에 있는 내용이 존재하냐 존재하지 않느냐로 구분.) 
for movie in movies:
    atag=movie.select_one('td.title > div > a')   
    # None 은 데이터가 존재하지 않는다를 - 아무것도 없다 (null)
    # 화장지가 없음 (0) / 화장실도 없음
    if atag is not None: # is : ~이다/ ~가 아니다.
        # 태그의 특정 속성: atag.attrs['href']
        # 태그의 텍스트: atag.text
        print('text: ',atag.text) # atag가 None이 아니라면 atag를 출력/ a
        print('attrs: ', atag.attrs['href'])
        print()
        



#############################