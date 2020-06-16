from flask import Flask, render_template
app=Flask(__name__)

from pymongo import MongoClient
client = MongoClient('localhost', 27017)
db= client.dbsparta

@app.route('/')
def home():
    return render_template('layout.html')




if __name__=='__main__':
    app.run('0.0.0.0', port=5000, debug=True)