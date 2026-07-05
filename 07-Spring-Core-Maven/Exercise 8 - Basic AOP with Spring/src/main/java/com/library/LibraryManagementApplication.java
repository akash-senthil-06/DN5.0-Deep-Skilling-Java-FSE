package com.library;
import com.library.aspect.LoggingAspect;
import com.library.repository.BookRepository;
import com.library.service.BookService;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
public class LibraryManagementApplication {
    public static void main(String[] args) {
        System.out.println("Loading Spring context (Simulated AOP Before/After Advice)...");
        BookRepository bookRepository = new BookRepository();
        BookService bookService = new BookService();
        bookService.setBookRepository(bookRepository);
        LoggingAspect aspect = new LoggingAspect();
        JoinPoint jp = new JoinPoint() {
            @Override
            public Signature getSignature() {
                return new Signature() {
                    @Override
                    public String getName() {
                        return "registerBook";
                    }
                };
            }
        };
        aspect.logBefore(jp);
        bookService.registerBook("Spring Framework AOP Advices");
        aspect.logAfter(jp);
    }
}
