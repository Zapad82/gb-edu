/*
Задание 3 (call, apply 20 минут)
1. Создайте объект calculator с методами add(), subtract() и multiply(),
которые выполняют соответствующие математические операции над
двумя числами. Используйте методы call и apply для вызова этих
методов с передачей аргументов.
console.log(calculator.add.call(null, 5, 3)); // Вывод: 8
console.log(calculator.subtract.apply(null, [5, 3])); // Вывод: 2
*/

const calculator = {
    arg1: 1,
    arg2: 2,
    add(num1, num2) {
        return num1 + num2;
    },

    subtract(num1, num2) {
        return num1 - num2;
    },

    multiply() {
        return this.arg1 * this.arg2;
    },
};

const contextNumbers = {
    arg1: 20,
    arg2: 50,
}

console.log(calculator.add.call(null, 5, 3)); // Вывод: 8
console.log(calculator.subtract.apply(null, [5, 3])); // Вывод: 2
console.log(calculator.multiply.apply(contextNumbers));