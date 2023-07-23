// function greet(firstName, lastName, age) {
//     return `Привет ${firstName} ${lastName} с возрастом ${age}`
// }
// console.log(greet('Ivan', 'Petrov', 20));



// function squareNumber(number) {
//     return number ** 2
// }
// console.log(squareNumber(5))




// Задание 1 (тайминг 20 минут)
// Текст задания
// 1. Написать функцию, которой передаем, имя, фамилия и
// возраст, и получаем строку "Привет Иван Петров с
// возрастом 17" (только здесь данные, которые были
// переданы в функцию)
// 2. Создайте функцию которая возводит переданное число в
// квадрат
// 3. Сделайте функцию, которая параметром принимает
// число и проверяет, положительное это число или
// отрицательное. В первом случае пусть функция выводит
// в консоль текст '+++', а во втором '---'.
// function checkNumber(number) {
//     if (number> 0) {
//         console.log ('+++');
//     } else if (number < 0) {
//         console.log ('---');
//     }
// }
// checkNumber(-5)



// Замыкание
// function x() {
//     const a = 5;
//     function b() {
//         return a ** 2;
//     }
//     return b;
// }
// console.log(x()());
// or
// const callB = x();
// console.log(callB());



// function createCheckNumberFunction() {
//     return function (number) {
//         if (number> 0) {
//             console.log ('+++');
//         } else if (number < 0) {
//             console.log ('---');
//         }        
//     }
// }
// console.log(createCheckNumberFunction()(3));



// Задание 2 (тайминг 15 минут)
// 1. Сделайте функцию, которая параметрами принимает 3 числа и
// выводит в консоль сумму этих чисел.
// 2. С помощью созданной вами функции выведите в консоль сумму
// значений этих переменных.
// let param1 = 1;
// let param2 = 2;
// let param3 = 3;
// 1. Дана фукнция
// function func(num = 5) {
// console.log(num * num);
// }
// Расскажите, каким будет результат каждого из вызовов функции.
// func(2);
// func(3);
// func();
// function sumThreeNumbers(num1, num2, num3) {
//     console.log(num1 + num2 + num3);
// }
// sumThreeNumbers(2, 4, 6);

// на рекурсии
// function sumThreeNumbers(num1, num2, num3) {
//     if(num3 === undefined) {
//         return num1 + num2;
//     } else {
//         return sumThreeNumbers(num1 + num2, num3)
//     }
// }
// console.log(sumThreeNumbers(2, 4, 6));

// function sumNumbers(num) {
//     if (num === 1) {
//         return 1;
//     }
//     return num * sumNumbers(num - 1);
// }
// console.log(sumNumbers(5));


// Задание 3 (тайминг 15 минут)
// 1. Сделайте функцию, которая параметром принимает число, а
// возвращает квадратный корень из этого числа. С помощью этой
// функции найдите корень числа 3, затем найдите корень числа 4.
// Просуммируйте полученные результаты и выведите их в консоль.
// 2. Создайте функцию, которая находит минимальное число из 2х
// передаваемых аргументов функции
// function squareNumber(num) {
//     return Math.sqrt(num);
// }
// const num1 = squareNumber(4);
// const num2 = squareNumber(9);
// const sumNum = num1 + num2;
// console.log(sumNum);
// function findMin(a, b) {
//     return Math.min(a, b)
// }
// console.log(findMin(5, 10));



// Задание 4 (тайминг 25 минут)
// 1. Сделайте функцию, которая принимает параметром число от 1 до 7,
// а возвращает день недели на русском языке.
// 2. Написать функцию, которой передаем имя и она возвращает
// приветствие в зависимости от времени суток (Доброе
// утро\день\вечер\ночи Иван)
// function getDays(day) {
//     switch(day) {
//         case 1:
//             return 'Понедельник';
//         case 2:
//             return 'Вторник';
//         case 3:
//             return 'Среда';
//         case 4:
//             return 'Четверг';
//         case 5:
//             return 'Пятница';
//         case 6:
//             return 'Суббота';
//         case 7:
//             return 'Воскресенье';
//         default:
//             return 'Неверный номер недели'
//     }
// }
// console.log(getDays(5));


// console.log(new Date().getHours());
function greet(name) {
    const now = new Date();
    const hour = now.getHours();
    if(hour >= 6 && hour < 12) {
        return `Доброе утро ${name}`
    } else if (hour >= 12 && hour <= 17) {
        return `Добрый день ${name}`
    } else if (hour >= 17 && hour < 22) {
        return `Добрый вечер ${name}`
    } else {
        return `Доброй ночи ${name}`
    }
}
console.log(greet('Владимир'));