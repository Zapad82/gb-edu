const productsData = [
    {
        id: 1,
        name: "Ноутбук",
        category: "Электроника",
    },
    {
        id: 2,
        name: "Смартфон",
        category: "Электроника",
    },
    {
        id: 3,
        name: "Кофемашина",
        category: "Бытовая техника",
    },
    {
        id: 4,
        name: "Фотокамера",
        category: "Электроника",
    },
    {
        id: 5,
        name: "Микроволновая печь",
        category: "Бытовая техника",
    },
    {
        id: 6,
        name: "Книга",
        category: "Книги",
    },
    {
        id: 7,
        name: "Футболка",
        category: "Одежда",
    },
    {
        id: 8,
        name: "Шапка",
        category: "Одежда",
    },
    {
        id: 9,
        name: "Стул",
        category: "Мебель",
    },
    {
        id: 10,
        name: "Стол",
        category: "Мебель",
    },
];

const categorySelect = document.getElementById('category-select');
const productsList = document.getElementById('products-list');

function updateProducts(category) {
    productsList.innerHTML = '';
    productsData.forEach(product => {
        if (category === '' || product.category === category) {
            const li = document.createElement('li');
            li.textContent = `${product.name} - ${product.category}`;
            productsList.appendChild(li);
        }
    });
}

categorySelect.addEventListener('change', function() {
    updateProducts(this.value);
});

// Инициализация списка товаров при загрузке страницы
updateProducts('');