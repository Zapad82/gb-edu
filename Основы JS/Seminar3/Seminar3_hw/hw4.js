// Необходимо реализовать четыре функции, каждая функция должна принимать по два числа и выполнять одну из операций 
// (каждая функция выполняет одну из них):

// 1. Сложение
// 2. Разность
// 3. Умножение
// 4. Деление

// Необходимо сделать так, чтобы функция вернула число, например выражение console.log(sum(2, 6)); 
// должно вывести число 8 в консоль (sum - функция сложения в данном примере, ваши названия функций могут отличаться). 
// Округлять значения, которые возвращают функции не нужно, однако, обратите внимание на разность, 
// функция должна вычесть из большего числа меньшее, либо вернуть 0, 
// если числа равны. 
// Функциям всегда передаются корректные числа, проверки на NaN, Infinity делать не нужно.


function sumNumbers(num1, num2) {
    return(num1 + num2);
}

function difNumbers(num1, num2) {
    if (num1 > num2) {
        return (num1 - num2);
    } else if (num1 < num2) {
        return (num2 - num1);
    } else {
        return 0;
    }
}

function multNumbers(num1, num2) {
    return (num1 * num2);
}

function divNumbers (num1, num2) {
    return (num1 / num2);
}


console.log(`Сумма чисел 10 и 20 равна: ${sumNumbers(10, 20)}`);
console.log(`Разность чисел 10 и 20 равна: ${difNumbers(10, 20)}`);
console.log(`Умножение чисел 10 и 20 равна: ${multNumbers(10, 20)}`);
console.log(`Деление чисел 10 и 20 равна: ${divNumbers(10, 20)}`);