/*
3) Напишем функцию, которая будет находить факториал числа с использованием рекурсии:
// примеры вызова функции
console.log(factorial(5)); // выводит 120 (5 * 4 * 3 * 2 * 1)
console.log(factorial(0)); // выводит 1 (по определению факториала)
*/

 function factorial(arg) {
    
    if (arg < 0) {
        return("Число должно быть положительным и целым");
    } else if (arg != 1 && arg != 0) {
        return(arg * factorial(arg - 1));
    } else {
        return(1);
    };   
};


console.log(factorial(5)); // выводит 120 (5 * 4 * 3 * 2 * 1)
console.log(factorial(0)); // выводит 1 (по определению факториала)
console.log(factorial(-9));
