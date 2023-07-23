// Задание 1
// Создайте функцию которая возводит переданное число в куб, необходимо вывести в консоль результат 2^3 степени + 3 ^ 3 степени
function Cubing(num1) {
    return num1**3;
}
const numberToCube = Cubing(2) + Cubing(3);
console.log(numberToCube);