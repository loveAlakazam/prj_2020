from flask import Flask, render_template,jsonify, request
app=Flask(__name__)

from pymongo import MongoClient
client= MongoClient('localhost', 27017)
db=client.db_cek

@app.route('/')
def home():
    return render_template('layout.html')

@app.route('/show/orderer', methods=['GET'])
def show_orderer():
    #몽고디비에서 orders콜렉션으로부터 데이터를 가져온다.
    orders=list(db.orders.find({},{'_id':False}))
    return jsonify({'result':'success', 'orders':orders})

@app.route('/enroll/order', methods=['POST'])
def enroll_order():
    name_receive=request.form['give_name']
    cnt_receive=request.form['give_cnt']
    address_receive=request.form['give_address']
    tel_receive= request.form['give_tel']
    pay_receive= request.form['give_pay']

    #json형식 - 주문자 데이터 한개
    order_info={
        'name':name_receive,
        'cnt': cnt_receive,
        'address': address_receive,
        'tel': tel_receive,
        'pay': pay_receive
    }

    # 연결된 몽고디비에서 orders 콜렉션에 넣는다.    
    db.orders.insert_one(order_info)
    return jsonify({'result':'success', 'msg': '님 주문완료 되었습니다!'})

if __name__ =='__main__':
    app.run('0.0.0.0', port=5000, debug=True)