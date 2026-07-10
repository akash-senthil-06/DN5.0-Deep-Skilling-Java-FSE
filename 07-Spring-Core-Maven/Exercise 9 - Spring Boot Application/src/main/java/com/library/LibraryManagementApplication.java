package com.library;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.library.model.Book;
import com.library.repository.BookRepository;
import com.library.controller.BookController;
import java.util.List;
import java.util.Optional;
@SpringBootApplication
public class LibraryManagementApplication {
    public static void main(String[] args) {
        SpringApplication.run(LibraryManagementApplication.class, args);
        BookRepository bookRepository = new BookRepository() {
            private Book storedBook;
            @Override
            public List<Book> findAll() {
                return java.util.Collections.singletonList(storedBook);
            }
            @Override
            public Optional<Book> findById(Long id) {
                return Optional.ofNullable(storedBook);
            }
            @Override
            public <S extends Book> S save(S entity) {
                this.storedBook = entity;
                return entity;
            }
            @Override
            public void deleteById(Long id) {
                this.storedBook = null;
            }
        };
        System.out.println("\nTesting Spring Boot REST Controllers (Simulated endpoints)");
        BookController controller = new BookController(bookRepository);
        Book b = new Book(1L, "Spring Boot Microservices", "Rod Johnson");
        controller.createBook(b);
        List<Book> list = controller.getAllBooks();
        System.out.println("Retrieved Book: " + list.get(0).getTitle() + " by " + list.get(0).getAuthor());
        Book updatedDetails = new Book(1L, "Spring Boot Microservices 2nd Edition", "Rod Johnson");
        controller.updateBook(1L, updatedDetails);
        System.out.println("Updated Book Title: " + controller.getBookById(1L).getTitle());
        controller.deleteBook(1L);
        System.out.println("Book deleted successfully. Exists: " + (controller.getBookById(1L) != null));
    }
}
