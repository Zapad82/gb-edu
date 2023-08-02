// Задание 1 (тайминг 20 минут)
// 1. Создайте функцию mergeArrays, которая принимает два
// массива и возвращает новый массив, содержащий все
// элементы из обоих массивов. Используйте spread
// оператор для объединения массивов.
// mergeArrays([1, 2, 3], [4, 5, 6]); // Ожидаемый результат: [1,
// 2, 3, 4, 5, 6]

const mergeArrays = (arr1, arr2) => {
    return [...arr1,...arr2]
}
console.log(mergeArrays([1, 2, 3], [4, 5, 6]));



// 2. Создайте функцию removeDuplicates, которая принимает
// любое количество аргументов и возвращает новый
// массив, содержащий только уникальные значения.
// Используйте rest оператор для сбора всех аргументов в
// массив а затем filter для определения дубликатов.
// removeDuplicates(1, 2, 3, 2, 4, 1, 5); // Ожидаемый
// результат: [1, 2, 3, 4, 5]

// const removeDuplicates = (...numbs) => {
//     const arr = [...numbs];
//     return arr.filter((el, index) => {
//         return arr.indexOf(el) === index;
//     });
    
// }

// console.log(removeDuplicates(1, 2, 3, 2, 4, 1, 5));


const removeDuplicates = (...numbs) => {
    const uniqArr = [...new Set([...numbs])];
    return uniqArr;
};
console.log(removeDuplicates(1, 2, 3, 2, 4, 1, 5));
