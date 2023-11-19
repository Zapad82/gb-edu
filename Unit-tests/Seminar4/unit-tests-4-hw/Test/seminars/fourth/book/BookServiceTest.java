package seminars.fourth.book;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class BookServiceTest {

    private BookService bookService;
    private BookRepository bookRepositoryMock;

    @Before
    public void setUp() {
        bookRepositoryMock = mock(BookRepository.class);
        bookService = new BookService(bookRepositoryMock);
    }

    @Test
    public void testGetBookById() {
        // Создаем мок-объект книги
        Book book = new Book("1234567890", "Название книги", "Автор");
        // Устанавливаем поведение мок-объекта
        when(bookRepositoryMock.findById("1234567890")).thenReturn(book);

        // Вызываем метод, который должен получить книгу по идентификатору
        Book result = bookService.findBookById("1234567890");

        // Проверяем, что метод getBookById был вызван один раз с нужным аргументом
        verify(bookRepositoryMock, times(1)).findById("1234567890");

        // Проверяем, что результат соответствует ожидаемому объекту книги
        assertEquals(book, result);
    }

    @Test
    public void testAddBook() {
        // Создаем мок-объект книги
        Book book = new Book("1234567890", "Название книги", "Автор");

        // Вызываем метод, который должен добавить книгу
        bookService.addBook(book);

//        // Проверяем, что метод addBook был вызван один раз с нужным аргументом
//        verify(bookRepositoryMock, times(1)).addBook(book);
    }

    @Test
    public void testDeleteBook() {
        // Вызываем метод, который должен удалить книгу по идентификатору
        bookService.deleteBook("1234567890");

//        // Проверяем, что метод deleteBook был вызван один раз с нужным аргументом
//        verify(bookRepositoryMock, times(1)).deleteBook("1234567890");
    }
}