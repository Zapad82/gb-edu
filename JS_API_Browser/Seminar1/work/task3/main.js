document.addEventListener('DOMContentLoaded', function() {
  const articlesList = document.getElementById('articlesList');
  const addArticleButton = document.getElementById('addArticleButton');

  let articles = JSON.parse(localStorage.getItem('articles')) || [
    { "id": 1, "title": "Первая статья", "content": "Содержание первой статьи..." },
    { "id": 2, "title": "Вторая статья", "content": "Содержание второй статьи..." }
  ];

// Функция для отображения списка статей
function displayArticles(articles) {
  articlesList.innerHTML = '';
  articles.forEach(article => {
    const card = document.createElement('div');
    card.classList.add('card', 'mb-3');

    const cardBody = document.createElement('div');
    cardBody.classList.add('card-body');

    const title = document.createElement('h2');
    title.classList.add('card-title');
    title.textContent = article.title;

    const content = document.createElement('p');
    content.classList.add('card-text');
    content.textContent = article.content;

    const deleteButton = document.createElement('button');
    deleteButton.classList.add('btn', 'btn-danger', 'delete-article');
    deleteButton.setAttribute('data-id', article.id);
    deleteButton.textContent = 'Удалить';

    const editButton = document.createElement('button');
    editButton.classList.add('btn', 'btn-primary', 'edit-article');
    editButton.setAttribute('data-id', article.id);
    editButton.textContent = 'Редактировать';

    cardBody.appendChild(title);
    cardBody.appendChild(content);
    cardBody.appendChild(deleteButton);
    cardBody.appendChild(editButton);

    card.appendChild(cardBody);
    articlesList.appendChild(card);
  });
}

  // Отображаем начальный список статей при загрузке страницы
  displayArticles(articles);

  // Обработчик события для добавления новой статьи
  addArticleButton.addEventListener('click', function() {
    const newArticleId = articles.length + 1;
    const newArticle = { "id": newArticleId, "title": "Новая статья", "content": "Введите содержание статьи..." };
    articles.push(newArticle);
    localStorage.setItem('articles', JSON.stringify(articles)); // Сохраняем изменения в локальное хранилище
    displayArticles(articles);
  });

  // Обработчик события для удаления и редактирования статьи
  articlesList.addEventListener('click', function(event) {
    if (event.target.classList.contains('delete-article')) {
      const articleId = parseInt(event.target.getAttribute('data-id'));
      articles = articles.filter(article => article.id !== articleId);
      localStorage.setItem('articles', JSON.stringify(articles)); // Сохраняем изменения в локальное хранилище
      displayArticles(articles);
    }

    if (event.target.classList.contains('edit-article')) {
      const articleId = parseInt(event.target.getAttribute('data-id'));
      const editedTitle = prompt("Введите новый заголовок статьи:");
      const editedContent = prompt("Введите новое содержание статьи:");
      articles.forEach(article => {
        if (article.id === articleId) {
          article.title = editedTitle;
          article.content = editedContent;
        }
      });
      localStorage.setItem('articles', JSON.stringify(articles)); // Сохраняем изменения в локальное хранилище
      displayArticles(articles);
    }
  });
});