# программа для решения квадратного уравнения

import model
#from logger import log_expr,log_ans
import logger

def get_expr(): # метод получения информации
    return input()

def show_res(a): # метод вывода информации
    print(a)

expression = get_expr() # получение уравнения от пользователя
logger.log_expr(expression)
answer = model.evaluate_expr(expression) # сохранение решения

logger.log_ans(answer)
show_res(answer) # Вывод ответа