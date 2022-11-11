# Задача 2:
# Создайте программу для игры в "Крестики-нолики".

# задаём игровое поле с числами от 1 до 9 одномерным списком
playing_field = list(range(1,10))

# функция, которая выводит список в привычное игровое поле
def draw_field(playing_field):
    print("-------------")
    for i in range(3):
        print("|", playing_field[0+i*3], "|", playing_field[1+i*3], "|", playing_field[2+i*3], "|")
        print("-------------")

# функция, ввода данных пользователем
def take_input(player_token):
    valid = False
    while not valid:
        player_answer = input("Куда поставим " + player_token+"? ")
        try:
            player_answer = int(player_answer)
        except:
            print("Некорректный ввод. Вы уверены, что ввели число?")
            continue
        if player_answer >= 1 and player_answer <= 9:
            if (str(playing_field[player_answer-1]) not in "XO"):
                playing_field[player_answer-1] = player_token
                valid = True
            else:
                print("Эта клеточка уже занята")
        else:
            print("Некорректный ввод. Введите число от 1 до 9 чтобы походить.")

# функция проверки игрового поля
def check_win(play):
    win_coord = ((0,1,2),(3,4,5),(6,7,8),(0,3,6),(1,4,7),(2,5,8),(0,4,8),(2,4,6))
    for each in win_coord:
        if playing_field[each[0]] == playing_field[each[1]] == playing_field[each[2]]:
            return playing_field[each[0]]
    return False

# основная функция, где собраны все функции
def main(playing_field):
    counter = 0
    win = False
    while not win:
        draw_field(playing_field)
        if counter % 2 == 0:
            take_input("X")
        else:
            take_input("O")
        counter += 1
        if counter > 4:
            tmp = check_win(playing_field)
            if tmp:
                print(tmp, "выиграл!")
                win = True
                break
        if counter == 9:
            print("Ничья!")
            break
    draw_field(playing_field)

main(playing_field)