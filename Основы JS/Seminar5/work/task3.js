// Задание 3 (тайминг 15 минут)
// const obj = {
// key1: {
// key1: 1,
// key2: 2,
// key3: 3,
// },
// key2: {
// key1: 4,
// key2: 5,
// key3: 6,
// },
// key3: {
// key1: 7,
// key2: 8,
// key3: 9,
// },
// }
// Найдите сумму элементов приведенного объекта.

const obj = {
key1: {
key1: 1,
key2: 2,
key3: 3,
},
key2: {
key1: 4,
key2: 5,
key3: 6,
},
key3: {
key1: 7,
key2: 8,
key3: 9,
},
}

// let sum = 0;
// for (const key in Object) {
//     for (const element in obj[key]) {
//         sum += obj[key][element]
//     }
    
// }
// console.log(sum);

// const values = Object.values(obj);

// const arrayNumber = [].concat(...values.map((el) => 
//  Object.values(el)));

// // []  + [1 2 3] [4 5 6] [7 8 9]

// const sum = arrayNumber.reduce((acc, element) => acc + element, 0);
// console.log(sum);


const values = Object.values(obj);
const array = values.reduce((array, element) => array.concat(Object.values(element)), []);
// array = [];
// [] + [1,2,3] = [1,2,3] // +concat  - это +
// [1,2,3] + [4,5,6] = [1,2,3,4,5,6]
// [1,2,3,4,5,6] concat [7,8,9] = [1,2,3,4,5,6,7,8,9]
console.log(array);