# Контекст
# Теперь, когда у вас есть абстрактный класс Shape, ваша следующая задача - получить класс Circle.
# ● Задача
# Реализовать дочерний от Shape класс Circle, включая следующие работающие методы:
# ○ конструктор класса __init__ - метод инициализации класса Circle.
# ○ get_area - метод для расчета площади круга
# ○ get_perimeter - метод для расчета периметра окружности

import math


class Shape:
    def get_perimetr(self):
        pass
    
    def get_area(self):
        pass


class Circle(Shape):
    def __init__ (self, r):
        self.r=r
    def get_perimetr (self):
        return 2*math.pi*self.r
    def get_area(self):
        return math.pi*self.r**2
    

cercle1 = Circle(10)
print(cercle1.get_perimetr())
print(cercle1.get_area())