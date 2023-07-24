// Задание 2
// Пользователь вводит с клавиатуры число, если ввёл текст, необходимо вывести что значение задано неверно
// Создать фукнцию, которая высчитывает 13% от данного числа и выводит в консоль текст "Размер заработной платы за вычетом налогов равен значение"

const salaryBrutto = Number(prompt('Введиде Ваш размер зарплаты без учёта налогов:'));

function SalaryNetto (salaryBrutto) {
    if (Number.isNaN(salaryBrutto)) {
        return null;
        // alert('Вы ввели неверное значение!');
    } else {
        return(salaryBrutto - (salaryBrutto * 13 / 100));        
    }
}

//Убираем второй (системный) алерт
if (SalaryNetto(salaryBrutto) === null) {
    alert('Вы ввели неверное значение!');
} else {    
    alert(SalaryNetto(salaryBrutto));
}
