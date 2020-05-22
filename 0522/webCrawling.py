"""
selenium과 BeautifulSoup를 이용하여
동물의 숲 동물친구 랭킹 웹페이지 크롤링
- selenium을 이용하여, 자동으로 버튼 클릭
- [ 이름/ 성격/ 종족/ 순위/ 이미지 출처url ] 텍스트 정보 수집
"""

from selenium import webdriver
from bs4 import BeautifulSoup
from selenium.common.exceptions import ElementNotInteractableException
import time 
import requests

##1. 자동으로 '더보기' 버튼을 누르게하여 모든 동물 친구들을 보여주도록 한다.
driver=webdriver.Chrome('chromedriver')

# 페이지를 연다.
originURL='https://animalcrossing.soopoolleaf.com/ko/acnh/popularityvillagerssearch/?a=all'
driver.get(originURL)

# 모든버튼을 클릭이후의 페이지를 나타낸다.
nowPage=''

try:
    while True:
        # 더보기 버튼을 클릭한다.
        # 더이상 보여줄페이지가 없을때까지 클릭한다.
        moreBtn=driver.find_element_by_class_name('moreBtn')
        moreBtn.click()    
        time.sleep(0.5)

except ElementNotInteractableException: #예외발생 - 더보기 클릭버튼이 존재하지 않음.
    print('더보기 버튼 모두 클릭 완료')
    
    # 모든 버튼을 클릭을 완료한 뒤에 페이지를 가져온다.
    nowPage=BeautifulSoup(driver.page_source, 'html.parser')

    
## 2. 정보 추출하기
# 종족 추출
aniType_Location='#show_product > div > div > div.media-left > h4 > a'
aniTypes=[ aniType.text for aniType in nowPage.select(aniType_Location)]
    
# 이름 추출
aniName_Location='#show_product > div > div > div.media-body > div:nth-child(1) > h4 > span > a'
aniNames=[ name.text  for name in nowPage.select(aniName_Location)]


# 3. 순위정보 추출하기
aniRank_Location='#show_product > div > div > div.media-body > div:nth-child(2) > h4 > span > a > span'
aniRanks=[ rank.text for rank in nowPage.select(aniRank_Location)]


# 4. 성격정보 추출하기
aniP_Location='#show_product > div > div > div.media-body > div:nth-child(4) > h4 > span > a > span > span'
aniPersonalities=[personality.text for personality in nowPage.select(aniP_Location)]


# 이미지크롤링
#5. 동물친구의 이미지 링크 정보 추출하기
# div태그의 클래스이름이 media-left에서 이미지를 추출.
imgURL_from=nowPage.find_all('img', class_='lazyImg')

# 이미지의 경로를 받겠다. - 자세히 보니 data-original 속성을 통해서 얻을 수 있다.
imgUrls=[ url.get('data-original')  for url in imgURL_from]
