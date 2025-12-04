package testproject.controllers;

import com.example.api.BooksApi;
import com.example.models.Book;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.NativeWebRequest;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class BookController implements BooksApi{
    @Override
    public ResponseEntity<Void> createBook(@Valid Book body){
        System.out.println(body.getName());
        return null;
    }

    @Override
    public ResponseEntity<List<Book>> getAllBooksInLibrary(){
        List<Book> books = new ArrayList<>();
        books.add(new Book());
        return new ResponseEntity<>(books, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Book> getBookById(String bookId){
        Book book = new Book();
        book.setAuthor(bookId);
        book.setName(bookId);
        return new ResponseEntity<>(book, HttpStatus.OK);
    }
}



/*
@RestController
public class BookController implements BooksApi {
    @Override
    public Optional<NativeWebRequest> getRequest() {
        return BooksApi.super.getRequest();
    }

    @Override
    public ResponseEntity<List<Book>> getAllBooksInLibrary(){
        List<Book> books = new ArrayList<>();
        books.add(new Book());
        return new ResponseEntity<>(books, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<List<Book>> GetAllBooksInLibrary() {
        return null;
    }
}
*/