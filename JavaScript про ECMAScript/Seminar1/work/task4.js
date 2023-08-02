// Задание 4 (Лексический контекст 15 минут)
// 1. Напишите функцию createGreeting, которая принимает имя
// пользователя и возвращает функцию, которая будет выводить
// приветствие с использованием этого имени.
// // Пример использования:
// const greeting = createGreeting('John');
// greeting(); // Ожидаемый результат: "Hello, John!"

const createGreeting = (name) => {
    const greeting = (name) => `Hello, ${name}`;
    return greeting(name);
}

const greeting = createGreeting('John');
console.log(greeting);