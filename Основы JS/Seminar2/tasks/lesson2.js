// const yourAge = Number(prompt('Какой Ваш возвраст', 'Введите число'));
// // const yourAge = +prompt('Какой Ваш возвраст', 'Введите число');
// alert(yourAge);
// const yourName= String(prompt('Как вас зовут', ''));
// alert(yourName);


// const num = 10;
// if (num > 15) {
//     console.log('Число больше 15');
// } else if (num > 15) {
//     console.log('Число меньше 15');
// } else {
//     console.log('Число равно 15');    
// }


// const num = 91;

// switch (true) {
//     case num > 15:
//         console.log('Число больше 15');
//         break;
//     case num < 15:
//         console.log('Число меньше 15');
//         break;
//     default:
//         console.log('Число меньше 15');
//         break;    
//     }

const num = 15;
console.log((num > 15) ? `${num} больше 15`
            : (num < 15) ? `${num} меньше 15`
            : `${num} равно 15`);