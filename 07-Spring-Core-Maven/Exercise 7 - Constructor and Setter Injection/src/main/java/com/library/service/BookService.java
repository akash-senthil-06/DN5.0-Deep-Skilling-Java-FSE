package com.library.service;
import com.library.repository.BookRepository;
public class BookService {
    private BookRepository bookRepository;
    public BookService() {
        System.out.println("BookService: Default constructor called.");
    }
    public BookService(BookRepository bookRepository) {
        System.out.println("BookService: Parametrized constructor called.");
        this.bookRepository = bookRepository;
    }
    public void setBookRepository(BookRepository bookRepository) {
        System.out.println("BookService: Setter method called.");
        this.bookRepository = bookRepository;
    }
    public void registerBook(String bookName) {
        System.out.println("Registering book...");
        bookRepository.saveBook(bookName);
    }
}
