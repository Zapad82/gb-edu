# 1. Создайте программу для игры с конфетами человек против человека.
# Условие задачи: На столе лежит 2021 конфета. Играют два игрока делая ход друг после друга. 
# Первый ход определяется жеребьёвкой. За один ход можно забрать не более чем 28 конфет. 
# Все конфеты оппонента достаются сделавшему последний ход. 
# Сколько конфет нужно взять первому игроку, чтобы забрать все конфеты у своего конкурента?
# a) Добавьте игру против бота
import random
import telebot
bot = telebot.TeleBot("5596725318:AAHett771Os7EF8Qh_3m1ycIGdiLed_IeTk", parse_mode = None)

candies = 121
step = 0
candies_lib = {}



@bot.message_handler(commands=['start'])
def start(message):
    global candies_lib
    global candies
    candies_lib[message.from_user.id] = candies
    bot.send_message(message.chat.id, 'Привет! Поиграем с тобой в игру "Конфеты"? Условия игры простые:')
    bot.send_message(message.chat.id, f'На столе лежит {candies_lib[message.from_user.id]} конфета. \
    Каждый делает по одному ходу друг за другом. \
    Первый ход определяется жеребьёвкой. \
    За один ход можно забрать не более, чем 28 конфет. \
    Все конфеты оппонента достаются сделавшему последний ход - победителю в игре.')
    bot.send_message(message.chat.id, "Проведем жеребьевку выпадением случайного числа 1 или 0. Если выпадет 1, то начинаешь ты.")
    global lottery
    lottery = random.randint(0,1)
    bot.send_message(message.chat.id, f'Выпало {lottery}.')
    if lottery == 0:
        bot.send_message(message.chat.id,'Начинаю я')
        bot.send_message(message.chat.id,'А ты пока напиши мне, сколько конфет заберёшь первым ходом?')
    else:
        bot.send_message(message.chat.id,'Твой ход первый')
        bot.send_message(message.chat.id,'Напиши, сколько конфет ты забираешь этим ходом?')



@bot.message_handler(func=lambda message: True)
# код для игры с первым ходом человека (работает частично)

def echo_all(message):
    if lottery == 1:
        global candies_lib
        leftover_candy = candies_lib[message.from_user.id]
        step = 0
        try:
            int(message.text)
        except ValueError:
            bot.reply_to(message, 'Упс! Для игры нужно вводить цифры, а не остальные символы')
        else:
            if int(message.text) > 28 or int(message.text) < 1:
                bot.reply_to(message,'Можно ввести число от 1 до 28.')
            else:
                if leftover_candy > 28:
                    leftover_candy = leftover_candy - int(message.text)
                    bot.send_message(message.chat.id, f'На столе осталось лежать {leftover_candy} конфет. Теперь мой ход.')
                    candies_lib[message.from_user.id] = leftover_candy
                    step += 1
                if leftover_candy <= 28 and step % 2 != 0:
                    bot.send_message(message.chat.id, f'Последний ход за мной. Я забрал все у тебя.\n'
                                            f'Игра окончена. Я выиграл!\n'
                                            f'Начнём заново? Нажми /start')
                if leftover_candy > 28:
                    player2 = random.randint(1,28)
                    bot.send_message(message.chat.id, f'Я забираю {player2} конфет.')
                    leftover_candy = leftover_candy- player2
                    bot.send_message(message.chat.id, f'На столе осталось лежать {leftover_candy} конфет. Теперь твой ход.')
                    candies_lib[message.from_user.id] = leftover_candy
                    step += 1
                if leftover_candy <= 28 and step % 2 == 0:
                    bot.send_message(message.chat.id, f'Последний ход за тобой. Ты забрал у меня все конфеты.\n'
                                            f'Игра окончена. Выигрыш твой!\n'
                                            f'Начнём заново? Нажми /start')

# первым ходит бот (пока не работает)
    if lottery==0:
        # global candies_lib
        leftover_candy = candies_lib[message.from_user.id]
        step = 0
        try:
            int(message.text)
        except ValueError:
            bot.reply_to(message, 'Упс! Для игры нужно вводить цифры, а не остальные символы')
        else:
            if int(message.text) > 28 or int(message.text) < 1:
                bot.reply_to(message,'Можно ввести число от 1 до 28.')
            else:
                # bot.send_message(message.chat.id,'Напиши, сколько конфет ты забираешь этим ходом?')
                if leftover_candy > 28:
                    player2 = random.randint(1,28)
                    bot.send_message(message.chat.id, f'Я забираю {player2} конфет.')
                    leftover_candy = leftover_candy - player2
                    bot.send_message(message.chat.id, f'На столе осталось лежать {leftover_candy} конфет. Теперь твой ход.\n'
                                                        f'Ранее ты указал, что заберешь {message.text} конфет.')
                    candies_lib[message.from_user.id] = leftover_candy
                    step += 1 
                    if leftover_candy <= 28 and step % 2 != 0:
                        bot.send_message(message.chat.id, f'Последний ход за тобой. Ты забрал у меня все конфеты.\n'
                                            f'Игра окончена. Выигрыш твой!\n'
                                            f'Начнём заново? Нажми /start')
                if leftover_candy > 28:
                    bot.send_message(message.chat.id, f'Ты забрал {message.text} конфет.')
                    leftover_candy = leftover_candy - int(message.text)
                    bot.send_message(message.chat.id, f'На столе осталось лежать {leftover_candy} конфет. Теперь мой ход.\n'
                                                        f'А ты пока напиши мне, сколько конфет хочешь забрать сейчас?')
                    candies_lib[message.from_user.id] = leftover_candy
                    step += 1
                    if leftover_candy <= 28 and step % 2 == 0:
                        bot.send_message(message.chat.id, f'Последний ход за мной. Я забрал все у тебя.\n'
                                            f'Игра окончена. Я выиграл!\n'
                                            f'Начнём заново? Нажми /start')      
                    

                    

bot.infinity_polling()