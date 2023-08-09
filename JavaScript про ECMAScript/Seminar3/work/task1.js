/*
Напишите функцию getPrototypeChain(obj), которая будет
возвращать цепочку прототипов для заданного объекта
obj. Функция должна вернуть массив прототипов, начиная
от самого объекта и заканчивая глобальным объектом
Object.prototype.
*/

const getPrototypeChain = (obj) => {
    let prototypes = [];

    while (obj !== null) {
        prototypes.push(obj);
        obj = Object.getPrototypeOf(obj);
    }

    return prototypes;
};

console.log(getPrototypeChain({arg1: 100500}));