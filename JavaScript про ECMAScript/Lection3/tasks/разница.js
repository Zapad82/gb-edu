// Объект робот-пылесос
const Djaiv = {
    // Обновляем свойства под конкретную модель.
    model: "Djaiv-1",
    power: 250,
    batterySize: 2500,
    workTime: 50,


    // Переопределим метод startCleaning.
    startCleaning: function () {
        this.counterOfStarts++;
        // Добавим дополнительный вывод, чтобы знать чей метод мы вызвали.
        console.log('I am the method of Djav');
        console.log('I am Djav, and I am cleqning... I have been started: ', this.counterOfStarts, 'times.');
    },

    
        // Делаем ссылку на прототип от родителя.
        __proto__: DancingSeries,
}



// Объявление базового родительского объекта смотри в листинге 1.
// Объявление DancingSeries смотри в листинге 2
// Объект Samba смотри в листинге 3.
// Объект Djav смотри в листинге 5

// Вызов методов объекта
Samba.startCleaning();
// I am the method of VacuumCleaner
// 'I am cleaning... I have been started: 1 times.'

Djaiv.startCleaning();
// I am the method of Djav
// 'I am Djav, and I am cleqning... I have been started: 1 times.'


// Мы можем видеть, что объект Samba использует родительский метод и он не изменился, а Djav использует свой обычный метод.