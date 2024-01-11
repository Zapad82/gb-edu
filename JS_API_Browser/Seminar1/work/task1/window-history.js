// Управление историей переходов:
// Используйте объект history для управления историей переходов на веб-странице. Создайте кнопки "Назад" и "Вперед" для перемещения по истории.

// Получаем объект history
var history = window.history;

// Функция для добавления нового состояния истории
function addHistoryState(state) {
  history.pushState(state, null, null);
}

// Функция для перемещения на предыдущее состояние истории
function goBack() {
  history.back();
}

// Функция для перемещения на следующее состояние истории
function goForward() {
  history.forward();
}

// Добавляем новые состояния истории при загрузке страницы
addHistoryState({ pageTitle: "Страница 1" });
addHistoryState({ pageTitle: "Страница 2" });
addHistoryState({ pageTitle: "Страница 3" });

// Добавляем обработчики событий для кнопок "Назад" и "Вперед"
document.getElementById("backButton").addEventListener("click", goBack);
document.getElementById("forwardButton").addEventListener("click", goForward);