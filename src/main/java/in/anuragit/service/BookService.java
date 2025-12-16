package in.anuragit.service;

import in.anuragit.entity.Book;

import java.util.List;

public interface BookService {

    public String upsertBook(Book book);
    public List<Book> getAllBooks();
    public String deleteBook(Integer bookId);
}
