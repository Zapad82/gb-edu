// Обращение к свойствам объекта.
console.log(Romba.model); // "Romba-1"
console.log(Romba.isFull); // false

// Вызов методов объекта.
Romba.startCleaning(); // 'I am cleaning... I have been started: 1 times.'

// Установим свойства объекта isUVLampOn в true, чтобы продемонстрировать результат работы метода switchUVLamp.
Romba.isUVLampOn = true;

// Результат вызова следующего метода зависит от значения, хранящегося в свойстве объекта, а также от того, как этот метод был вызван  (об этом поговорим чуть ниже).
Romba.switchUVLamp(); // 'UV lamp is not working.'

Romba.goCharge(); // 'I am going to charge...'