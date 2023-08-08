// Объект Romba - робот-пылесос. Код самого объекта в листинге 1
// Объект робот-пылесос модель Tango.
const Tango = { // Есть негласное правило называть объекты в алгоритмах с большой буквы.
    // Обычно сначала объявляют свойства объекта.
    model: "Tango-1",
    power: 300,
    batterySize: 200,
    boxSize: 0.7,
    workTime: 60,
    counterOfStarts: 0,
    isFull: false,
    isObstacle: false,
    isUVLampOn: false,

    // После свойств объявляют его методы. А так как методы у новой модели такие же, как и у тарой, давайте позаимствуем их у объекта Romba.
    startCleaning: Romba.startCleaning,
    goCharge: Romba.goCharge,
    switchUVLamp: Romba.switchUVLamp,
};


/////


// Обращение к свойствам объекта Tango
console.log(Tango.model); // "Tango-1"
console.log(Tango.isFull); // false

// Вызов методов объекта.
Tango.startCleaning(); // 'I am cleaning... I have been started: 1 times.'

// Установим свойства объекта isUVLamp в true, чтобы продемонстрировать результат работы метода switchUVLamp.
Tango.isUVLampOn = true;

// Результат вызова следующего метода зависит от значения, хранящегося в свойстве объекта, а также от того, как этот метод был вызван.
Tango.switchUVLamp(); // 'UV lamp is not working.'

Tango.goCharge(); // 'I am going ti charge...'


///////
const Samba = {
    model "Samba-1",
    power: 300,
    batterySize: 200,
    boxSize: 0.7,
    workTime: 60,
    counterOfStarts: 0,
    isFull: false,
    isObstacle: false,
    isUVLampOn: false,

    // На этот раз мы не будем создавать методы в объекте, мы постараемся их заимствовать непосредственно перед использованием
};


/////

// Обращение к свойствам объекта Samba.
console.log(Samba.model); // "Samba-1"
console.log(Samba.isFull); // false
// Одолжим методы из объекта Romba
Samba.startCleaning = Romba.startCleaning;
Samba.switchUVLamp = Romba.switchUVLamp;
Samba.goCharge = Romba.goCharge;

// Вызов методов объекта.
Samba.startCleaning(); // 'I am cleaning... I have been started: 1 times.'

// Установим свойства объекта isUVLamp в true, чтобы продемонстрировать результат работы метода switchUVLamp.
Samba.switchUVLamp(); // 'UV lamp is not working.'

Samba.goCharge; // 'I am going to charge...'
