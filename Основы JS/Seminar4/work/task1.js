// Задание 1 (тайминг 20 минут)
// Текст задания
// 1. Создайте массив с элементами 1, 2, 3. Выведите на экран
// каждый из этих элементов.
const elements = [1, 2, 3];
console.log(elements[0]);
console.log(elements[1]);
console.log(elements[2]);

elements.forEach((el, index, arr) => {
    console.log(el, index, arr);
})


// 2. Создайте массив с произвольными элементами.
// Выведите на экран количество элементов в этом
// массиве.
const elements2 = ["a", 3, "4", "b", 5];
console.log(elements2.length);


// 3. Создайте массив с элементами 'a', 'b', 'c'. Запишите вместо
// первого элемента число 1, вместо второго - 2, вместо
// третьего - 3.
const elements3 = ["a", "b", "c"];
elements3[0] = 1;
elements3[1] = 2;
elements3[2] = 3;
console.log(elements3);

