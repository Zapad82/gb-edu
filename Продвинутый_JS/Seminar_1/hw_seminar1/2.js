"use strict";

/*
###Задание 2
Вы управляете рестораном, в котором работают разные повара, специализирующиеся 
на определенных блюдах. Клиенты приходят и делают заказы на разные блюда.
Необходимо реализовать функцию newOrder. Создавать вспомогательные функции, 
коллекции, не запрещается. Старайтесь использовать коллекции Map/Set, где это 
актуально. Представленный ниже код должен работать.

Повара и их специализации:
Олег - специализация: Пицца.
Андрей - специализация: Суши.
Анна - специализация: Десерты.

Блюда, которые могут заказать посетители:
Пицца "Маргарита"
Пицца "Пепперони"
Пицца "Три сыра"
Суши "Филадельфия"
Суши "Калифорния"
Суши "Чизмаки"
Суши "Сеякемаки"
Десерт Тирамису
Десерт Чизкейк
*/

// Посетитель ресторана.
class Client {
  constructor(firstname, lastname) {
    this.firstname = firstname;
    this.lastname = lastname;
  }
}

// Вам необходимо реализовать класс, который управляет заказами и поварами.
class Manager {
  constructor() {
    this.orders = new Map();
    this.chefs = new Map([
      ["Пицца", "Олег"],
      ["Суши", "Андрей"],
      ["Десерт", "Анна"]
    ]);
    this.menu = new Map([
      ["Пицца", new Set(["Маргарита", "Пепперони", "Три сыра"])],
      ["Суши", new Set(["Филадельфия", "Калифорния", "Чизмаки", "Сеякемаки"])],
      ["Десерт", new Set(["Тирамису", "Чизкейк"])]
    ]);
  }

  newOrder(client, ...items) {
    const clientName = client.firstname + " " + client.lastname;
    if (this.orders.has(clientName)) {
      for (const item of items) {
        const type = item.type;
        const name = item.name;
        if (!this.menu.get(type).has(name)) {
          throw new Error(`Десерт "${name}" - такого блюда не существует.`);
        }
        const existingItems = this.orders.get(clientName);
        const existingItem = existingItems.find(i => i.name === name && i.type === type);
        if (existingItem) {
          existingItem.quantity += item.quantity;
        } else {
          existingItems.push(item);
        }
      }
    } else {
      for (const item of items) {
        const type = item.type;
        const name = item.name;
        if (!this.menu.get(type).has(name)) {
          throw new Error(`Десерт "${name}" - такого блюда не существует.`);
        }
      }
      this.orders.set(clientName, items);
    }

    console.log(`Клиент ${clientName} заказал:`);
    for (const item of this.orders.get(clientName)) {
      console.log(`${item.type} "${item.name}" - ${item.quantity}; готовит повар ${this.chefs.get(item.type)}`);
    }
  }
}

// Можно передать внутрь конструктора что-либо, если необходимо.
const manager = new Manager();

// Вызовы ниже должны работать верно, менять их нельзя, удалять тоже.
manager.newOrder(
  new Client("Иван", "Иванов"), 
  { name: "Маргарита", quantity: 1, type: "Пицца" },
  { name: "Пепперони", quantity: 2, type: "Пицца" },
  { name: "Чизкейк", quantity: 1, type: "Десерт" },
  
);
// Вывод:
// Клиент Иван заказал: 
// Пицца "Маргарита" - 1; готовит повар Олег
// Пицца "Пепперони" - 2; готовит повар Олег
// Десерт "Чизкейк" - 1; готовит повар Анна

// ---

const clientPavel = new Client("Павел", "Павлов");
manager.newOrder(
  clientPavel, 
  { name: "Филадельфия", quantity: 5, type: "Суши" },
  { name: "Калифорния", quantity: 3, type: "Суши" },
);
// Вывод:
// Клиент Павел заказал: 
// Суши "Филадельфия" - 5; готовит повар Андрей
// Суши "Калифорния" - 3; готовит повар Андрей

manager.newOrder(
  clientPavel, 
  { name: "Калифорния", quantity: 1, type: "Суши" },
  { name: "Тирамису", quantity: 2, type: "Десерт" },
);
// Вывод:
// Клиент Павел заказал: 
// Суши "Филадельфия" - 5; готовит повар Андрей
// Суши "Калифорния" - 4; готовит повар Андрей
// Десерт "Тирамису" - 2; готовит повар Анна

manager.newOrder(
  clientPavel, 
  { name: "Филадельфия", quantity: 1, type: "Суши" },
  { name: "Трубочка с вареной сгущенкой", quantity: 1, type: "Десерт" },
);
// Ничего не должно быть добавлено, должна быть выброшена ошибка:
// Десерт "Трубочка с вареной сгущенкой" - такого блюда не существует.