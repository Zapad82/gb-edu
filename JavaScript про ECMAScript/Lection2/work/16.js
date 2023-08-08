const Romba = { // Есть негласное правило называть объекты в алгоритмах с большой буквы.
    // Обычно снчала объявляют свойства объекта.
    model: "Romba-1",
    power: 200,
    batterySize: 2100,
    boxSize: 0.5,
    workTime: 45,
    counterOfStarts: 0,
    isFull: false,
    isObstacle: false,
    isUVLampOn: false,

    // После свойств объявляют его методы.
    startCleaning: () => {
        this.counterOfStarts++;
        console.log('I am cleaning... I have started: ', this.counterOfStarts, 'times.');
    },
    goCharge: () => {
        console.log('I am going o charge...');
    },
    switchUVLampOn: () => {
        this.isUVLampOn = !this.isUVLampOn;
        console.log(`UV lamp ${this.isUVLampOn}`);
        console.log(`UV lamp is ${this.isUVLampOn ? 'working' : 'not working'}.`);
    }
};


// Объект Romba - робот-пылесос. Код такого объекта смотри в листинге 16 с использванием синтаксиса ES2015.

//Вызов меодов объекта.
Romba.startCleaning(); // I am cleaning... I have started: NaN times.
Romba.startCleaning.call(Romba); // I am cleaning... I have started: NaN times.
Romba.startCleaning.apply(Romba); // I am cleaning... I have started: NaN times.
const bindedMethod = Romba.startCleaning.bind(Romba);
bindedMethod(); // // I am cleaning... I have started: NaN times.


setTimeout(Romba, startCleaning. bind(Romba), 1000); // I am cleaning... I have started: NaN times. но почему NaN?

//////





const Stand = {
    model: "Stand-1",
    robots: ['Romba-1', 'Tango-1', 'Samba-1', 'Romba-2'],
    // Метод с использованием стрелочной функции в качестве функции обратного вызова.
    startTestingArrow: function () {
        console.log('Start testing...');
        this.robots.forEach((value) => {
            console.log('stand: ', this.model, 'is testing robot: ', value);
        })
    },
    // Метод с использованием классической функции в качестве функции обратного вызова.
    startTestingClassic: function () {
        console.log('Start testing...');
        this.robots.forEach(function (value) {
            console.log('stand: ', this.model, 'is testing robot: ', value);
        })
    },
};



Stand.startTestingArrow();
// Start testing...
// stand: Stand-1 is testing robot: Romba-1
// stand: Stand-1 is testing robot: Tango-1
// stand: Stand-1 is testing robot: Samba-1
// stand: Stand-1 is testing robot: Romba-2
Stand.startTestingClassic();
// Start testing...
// stand: undefined is testing robot: Romba-1
// stand: undefined is testing robot: Tango-1
// stand: undefined is testing robot: Samba-1
// stand: undefined is testing robot: Romba-2