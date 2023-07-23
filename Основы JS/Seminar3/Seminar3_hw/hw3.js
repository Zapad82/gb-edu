// Пользователь с клавиатуры вводит 3 числа, необходимо создать функцию, которая определяет максимальное значение среди этих чисел

const num1 = Number(prompt('Введите первое число:'));
const num2 = Number(prompt('Введите второе число:'));
const num3 = Number(prompt('Введите третье число:'));

function maxNumber(num1, num2, num3) {
     return Math.max(num1, num2, num3);
}

alert(`Максимальное число среди введенных: ${maxNumber(num1, num2, num3)}`);