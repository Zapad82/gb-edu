/*
Необязательная задача

Необходимо реализовать отрисовку 10 картинок собак из API https://dog.ceo/dog-api/ с интервалом в 3 секунды.

*/

const url = 'https://dog.ceo/api/breeds/image/random';
const div = document.querySelector('.wrapper');

function fetchDogImage() {
    fetch(url)
      .then(response => response.json())
      .then(data => {
        const imageUrl = data.message;
        // Создаем элемент <img> и устанавливаем полученный URL в атрибут src
        const image = document.createElement('img');
        image.src = imageUrl;
  
        // Добавляем элемент <img> на страницу
        document.body.appendChild(image);
      })
      .catch(error => {
        // Обрабатываем возможные ошибки
      });
  }
  
  let count = 0;
  const intervalId = setInterval(() => {
    fetchDogImage();
    count++;
  
    // Если получено уже 10 картинок, останавливаем интервал
  if (count === 10) {
    clearInterval(intervalId);
  }
}, 3000);