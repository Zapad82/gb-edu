/*
Задание 2 (20минут)
1. Создайте объект Animal со свойством name и методом eat(), который
выводит сообщение о том, что животное ест. Создайте объект Dog со
свойством name и методом bark(), который выводит сообщение о
том, что собака лает. Используйте одалживание метода eat() из
объекта Animal для объекта Dog, чтобы вывести сообщение о том,
что собака ест.
// Одалживание метода eat() из объекта Animal к объекту Dog
Dog.eat = Animal.eat;
Dog.eat(); // Вывод: Rex is eating.
*/

const Animal = {
    name: this.name,
    eat() {
        console.log(`${this.name} is eating`);
    },
};

const Dog = {
    name: this.name,
    bark() {
        console.log(`${this.name} is barking`);
    }
}

Dog.name = "Гав-гавыч";
Dog.eat = Animal.eat;
Dog.eat();
