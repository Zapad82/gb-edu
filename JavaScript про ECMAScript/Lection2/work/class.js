// Класс робот-пылесос
class RobotVacuumCleaner {
    // Свойства класса
    model = "Romba-1";
    power = 200;
    batterySize = 2100;
    boxSize = 0.5;
    workTime = 45;
    counterOfStarts = 0;
    isFull = false;
    isObstacle = false;
    isUVLampOn = false;

    // Конструктор класса, мы изучим его подробнее на следующем уроке.
    constructor () {

    }

    // Методы класса
    startCleaning() {
        this.counterOfStarts++;
        console.log('I am cleaning... I have been started: ', this.counterOfStarts, 'times.');
    }

    goCharge() {
        console.log('I am going to charge...');
    }

    switchUVLamp() {
        this.isUVLampOn = !this.isUVLampOn;
        console.log(`UV lamp is ${this.isUVLampOn ? 'working' : 'not working'}.`);
    }
}

// Создадим экземпляр класса.
const Romba = new RobotVacuumCleaner();


///////



// Обращение к свойствам объекта.
console.log(Romba.model); // "Romba-1"
console.log(Romba.isFull); // false

// Отложенный вызов методов объекта
setTimeout(Romba.startCleaning, 1000);

// Установим свойства объекта isUVLampOn в true, чтобы продемонстрировать роезультат работы метода switchUVLamp.
Romba.isUVLampOn = true;

setTimeout(Romba.switchUVLampOn, 2000);

setTimeout(Romba.goCharge, 3000);

// I am cleaning... I have started: NaN times.
// UV lamp is working.
// I am going to charge...




// 21



// Класс робот-пылесос
class RobotVacuumCleaner {
    // Свойства класса
    model = "Romba-1";
    power = 200;
    batterySize = 2100;
    boxSize = 0.5;
    workTime = 45;
    counterOfStarts = 0;
    isFull = false;
    isObstacle = false;
    isUVLampOn = false;

    // Используем его, чтобы привязать все методы класса к контексту - текущему объекту (this).
    constructor() {
        this.startCleaning = this.startCleaning.bind(this);
        this.goCharge = this.goCharge.bind(this);
        this.switchUVLamp = this.switchUVLamp.bind(this);
    }

    // Методы класса.
    startCleaning() {
        this.counterOfStarts++;
        console.log('I am cleaning... I have been sarted: ', this.counterOfStarts, 'times.');
    }

    goCharge() {
        console.log('I am going to charge...');
    }

    switchUVLamp() {
        this.isUVLampOn = !this.isUVLampOn;
        console.log(`UV lamp is ${this.isUVLampOn ? 'working' : 'not working'}.`);
    }
}

// Создадим экземпляр класса.
const Romba = new RobotVacuumCleaner();

////////22


// Обращение к свойствам объекта.
console.log(Romba.model); // "Romba-1"
console.log(Romba.isFull); // false

// Отложенный вызов методов объекта
setTimeout(Romba.startCleaning, 1000);

// Установим свойства объекта isUVLampOn в true, чтобы продемонстрировать роезультат работы метода switchUVLamp.
Romba.isUVLampOn = true;

setTimeout(Romba.switchUVLampOn, 2000);

setTimeout(Romba.goCharge, 3000);

// I am cleaning... I have started: 1 times.
// UV lamp is working.
// I am going to charge...



/////// 24

// Класс робот-пылесос
class RobotVacuumCleaner {
    // Свойства класса
    model = "Romba-1";
    power = 200;
    batterySize = 2100;
    boxSize = 0.5;
    workTime = 45;
    counterOfStarts = 0;
    isFull = false;
    isObstacle = false;
    isUVLampOn = false;

    // Используем его, чтобы привязать все методы класса к контексту - текущему объекту (this).
    constructor() {
        this.startCleaning = this.startCleaning.bind(this);
        this.goCharge = this.goCharge.bind(this);
        this.switchUVLamp = this.switchUVLamp.bind(this);
    }

    // Методы класса.
    startCleaning = () => {
        this.counterOfStarts++;
        console.log('I am cleaning... I have been sarted: ', this.counterOfStarts, 'times.');
    }

    goCharge = () => {
        console.log('I am going to charge...');
    }

    switchUVLamp = () => {
        this.isUVLampOn = !this.isUVLampOn;
        console.log(`UV lamp is ${this.isUVLampOn ? 'working' : 'not working'}.`);
    }
}

// Создадим экземпляр класса.
const Romba = new RobotVacuumCleaner();



////////



// Обращение к свойствам объекта.
console.log(Romba.model); // "Romba-1"
console.log(Romba.isFull); // false

// Отложенный вызов методов объекта
setTimeout(Romba.startCleaning, 1000);

// Установим свойства объекта isUVLampOn в true, чтобы продемонстрировать роезультат работы метода switchUVLamp.
Romba.isUVLampOn = true;

setTimeout(Romba.switchUVLampOn, 2000);

setTimeout(Romba.goCharge, 3000);

// I am cleaning... I have started: 1 times.
// UV lamp is working.
// I am going to charge...