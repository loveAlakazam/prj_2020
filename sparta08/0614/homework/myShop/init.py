from pymongo import MongoClient

client= MongoClient('localhost', 27017)
db=client.db_cek

def delete_all():
    # 데이터베이스 안에 있는 것들을 모두 지운다.
    db.orders.delete_many({})

def main():
    delete_all()

if __name__=='__main__':
    main()