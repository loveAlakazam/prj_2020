# -*- coding: utf-8 -*-
"""
Created on Thu May 14 14:24:38 2020

@author: loveAlakazam / CEK
"""

import ChatbotModel as model
import random

def kk_hello(bot, update):
    myBot.sendMessage('안녕하세요.')

def kk_sing(bot, update):
    songList=['나비보벳따우~~', '나비보벳또오오~~', \
          '나비보벳따우우웅우~', '삐뽀베삐뽀뻬뽀뻬']
    myBot.sendMessage('그럼 노래를 시작할게요.')
    randNum= random.randrange(len(songList))
    getSong=songList[randNum]
    myBot.sendMessage(getSong)
    myBot.sendMessage('제 노래를 끝까지 감상해줘서 고마워요!')
    
def kk_stop(bot, update):
    myBot.sendMessage('알겠어요. 그럼 다음에도 말해줘요 ^^')
    myBot.stop()


# ChatbotModel에서 작성한 챗봇객체 생성
myBot= model.BotKkbot()

# 기능 추가
myBot.add_handler('hello', kk_hello)
myBot.add_handler('sing', kk_sing)
myBot.add_handler('end', kk_stop)

# 챗봇 시작
myBot.start()


        
