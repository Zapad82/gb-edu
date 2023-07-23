// function helloName(name) {
//     console.log(name);
// }

// helloName('Андрей');

// function counter() {
//     return count++;
// }

// console.log(count);



// let age = Number(prompt('Сколько Вам лет?'));

// const lvlUpAge = () => age + 5;

// console.log(`Через 5 лет вам будет ${lvlUpAge()}`);



// const sum = (param1, param2) => {
//     return param1 + param2;
// }

// console.log(sum(2, 5));

// const salary = (money) => {
//     money = money * 0.87; 
//     return money * 0.75;
// }

// const userMoney = Number(prompt('Сколько ты зарабабываешь?'));

// let moneyMonth = salary(userMoney);

// console.log(`Для расходов можно использовать ${salary(userMoney)}`);
// console.log(`На еду желательно потратить не более, чем ${moneyMonth * 0.3}`);


// function sayHello() {
//     alert('Привет');
//     alert('Нажали на кнопку');
// }

//Игра в загадки

// const userAnswer = promt('Зимой и летом одним цветом'); 
// if (userAnswer === 'елка') {
//     console.log('Угадал');
// } else {
//     console.log('Не угадал');
// }



function askQuestion(answer, question) {
    const userAnswer = prompt(question);

    if (userAnswer.toLowerCase() === answer) {
        console.log('Угадал');
    } else {
        console.log('Не угадал');
    }
}


function puzzle() {
    askQuestion('лук', 'Сидит дед во 100 шуб одет, кто его раздевает, тот Алеша');
    askQuestion('елка', 'Зимой и летом одним цветом');
}
