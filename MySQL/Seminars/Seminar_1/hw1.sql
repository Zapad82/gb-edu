/* Задача 1
Создайте таблицу с мобильными телефонами, используя графический интерфейс. Необходимые поля таблицы: product_name (название товара), manufacturer (производитель), product_count (количество), price (цена). Заполните БД произвольными данными.
*/

-- создание таблицы

CREATE TABLE MobilesDB.MobilesTable (
	product_name varchar(100) NOT NULL COMMENT 'Название товара',
	manufacturer varchar(100) NOT NULL COMMENT 'Производитель',
	product_count INT NOT NULL COMMENT 'Количество товара',
	price DECIMAL NOT NULL COMMENT 'Цена'
)
ENGINE=InnoDB
DEFAULT CHARSET=utf8mb4
COLLATE=utf8mb4_0900_ai_ci
AUTO_INCREMENT=1;

-- Заполнение БД произвольными данными

INSERT INTO MobilesTable VALUES 
	('Redmi Note 8T', 'Xiaomi', '12', '12500'),
	('Redmi Note 12T Pro', 'Xiaomi', '5', '48000'),
	('C50', 'Siemens', '1', '4300'),
	('3310', 'Nokia', '1', '12000'),
	('D600', 'Samsung', '1', '3400'),
	('Z800', 'Samsung', '1', '54000'),
	('S23', 'Samsung', '5', '84300'),
	('iPhone 5', 'Apple', '3', '14000'),
	('iPhone11', 'Apple', '10', '44000'),
	('iPhone13', 'Apple', '9', '58000'),
	('iPhone14 Pro', 'Apple', '5', '102000'),
	('Redmi Note 13 Pro', 'Xiaomi', '11', '62000');
	
/* Задача 2.
Напишите SELECT-запрос, который выводит название товара, производителя и цену для товаров, количество которых превышает 2
*/

--  вывод названия товара, производителя и цен, количество которых превышает 2

SELECT product_name, manufacturer, price FROM MobilesTable WHERE product_count > 2;

/* Задача 3.
Выведите SELECT-запросом весь ассортимент товаров марки “Samsung”
*/

-- вывод ассортимента товаров марки "Samsung"

SELECT * FROM MobilesTable WHERE manufacturer = 'Samsung';


/* Задача 4.
4.* С помощью SELECT-запроса с оператором LIKE / REGEXP найти:
4.1.* Товары, в которых есть упоминание "Iphone"
4.2.* Товары, в которых есть упоминание "Samsung"
4.3.* Товары, в названии которых есть ЦИФРЫ
4.4.* Товары, в названии которых есть ЦИФРА "8"
*/

-- С помощью SELECT-запроса с оператором LIKE / REGEXP найти товары, в которых есть упоминание "Iphone"

SELECT * FROM MobilesTable WHERE product_name LIKE 'iPhone%';

--  С помощью SELECT-запроса с оператором LIKE / REGEXP найти товары, в которых есть упоминание "Samsung"

SELECT * FROM MobilesTable WHERE manufacturer REGEXP 'Samsung';

-- С помощью SELECT-запроса с оператором LIKE / REGEXP найти товары, в названии которых есть ЦИФРЫ

SELECT * FROM MobilesTable WHERE product_name REGEXP '[0-100]';

--  C помощью SELECT-запроса с оператором LIKE / REGEXP найти товары, в названии которых есть ЦИФРА "8"

SELECT * FROM MobilesTable WHERE product_name LIKE '%8%';

