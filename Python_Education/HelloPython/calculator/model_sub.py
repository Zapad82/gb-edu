x = 0
y = 0

# метод, который отвечает за инициализацию двух значений
def init(a, b):
    global x # объявляем x и y глобальными переменными
    global y
    x = a
    y = b

# метод сложения двух чисел
def do_it():
    return x - y