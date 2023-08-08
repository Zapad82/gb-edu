// Обращение к свойствам объекта.
// Идет по цепочке вверх
console.log(Samba.model); // "Samba-1"
console.log(Samba.isFull); // false

// Вызов методов объекта.
Samba.startCleaning();
// I am the method of VacuumCleaner
// 'I am cleaning... I have been started: 1 times.'

Samba.isVacuumOn = true;
Samba.switchUVLamp();
// I am the method of DancingSeries
// 'UV lamp is not working.'

Samba.goCharge();
// I am the method of VacuumCleaner
// 'I am going to charge...'