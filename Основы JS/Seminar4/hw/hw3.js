// Используя Math.random() вам необходимо генерировать цифры от 0 до 9, и создать массив состоящий из 5 таких элементов
// 1. Рассчитать сумму элементов этого массива
// 2. Найти минимальное число
// 3. Найти есть ли в этом массиве число 3

const generateArray = (length, max) => (
    [...new Array(length)]
      .map(() => Math.round(Math.random() * max))
  );

const numbers = generateArray(5, 9);
console.log(`Сгенерирован следующий массив: ${numbers}`);

let sum = 0;
for (i = 0; i < numbers.length; i++) {
    sum = sum + numbers[i];
}
console.log(`Сумма чисел массива равна: ${sum}`);

const minValue = Math.min.apply(null, numbers);
console.log(`Минимальное значение в массиве это число: ${minValue}`);

if (numbers.includes(3)) {
    console.log("В массиве присутствует число 3")
} else {
    console.log("В массиве нет числа 3.")
}