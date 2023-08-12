/*
Задача

Необходимо получить список всех пользователей с помощью бесплатного API (https://jsonplaceholder.typicode.com/users) и отобразить их на странице. Пользователь должен иметь возможность удалить любого пользователя из списка. Данные при получении необходимо сохранить в локальное хранилище браузера localStorage. При удалении пользователь должен удаляться не только со страницы, но и из локального хранилища localStorage
*/

const url = 'https://jsonplaceholder.typicode.com/users';
const div = document.querySelector('.container');

fetch(url)
	.then(response => response.json())
	.then(users => {
        // Сохраняем полученный список пользователей в локальное хранилище
        localStorage.setItem('users', JSON.stringify(users));
        // Отображаем список пользователей на странице
        const usersContainer = document.getElementById('users-container');
        for (const user of users) {
            const userElement = document.createElement('div');
            userElement.textContent = user.name;

            const deleteButton = document.createElement('button');
            deleteButton.textContent = 'Удалить';
            deleteButton.addEventListener('click', () => {
                // Удаление пользователя из списка из локального хранилища
                const storedUsers = JSON.parse(localStorage.getItem('users'));
                const index = storedUsers.findIndex(u => u.id === user.id);
                storedUsers.splice(index, 1);
                localStorage.setItem('users', JSON.stringify(storedUsers));
                userElement.remove();
            });

            userElement.appendChild(deleteButton);
            usersContainer.appendChild(userElement);
        }
    })
	.catch(error => {
        // Обрабатываем возможные ошибки
        console.error('Что-то пошло не так');
    });