// Задание 4 (тайминг 25 минут)
// 1. Дан массив const arr = [2, 5, 9, 15, 1, 4];
// Выведите в консоль те элементы массива, которые больше 3-х, но
// меньше 10.
const arr = [2, 5, 9, 15, 1, 4];
// for (let i=0; i < arr.length; i++) {
//     if(arr[i] > 3 && arr[i] < 10) {
//         console.log(arr[i]);
//     }
// }
const resfilter = arr.filter((el) => el > 3 && el < 10)
console.log(resfilter);


// 1. Найдите сумму четных чисел от 2 до 100.
// let sum = 0;
// for(let i=0; i <= 100; i+=2) {
//     sum += i;
// }
// console.log(sum);

const arr1 = Array(50).fill(0);
console.log(arr1);
const arrTotal = arr1.map((_,i) => 2 + i * 2);
console.log(arrTotal);
const sum = arrTotal.reduce((acc, el) => acc + el, 0);
console.log(sum); 





// 2. Дан массив const = [2, 5, 9, 3, 1, 4];
// Найдите сумму элементов этого массива.
// 1. С помощью цикла сформируйте строку '-1-2-3-4-5-6-7-8-9-'.
let str = '-';
for(let i = 1; i <= 9; i++) {
    str += i;
    str += "-";
}
console.log('str :>> ', str);




// 2. Дан массив с числами. const = [2, 5, 9, 0, 3, 1, 4]; Запустите цикл,
// который будет по очереди выводить элементы этого массива в
// консоль до тех пор, пока не встретится элемент со значением 0.
// После этого цикл должен завершить свою работу.
const arr3 = [2, 5, 9, 0, 3, , 4];
for (let i = 0; i < arr3.length; i++) {
    if (arr3[i] === 0) {
        break;
    }
    console.log('arr3[i] :>> ', arr3[i]);
}
