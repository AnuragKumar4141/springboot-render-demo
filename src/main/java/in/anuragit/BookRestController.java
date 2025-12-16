package in.anuragit;


import in.anuragit.entity.Book;
import in.anuragit.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookRestController {

    @Autowired
    private BookService service;

    @PostMapping("/book")
    public ResponseEntity<String> addBook(@RequestBody Book book){
        String msg=service.upsertBook(book);
        return new ResponseEntity<>(msg, HttpStatus.CREATED);
    }

    @GetMapping("/books")
    public ResponseEntity<List<Book>> getAllBooks(){
        List<Book> allBooks=service.getAllBooks();
        return new ResponseEntity<>(allBooks, HttpStatus.OK);

    }

    @PutMapping("/book")
    public ResponseEntity<String> updateBook(@RequestBody Book book){
        String msg = service.upsertBook(book);
        return new ResponseEntity<>(msg, HttpStatus.OK);
    }
    @DeleteMapping ("/book/{bookId}")
    public ResponseEntity<String> deleteBook(@PathVariable Integer bookId){
        String msg=service.deleteBook(bookId);
        return new ResponseEntity<>(msg, HttpStatus.OK);
    }
}
