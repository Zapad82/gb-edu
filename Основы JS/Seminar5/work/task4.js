// Задание 4 (тайминг 30 минут)
// 1. Создайте объект riddles
// 2. Добавьте свойства question, answer
// 3. создайте метод askQuestion который спрашивает у пользователя
// вопрос question и сравнивает ответ с answer
// 4. Если ответил неверно, то в консоль выводится текст: “вы
// проиграли”
// 5. * По желанию, создать 2 подсказки, если пользователь ответил
// неверно


// const qwestion = 'Зимой и летом одним цветом?';
// const spoiler = ["зелёная", "колючая"];
// const answer = 'елка';

// const riddles = {
//     qwestion, 
//     spoiler, 
//     answer,
//     askQuestion: function() {
//         let userAnswer = prompt(this.qwestion);
//         if (userAnswer.toLowerCase().trim() === this.answer) {
//             alert ('good');
//         } else { 
//             for (let hint of this.spoiler) {
//                 alert(hint);
//                 userAnswer = prompt(this.qwestion);
//                 if (userAnswer.toLowerCase().replaceAll(' ', '') === this.answer) {
//                     alert('good');
//                     return;
//                 }
//             }
//             alert('false');
//         }
//     },
// };

// riddles.askQuestion();


class Riddles {
    constructor (question, spoiler, answer) {
        this.question = question;
        this.spoiler = spoiler;
        this.answer = answer;

    }
    askQuestion() {
        let userAnswer = prompt(this.question);
        if (userAnswer.toLowerCase().trim() === this.answer) {
            alert ('good');
        } else { 
            for (let hint of this.spoiler) {
                alert(hint);
                userAnswer = prompt(this.question);
                if (userAnswer.toLowerCase().replaceAll(' ', '') === this.answer) {
                    alert('good');
                    return;
                }
            }
            alert('false');
        }
    }
}

const question = 'Зимой и летом одним цветом?';
const spoiler = ["зелёная", "колючая"];
const answer = 'елка';

const riddle = new Riddles(question, spoiler, answer);
console.log(riddle);
riddle.askQuestion();