// Объект Romba - робот-пылесос. Код самого объекта смотри в листинге 1.

// Обращение к свойствам объекта.
console.log(Romba.model); // "Romba-1"
console.log(Romba.isFull); // false

// Вызов методов объекта.
setTimeout(Romba.startCleaning, 1000);

// Установим свойства  объекта isUVLamp в true, чтобы продемонстрировать результат работы метода switchUVLamp.
Romba.switchUVLamp = true;

// Результат вызова следующего метода зависит от значения, хранящегося в свойстве объекта, а также от того, как этот метод был вызван.
setTimeout(Romba.switchUVLamp, 2000);

setTimeout(Romba.goCharge, 3000);

// I am cleaning... I have started: NaN times.
// UV lamp is working.
// I am going to charge...