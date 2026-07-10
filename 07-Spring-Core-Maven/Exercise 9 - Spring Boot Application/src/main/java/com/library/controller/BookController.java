package com.library.controller;
import com.library.model.Book;
import com.library.repository.BookRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/api/books")
public class BookController {
    private final BookRepository bookRepository;
    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    @GetMapping
    public List<Book> getAllBooks() {
        System.out.println("REST API: Fetching all books...");
        return bookRepository.findAll();
    }
    @GetMapping("/{id}")
    public Book getBookById(@PathVariable Long id) {
        System.out.println("REST API: Fetching book with ID: " + id);
        return bookRepository.findById(id).orElse(null);
    }
    @PostMapping
    public Book createBook(@RequestBody Book book) {
        System.out.println("REST API: Creating book: " + book.getTitle());
        return bookRepository.save(book);
    }
    @PutMapping("/{id}")
    public Book updateBook(@PathVariable Long id, @RequestBody Book bookDetails) {
        System.out.println("REST API: Updating book with ID: " + id);
        Book book = bookRepository.findById(id).orElse(null);
        if (book != null) {
            book.setTitle(bookDetails.getTitle());
            book.setAuthor(bookDetails.getAuthor());
            return bookRepository.save(book);
        }
        return null;
    }
    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable Long id) {
        System.out.println("REST API: Deleting book with ID: " + id);
        bookRepository.deleteById(id);
    }
}
