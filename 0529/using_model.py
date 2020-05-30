# -*- coding: utf-8 -*-
"""
using_model.py #모델 kkbot_.py를 사용하는 모듈
Created on Fri May 29 21:06:50 2020
"""

# 봇활용
import kkbot_ as model #kkbot_.py 파일을 불러온다.
from telegram import InlineKeyboardButton, InlineKeyboardMarkup



# 사용자 정의 함수
def restart(bot, update):
    myBot.start()

def hello(bot, update):
    myBot.sendMessage('안녕하세요')

def bye(bot, update):
    myBot.sendAnimation('./imgs/gifs/bye.gif')
    myBot.sendMessage('알겠어요. 그럼 또 불러줘요. :smile:')
    myBot.stop() #종료기능

def select_song(update, context):
    keyboard=[[InlineKeyboardButton('K.K하우스', callback_data='K.K 하우스')],
              [InlineKeyboardButton('K.K팝', callback_data='K.K 팝')]
            ]
    
    reply_markup=InlineKeyboardMarkup(keyboard)
    update.message.reply_text(model.emojized(':notes: 어떤곡을 듣고 싶으세요? :notes:'),
                                     reply_markup=reply_markup)

def select_song_query(update, context):
    query=update.callback_query
    query.answer()
    callback_data= query.data
    query.edit_message_text(text='당신에게 이 노래를 받칩니다. {}'.format(callback_data))
    
# k.k봇을 생성한다.
myBot= model.KKBot()
myBot.add_handler('hello', hello) # '/hello'입력 -> hello() 실행

#Inlinekeyboard 메시지 보내기 예시
myBot.add_handler('select', select_song) #'/Select'입력 -> select_song()실행
myBot.add_callback_query_handler(qfunc=select_song_query) #select_song에서 키를 누르면, 그에 대한 반응을 나타냄.

#챗봇 재시동
myBot.add_handler('start', restart)

# 챗봇 종료 
myBot.add_handler('bye', bye) #'/bye'입력 -> bye()실행
#myBot.add_handler('end', bye) #'/end'입력 -> bye()실행

#챗봇 시작
myBot.start()
