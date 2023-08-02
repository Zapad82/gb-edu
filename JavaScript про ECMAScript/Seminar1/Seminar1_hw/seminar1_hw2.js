/* Напишите функцию createCounter, которая создает счетчик и возвращает объект 
с двумя методами: increment и decrement. Метод increment должен увеличивать 
значение счетчика на 1, а метод decrement должен уменьшать значение счетчика на 1.
Значение счетчика должно быть доступно только через методы объекта, а не напрямую. */


const createCounter = (arg) => {
    return {
        increment(numb) {
            console.log(arg + 1);
        },
        decrement(numb) {
            console.log(arg - 1);
        }
    };
};

counter.increment(10);
counter.decrement(10);