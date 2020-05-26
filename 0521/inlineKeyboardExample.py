# -*- coding: utf-8 -*-
# InlineKeyboard Example
import logging
from telegram import InlineKeyboardButton, InlineKeyboardMarkup
from telegram.ext import Updater, CommandHandler, CallbackQueryHandler

#MY_TOKEN="발급받은 봇 API"
MY_TOKEN=''
logging.basicConfig(format='%(asctime)s -%(name)s - %(levelname)s - %(message)s',
                    level=logging.INFO)

logger=logging.getLogger(__name__)


def start(update, context):
    # 버튼 구조
    # option-1 버튼을 클릭하면 -> callback_data='1'을 전송.
    keyboard=[ [InlineKeyboardButton('option-1', callback_data='1')],
                [InlineKeyboardButton('option-2', callback_data='2')],
                
                # 하나의 셀에 두개이상의 버튼을 넣을 수 있다.
                [InlineKeyboardButton('option-3', callback_data='3'),
                 InlineKeyboardButton('option-4', callback_data='4')] 
            ]
                
    # 버튼을 감싸는 테두리
    reply_markup=InlineKeyboardMarkup(keyboard)
    update.message.reply_text('무엇을 도와드릴까요?' , reply_markup=reply_markup )
    
    
    
def button(update, context):
    # 버튼을 누를때 발생하는 콜백쿼리를 수집하고
    query= update.callback_query
    query.answer()
    
    # 콜백쿼리의 데이터(callback_data)를 답장으로 보낸다.
    query.edit_message_text(text='Selected option {}'.format(query.data))
    
    
def help_(update, context):
    update.message.reply_text('use /start to test this bot')
    

def error(update, context):
    'log errors caused by updates'
    logger.warning('Update {} caused by error %s'.format(update, context.error))
    
def main():
    # 사용자 정의로 Bot의 기능을 먼저 추가해놓는다.
    # updater을 만들어놓는다.
    updater= Updater(MY_TOKEN, use_context=True)
    
    # start 라고 입력하면 -> start() 함수를 실행
    updater.dispatcher.add_handler(CommandHandler('start', start))
    
    # 각 단추를 클릭하면 button()이라는 콜백을 나타내는 함수와 연결
    # 즉 단추와 단추를 누를때 실행하는 기능들을 콜백이라고 보면된다.
    # 단추들과 단추의 기능을 연결
    updater.dispatcher.add_handler(CallbackQueryHandler(button))
    
    # help라고 입력하면 help()함수 실행
    updater.dispatcher.add_handler(CommandHandler('help', help_))
    
    # error
    updater.dispatcher.add_error_handler(error)
    
    #Bot을 시작한다.
    updater.start_polling()
    
    # 봇이 동작한다.
    # ctrl+c 버튼눌림이 감지되면 종료하도록 되어있다.
    updater.idle()
    
if __name__=='__main__':
    main()
    
    
    
    
    
