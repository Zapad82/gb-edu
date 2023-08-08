// Объект робот-пылесос
const MusicSeries = {
    // Обновляем новые свойства и переопределяем свойство model.
    model: "music series",
    power: 250,
    batterySize: 2100,
    boxSize: 0.5,
    workTime: 50,

    // Добавляем новый метод
    startWipe: function() {
        // Добавим дополнительный вывод, чтобы знать чей метод мы вызвали.
        console.log('I am the method of MusicSeries');
        console.log('I am starting to wipe the floor...');
    },

    // Делаем ссылку на прототип родителя
    __proto__: VacuumCleaner,
};


// Для начала создадим объект серии

// Объект робот-пылесос.
const Blues = {
    // Обновляем новые под конкретную модель.
    model: "Blues-1",
    power: 250,
    batterySize: 2100,
    workTime: 50,
};

// Установим прототип для робота
Object.setPrototypeOf(Blues, MusicSeries);

// Теперь можем попробовать вызвать методы наших роботов, проверяя кто является их прототипом:
// Объявление базового родительского объекта смотри в листинге 1.
// Объявление DancingSeries смотри в листинге 2
// Объект Samba смотри в листинге 3.
// Объект Djav смотри в листинге 5.
// Объект MusicSeries смотри в листинге 10.
// Объект Blues смотри а листинге 11.
if (Object.getPrototypeOf(Djaiv).model === 'dancing series') {
    Djaiv.startCleaning(); //
}

// Если мы не будем проверять прототип и просто вызовем метод чужого прототипа, мы, естественно, получим ошибку.
Djaiv.startWipe(); // Uncaught TypeError: Djaiv.startWipe is not a function 