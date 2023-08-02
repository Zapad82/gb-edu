// Задание 2 (Чистые функции 25минут)
// Текст задания
// 1. Напишите функцию getEvenNumbers, которая принимает массив
// чисел в качестве аргумента и возвращает новый массив,
// содержащий только четные числа.
const getEvenNumbers = (arr) => {
    const newArr = arr.filter((el) => {
        if (el % 2 == 0) {
            return el;
        }
    });
    return newArr;
}
console.log ( getEvenNumbers([1, 2, 3, 4, 5, 6, 7, 8]));


// 2. Задача: Напишите функцию calculateAverage, которая принимает
// массив чисел в качестве аргумента и возвращает среднее значение
// этих чисел.
const calculateAverage = (arr) => {
    const newArr = arr.reduce((acc, el) => {
        return acc + el;
    });

    return newArr / arr.length;
};
console.log ( calculateAverage([1, 2, 3, 4, 5, 6, 7, 8]));



// 3. Напишите функцию capitalizeFirstLetter, которая принимает строку в
// качестве аргумента и возвращает новую строку, в которой первая
// буква каждого слова является заглавной.
const capitalizeFirstLetter = (str) => {
    return str.replace(/(^|\s)\S/g, (char) => char.toUpperCase());
};

 console.log(capitalizeFirstLetter('привет, мой дорогой друг.'));
