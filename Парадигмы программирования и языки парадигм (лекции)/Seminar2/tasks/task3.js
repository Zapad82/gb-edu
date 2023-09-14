// Условие
// На вход подается число в десятичной системе счисления
// ● Задача
// Написать скрипт в любой парадигме, который возвращает полученное число переведенное в двоичную
// систему счисления. Обоснуйте сделанный выбор парадигм.


function decimalToBinary(decimal) {
    let result = "";

    while (decimalNumber > 0) {
        result = decimalNumber % 2 + result;
        decimalNumber = Math.floor(decimalNumber / 2);
    }
}

let decimalNumber = 14;

console.log(decimalToBinary(decimalNumber));