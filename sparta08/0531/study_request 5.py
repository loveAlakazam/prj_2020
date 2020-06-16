import requests # requests 라이브러리 설치 필요
# requests.post()
# r: response (응답)
# synchronous 방식.

r = requests.get('http://openapi.seoul.go.kr:8088/6d4d776b466c656533356a4b4b5872/json/RealtimeCityAir/1/99')
rjson = r.json() #딕셔너리 방식으로 변환시킨다.
# print(rjson['RealtimeCityAir']['row'][0]['NO2'])

print(rjson)
print(rjson['RealtimeCityAir'])
print(rjson['RealtimeCityAir']['row'])
print(rjson['RealtimeCityAir']['row'][0])
print(rjson['RealtimeCityAir']['row'][0]['NO2'])


gus= rjson['RealtimeCityAir']['row']
for gu in gus:
    city=gu['MSRSTE_NM']
    no2=gu['NO2']
    mise=gu['IDEX_MVL']

    if mise<100:
        print(city,'의 이산화질소 농도: ', no2, '/ 미세먼지 농도: ', mise)
