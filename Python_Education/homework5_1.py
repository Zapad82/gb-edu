# 1. Создайте программу для игры с конфетами человек против человека.
# Условие задачи: На столе лежит 2021 конфета. Играют два игрока делая ход друг после друга. 
# Первый ход определяется жеребьёвкой. За один ход можно забрать не более чем 28 конфет. 
# Все конфеты оппонента достаются сделавшему последний ход. 
# Сколько конфет нужно взять первому игроку, чтобы забрать все конфеты у своего конкурента?
# a) Добавьте игру против бота
import random


candies = 121
leftover_candy = candies
step = 0
print('Проведем жеребьевку выпадением случайного числа 1 или 0. Если выпадет 1, то начинает Первый игрок.')
lottery = random.randint(0,1)
print(f'Выпало {lottery}.')
if lottery == 0:
    print('Начинает второй игрок.')
else:
    print('Начинает первый игрок')
while candies >= 28:
    if lottery == 1:
        player1 = int(input('Введите значение, сколько конфет Вы хотите забрать: '))
        if player1 > 28 or player1 <= 0:
            print('Можно ввести число от 0 до 28.')
        else:
            leftover_candy = leftover_candy - player1
            print(f'На столе осталось лежать {leftover_candy} конфет. Теперь ход второго игрока.')
            step += 1
            player2 = random.randint(1,28)
            print(f'Второй игрок забирает {player2} конфет.')
            leftover_candy = leftover_candy - player2
            print(f'На столе осталось лежать {leftover_candy} конфет. Теперь ход первого игрока.')
            step += 1
            if leftover_candy <= 28 and step % 2 == 0:
                print(f'Последний ход за первым игроком. Он забирает {leftover_candy} конфет(-ы) и все конфеты у оппонента.')
                print('Игра окончена')
                break;
            
            if leftover_candy <= 28 and step % 2 != 0:
                print(f'Последний ход за вторым игроком. Он забирает {leftover_candy} конфет(-ы) и все конфеты у оппонента.')
                print('Игра окончена')
                break;

    else:
        player2 = random.randint(1,28)
        print(f'Второй игрок забирает {player2} конфет.')
        step += 1
        leftover_candy = leftover_candy - player2
        print(f'На столе осталось лежать {leftover_candy} конфет. Теперь ход первого игрока.')    
        player1 = int(input('Введите значение, сколько конфет Вы хотите забрать: '))
        if player1 > 28 or player1 <= 0:
            print('Можно ввести число от 0 до 28.')      
        else:
            print(f'Первый игрок забирает {player1} конфет.')
            leftover_candy = leftover_candy - player1
            print(f'На столе осталось лежать {leftover_candy} конфет. Теперь ход второго игрока.')
            step += 1
        if leftover_candy <= 28 and step % 2 == 0:
            print(f'Последний ход за вторым игроком. Он забирает {leftover_candy} конфет(-ы) и все конфеты у оппонента.')
            print('Игра окончена')
            break;           
        if leftover_candy <= 28 and step % 2 != 0:
            print(f'Последний ход за первым игроком. Он забирает {leftover_candy} конфет(-ы) и все конфеты у оппонента.')
            print('Игра окончена')
            break;
