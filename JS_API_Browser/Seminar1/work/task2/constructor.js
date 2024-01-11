// Вы должны создать веб-страницу, которая позволяет пользователю динамически
// управлять элементами на странице. Ниже приведены основные требования и
// функциональность:
// 1. На странице должны быть кнопки "Добавить элемент", "Удалить элемент" и
// "Клонировать элемент".
// 2. При нажатии на кнопку "Добавить элемент" на страницу добавляется новый
// квадратный элемент (<div>) с размерами 100x100 пикселей. Этот элемент
// должен иметь класс .box и содержать текст, указывающий порядковый номер
// элемента (1, 2, 3 и так далее).
// 3. При нажатии на кнопку "Удалить элемент" удаляется последний добавленный
// элемент, если таковой имеется.
// 4. При нажатии на кнопку "Клонировать элемент" создается копия последнего
// добавленного элемента и добавляется на страницу.
// 5. Все элементы имеют класс .box и стилизованы с помощью CSS (см. пример).
// 6. Элементы могут быть добавлены, удалены и клонированы в любом порядке и в
// любом количестве.

// Получаем кнопки для управления элементами


// Начальное количество элементов
let counter = 3;

// Добавляем обработчик события для кнопки "Добавить"
document.getElementById('addButton').addEventListener('click', function() {
  // Увеличиваем счетчик
  counter++;

  // Создаем новый элемент
  let newBox = document.createElement('div');
  newBox.className = 'box';
  newBox.style.width = '100px';
  newBox.style.height = '100px';
  newBox.textContent = counter;

  // Добавляем новый элемент в контейнер
  document.getElementById('container').appendChild(newBox);
});

// Добавляем обработчик события для кнопки "Удалить"
document.getElementById('removeButton').addEventListener('click', function() {
  // Получаем все элементы с классом "box"
  let boxes = document.getElementsByClassName('box');

  // Если есть элементы для удаления, удаляем последний и уменьшаем счетчик
  if (boxes.length > 0) {
    document.getElementById('container').removeChild(boxes[boxes.length - 1]);
    counter--;
  }
});

// Добавляем обработчик события для кнопки "Клонировать"
document.getElementById('cloneButton').addEventListener('click', function() {
  // Получаем все элементы с классом "box"
  let boxes = document.getElementsByClassName('box');

  // Если есть элементы для клонирования, клонируем последний и увеличиваем счетчик
  if (boxes.length > 0) {
    let clonedBox = boxes[boxes.length - 1].cloneNode(true);
    counter++;
    clonedBox.textContent = counter;
    document.getElementById('container').appendChild(clonedBox);
  }
});
