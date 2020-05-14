# -*- coding: utf-8 -*-
"""
Created on Thu May 14 14:34:07 2020

@author: USER
"""
import telegram
from telegram.ext import Updater, CommandHandler

class TelegramBot:
    def __init__(self, name, token):
        self.core= telegram.Bot(token)
        self.updater= Updater(token)
        self.id=1090974086
        self.name=name
        
    def sendMessage(self, text):
        self.core.sendMessage(chat_id= self.id, text=text)
        
    def stop(self):
        self.updater.start_polling()
        self.updater.dispatcher.stop()
        self.updater.job_queue.stop()
        self.updater.stop()
        
class BotKkbot(TelegramBot):
    def __init__(self):
        self.token="발급받은 API키"
        TelegramBot.__init__(self,'K.K', self.token)
        self.updater.stop()
        
    def add_handler(self, cmd, func):
        self.updater.dispatcher.add_handler(CommandHandler(cmd, func))
        
    def start(self):
        self.sendMessage('안녕하세요. 저는 개가수 K.K 입니다. 무엇을 도와드릴까요?')
        self.updater.start_polling()
        self.updater.idle()
        