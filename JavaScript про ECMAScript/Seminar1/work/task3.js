// Задание 3 (Замыкания 20 минут)
// 1. Напишите функцию createCalculator, которая принимает начальное
// значение и возвращает объект с двумя методами: add и subtract.
// Метод add должен увеличивать значение на переданное число, а
// метод subtract должен уменьшать значение на переданное число.
// Значение должно быть доступно только через методы объекта, а не
// напрямую.

const createCalculator = (arg) => {
    return {
        add(numb) {
            console.log(arg + numb);
        },
        subtract: function (numb) {
            console.log(arg - numb);
        },
    };
};

const calc = createCalculator(20);
calc.add(8);
calc.subtract(7);