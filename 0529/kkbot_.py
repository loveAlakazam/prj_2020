# -*- coding: utf-8 -*-
# 2020.05.29 - k.k봇 모델
import telegram
from telegram.ext import Updater, CommandHandler, CallbackQueryHandler
from telegram import InlineKeyboardButton, InlineKeyboardMarkup
from emoji import emojize


#MY_TOKEN=

# emoji 이미티콘을 포함시킨 텍스트 리턴.
def emojized(text):
    return emojize(text,use_aliases=True)


class TelegramBot:
    #텔레그램 봇 객체를 생성하기 위한 생성자
    def __init__(self, name, token):
        #봇 객체 생성
        self.core=telegram.Bot(token) #텔레그램 봇
        self.updater= Updater(token, use_context=True)  
        
        self.name= name # 텔레그램 봇 이름
        self.id=userID #user 아이디

        
    ## 봇이 유저에게 전송하는 기능 ##
    # animation: *.gif 이미지 파일 를 보낸다.
    def sendAnimation(self, animation):
        self.core.sendAnimation(chat_id=self.id, animation=open(animation, 'rb'))
    
    # 텍스트 메시지를 보낸다.
    def sendMessage(self, text):
        self.core.sendMessage(chat_id=self.id, text=emojized(text))
        
    #    # inlineKeyboard 메시지 전송
    #    def sendInlineKeyboardBtn(self, cmd, showBtnFunc, actionBtnFunc):
    #        # cmd명령(문자열) 입력 -> showBtnFunc 실행(버튼을 보여주는 함수)
    #        self.updater.dispatcher.add_handler(CommandHandler(cmd, showBtnFunc))
    #        
    #        #버튼을 누를때마다 반응하는 함수: actionBtnFunc
    #        self.updater.dispatcher.add_handler(CallbackQueryHandler(actionBtnFunc))

        
    # 봇 동작 멈춤
    def stop(self):
        self.updater.start_polling()
        self.updater.dispatcher.stop()
        self.updater.job_queue.stop()
        self.updater.stop()
        
        
class KKBot(TelegramBot):
    def __init__(self):
        #텔레그램 봇을 만든다.
        self.token=TelegramBot HTTP TOKEN
        #K.K 텔레그램 봇을 생성한다.
        TelegramBot.__init__(self, 'K.K', self.token)
        self.updater.stop()
        
    #봇기능 추가 메소드
    # cmd라는 명령어를 입력 -> func 를 실행하도록 한다.
    def add_handler(self, cmd, func):
        self.updater.dispatcher.add_handler(CommandHandler(cmd, func))
        
    # queryHandler
    # 버튼 선택에 대한 반응함수
    def add_callback_query_handler(self, qfunc):
        self.updater.dispatcher.add_handler(CallbackQueryHandler(qfunc))
        
    # 봇 시작할때
    def start(self):
        self.sendAnimation('./imgs/gifs/kk_gif.gif') # 애니메이션을 보낸다
        self.sendMessage(emojized('안녕하세요. 저는 :dog:개가수:dog: K.K에요. 어떤걸 도와드릴까요?')) #텍스트 메시지
        self.updater.start_polling()
        self.updater.idle()
        
    
        