"use strict";

/*
###Задание 1
Необходимо создать класс Library. Конструктор класса, должен принимать начальный 
список книг (массив) в качестве аргумента. Убедитесь, что предоставленный массив 
не содержит дубликатов; в противном случае необходимо выбросить ошибку.
1. Класс должен содержать приватное свойство #books, которое должно хранить 
книги, переданные при создании объекта.
2. Реализуйте геттер-функцию allBooks, которая возвращает текущий список книг.
3. Реализуйте метод addBook(title), который позволяет добавлять книгу в список. 
Если книга с таким названием уже существует в списке, выбросьте ошибку с 
соответствующим сообщением.
4. Реализуйте метод removeBook(title), который позволит удалять книгу из списка 
по названию. Если книги с таким названием нет в списке, выбросьте ошибку с 
соответствующим сообщением.
5. Реализуйте метод hasBook(title), который будет проверять наличие книги в 
библиотеке и возвращать true или false в зависимости от того, есть ли такая 
книга в списке или нет.
*/


// Объявление класса Library с использованием приватного поля #books для хранения списка книг.
class Library {
    #books;
    // Конструктор класса принимает массив initialBooks и проверяет наличие дубликатов книг. Если найдены дубликаты, выбрасывается исключение.  
    constructor(initialBooks) {
      // Check for duplicate books in the initial array
      if (new Set(initialBooks).size !== initialBooks.length) {
        throw new Error("Дублирование книг не допускается.");
      }
      this.#books = initialBooks;
    }

    // Метод allBooks возвращает все книги из библиотеки.
    get allBooks() {
      return this.#books;
    }
  
    // Метод addBook добавляет новую книгу в библиотеку, если она еще не существует.
    addBook(title) {
      if (this.#books.includes(title)) {
        throw new Error("Эта книга уже есть в библиотеке");
      }
      this.#books.push(title);
    }
  
    // Метод removeBook удаляет указанную книгу из библиотеки, если она существует.
    removeBook(title) {
      const index = this.#books.indexOf(title);
      if (index === -1) {
        throw new Error("Этой книги нет в библиотеке");
      }
      this.#books.splice(index, 1);
    }
  
    // Метод hasBook проверяет, есть ли указанная книга в библиотеке и возвращает true или false.
    hasBook(title) {
      return this.#books.includes(title);
    }
  }
  
  // Пример использования класса Library для создания библиотеки, добавления и удаления книг, а также проверки наличия книги.
  const myLibrary = new Library(['Book1', 'Book2', 'Book3']);
  console.log(myLibrary.allBooks); // Output: ['Book1', 'Book2', 'Book3']
  myLibrary.addBook('Book4');
  console.log(myLibrary.allBooks); // Output: ['Book1', 'Book2', 'Book3', 'Book4']
  myLibrary.removeBook('Book2');
  console.log(myLibrary.allBooks); // Output: ['Book1', 'Book3', 'Book4']
  console.log(myLibrary.hasBook('Book1')); // Output: true
  console.log(myLibrary.hasBook('Book5')); // Output: false
  