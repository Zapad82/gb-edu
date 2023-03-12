import pytube
import telebot
from time import sleep
bot = telebot.TeleBot("5596725318:AAFRbDD-60U0xk0kYHlaEQdUNeCntJIjOP0", parse_mode = None)


@bot.message_handler(commands=['start'])
def start(message):
    bot.send_message(message.chat.id, 'Привет! Скинь ссылку на видео в Ютьюб, я тебе его скачаю. Ты получишь скачанное видео через 20 секунд')
    

    
@bot.message_handler(func=lambda message: True)
def YTDownload(message):
    downloads(message.text)
    sleep(20)
    video = open('seminar10/name.mp4', 'rb')
    bot.send_video(message.chat.id, video)

def downloads(url):
    pytube.YouTube(url).streams.filter(res="360p").first().download(filename=f"seminar10/name.mp4")
    yt = pytube.YouTube(url)
    yt.streams

bot.infinity_polling()
