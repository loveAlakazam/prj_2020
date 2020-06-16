from pymongo import MongoClient           # pymongo를 임포트 하기(패키지 인스톨 먼저 해야겠죠?)
client = MongoClient('localhost', 27017)  # mongoDB는 27017 포트로 돌아갑니다.
db = client.dbsparta                     # 'dbsparta'라는 이름의 db를 만듭니다.

# # MongoDB에 insert 하기
# 'users'라는 collection에 {'name':'bobby','age':21}를 넣습니다.
# db.users.insert_one({'name':'bobby','age':21})
# db.users.insert_one({'name':'kay','age':27})
# db.users.insert_one({'name':'john','age':30})


# db.users에 저장된 데이터들을 읽어온다.
all_users=db.users.find() #find()조건이 없다=> 저장된 데이터 모두를 다 갖고와. /find(조건문)
print(all_users)
print()

# # MongoDB에서 데이터 모두 보기
all_users = list(db.users.find()) #데이터를 리스트로 감싸면 내용물이 나온다. (json형태)
# print(all_users)
print(all_users[0])         # 0번째 결과값을 보기
print(all_users[0]['name']) # 0번째 결과값의 'name'을 보기
print()

tmp=db.users.find_one()
print('tmp: ',tmp)
print()

# 참고) MongoDB에서 특정 조건의 데이터 모두 보기
# 특정 조건에 맞는 사람을 추출한다. 
#find => 리스트형태로 가져온다
#find_one => 조건에 충족한 맨앞 데이터를 가져온다
same_ages = list(db.users.find({'age':21}, {'_id': False})) #앞: 찾을 조건 => #어떤정보를 제외할 것인가.(_id를 빼고 나머지)
print('result same_ages: ',same_ages)

# _id와 age 컬럼을 제외한 나머지만.
# : (콜론) 은 같다라는 의미
# Mongodb greater thatn == $gt:20
same_ages2=db.users.find_one({'age':21}, {'_id':False, 'age':False})
print(same_ages2)


#수정하기 - update
# name=bobby 를 찾아서 -> 나이를 19로 바꾼다.
db.users.update_one({'name':'bobby'}, {'$set':{'age':19}}) #조건에 만족하는 해당하는 하나를 갖고와서 수정 


#삭제하기 -delete : database는 raw-data를 저장..
# 활성화된 데이터를 삭제하기보다는 -> 다른 collections에 옮긴다.
# 아니면 valid가 false로 변환시켜서 데이터가 활성화되지 않음을 나타냄(삭제를 하지 않음)
# 왜 직접 삭제를 하지않냐면, 데이터를 삭제하면 복구하기 어렵다.




# for user in all_users:      # 반복문을 돌며 모든 결과값을 보기
#     print(user)