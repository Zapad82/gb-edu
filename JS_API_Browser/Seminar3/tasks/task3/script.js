// Создаем функцию для выполнения GET-запроса к API
async function fetchUserList() {
    try {
        const response = await fetch('https://jsonplaceholder.typicode.com/users');
        const userList = await response.json();
        return userList;
    } catch (error) {
        console.error('Ошибка при получении списка пользователей:', error);
        return [];
    }
}

// Обработчик события "load" на объекте window
window.addEventListener('load', async () => {
    // Вызываем функцию fetchUserList() для получения списка пользователей
    const userList = await fetchUserList();

    // Получаем элемент списка пользователей
    const userListElement = document.getElementById('user-list');

    // Создаем элементы списка для каждого пользователя и добавляем их в список
    userList.forEach(user => {
        const listItem = document.createElement('li');
        listItem.textContent = user.name;
        userListElement.appendChild(listItem);
    });
});
