// Получаем все пункты меню
var menuItems = document.querySelectorAll('.menu__link');

// Добавляем обработчик события клика на каждый пункт меню
menuItems.forEach(function(item) {
    item.addEventListener('click', function() {
        // Удаляем класс 'active' у всех пунктов меню
        menuItems.forEach(function(item) {
            item.classList.remove('active');
        });
        // Добавляем класс 'active' к выбранному пункту меню
        item.classList.add('active');
    });
});