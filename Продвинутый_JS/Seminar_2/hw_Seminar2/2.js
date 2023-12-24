"use strict";

/*
###Задание 2
Вы разрабатываете систему отзывов для вашего веб-сайта. Пользователи могут 
оставлять отзывы, но чтобы исключить слишком короткие или слишком длинные 
сообщения, вы решаете установить ограничение, отзыв должен быть не менее 50 
символов в длину и не более 500. В случае неверной длины, необходимо выводить 
сообщение об ошибке, рядом с полем для ввода.

Создайте HTML-структуру. 
На странице должны отображаться товары, под каждым товаром должен быть список 
отзывов на данный товар. Под каждым списком отзывов должна быть форма, где можно
добавить отзыв для продукта.

При добавлении отзыва, он должен отображаться на странице под предыдущими 
отзывами, а не заменять их.
Массив initialData должен использоваться для начальной загрузки данных 
при запуске вашего приложения.

Каждый отзыв должен иметь уникальное id, для упрощения, используем `Date.now()`.

ВНИМАНИЕ! Если вы не проходили на курсе работу с DOM, то можно это задание не 
делать, пока рано.
*/

const initialData = [
  {
    product: "Apple iPhone 13",
    reviews: [
      {
        id: Date.now(),
        text: "Отличный телефон! Батарея держится долго.",
      },
      {
        id: Date.now(),
        text: "Камера супер, фото выглядят просто потрясающе.",
      },
    ],
  },
  {
    product: "Samsung Galaxy Z Fold 3",
    reviews: [
      {
        id: Date.now(),
        text: "Интересный дизайн, но дорогой.",
      },
    ],
  },
  {
    product: "Sony PlayStation 5",
    reviews: [
      {
        id: Date.now(),
        text: "Люблю играть на PS5, графика на высоте.",
      },
    ],
  },
];

    // Функция добавления отзывов из InitialData
    function addInitialReviews(product, reviews) {
      const reviewsList = document.getElementById(`reviews_${product}`);
      reviews.forEach(review => {
        const li = document.createElement('li');
        li.textContent = review.text;
        reviewsList.appendChild(li);
      });
    }

    // Добавление первоначальных отзывывов при загрузке страницы.
    initialData.forEach(data => {
      addInitialReviews(data.product.split(' ').join('_'), data.reviews);
    });

    // Здесь должен находиться ваш код JavaScript для добавления отзывов и обработки отправки форм.
    function addReview(product) {
      const input = document.getElementById(`reviewInput_${product}`);
      const error = document.getElementById(`error_${product}`);

      if (input.value.length < 50 || input.value.length > 500) {
        error.textContent = "Отзыв должен быть от 50 до 500 символов."; // Отображение сообщения об ошибке
      } else {
        error.textContent = ""; // Очистить сообщение об ошибке
        const reviewsList = document.getElementById(`reviews_${product}`);
        const li = document.createElement('li');
        li.textContent = input.value;
        reviewsList.appendChild(li); // Добавляем отзыв в список
        input.value = "";
      }
    }

    // Прослушиватели событий для отправки формы
    document.getElementById('reviewForm_Apple_iPhone_13').addEventListener('submit', function(event) {
      event.preventDefault();
      addReview('Apple_iPhone_13');
    });

    document.getElementById('reviewForm_Samsung_Galaxy_Z_Fold_3').addEventListener('submit', function(event) {
      event.preventDefault();
      addReview('Samsung_Galaxy_Z_Fold_3');
    });

    document.getElementById('reviewForm_Sony_PlayStation_5').addEventListener('submit', function(event) {
      event.preventDefault();
      addReview('Sony_PlayStation_5');
    });