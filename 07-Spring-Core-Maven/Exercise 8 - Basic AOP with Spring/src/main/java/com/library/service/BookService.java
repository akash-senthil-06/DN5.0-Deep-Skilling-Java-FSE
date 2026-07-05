package com.library.service;
import com.library.repository.BookRepository;
public class BookService {
    private BookRepository bookRepository;
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    public void registerBook(String bookName) {
        System.out.println("Registering book in BookService...");
        bookRepository.saveBook(bookName);
    }
}
