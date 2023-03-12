# Напишите программу, удаляющую из текста все слова, содержащие "абв".
# Пример: абв, абвгд, гдеёжз, непшщтг -> гдеёжз, непшщтг
import telebot

# def deleting(text):
#     text = list(filter(lambda i: not 'абв' in i, text.split()))
#     return text

def deleting(text):
    while text.find('абв') != -1:
        text = text.replace('абв','')
    return text


bot = telebot.TeleBot("Your_Token")

@bot.message_handler(commands=['start'])
def start_message(message):
    bot.send_message(message.chat.id, 'Привет! Я умею удалять часть слова, \
        содержащее набор букв "абв" из списка.')
    bot.send_message(message.chat.id, 'Введите список из нескольких слов.')
    # bot.reply_to(message, "Howdy, how are you doing?")

@bot.message_handler(func=lambda message: True)
def echo_all(message):
    bot.reply_to(message, deleting(message.text))


bot.infinity_polling()


