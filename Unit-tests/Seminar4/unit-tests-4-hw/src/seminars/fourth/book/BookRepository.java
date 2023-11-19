package seminars.fourth.book;

import java.util.List;

public interface BookRepository {
    Book findById(String id);
    List<Book> findAll();

    void addBook(Book book);

    void deleteBook(String book);
}
