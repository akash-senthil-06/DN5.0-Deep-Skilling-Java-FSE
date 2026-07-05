package com.library;
import com.library.aspect.LoggingAspect;
import com.library.repository.BookRepository;
import com.library.service.BookService;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
public class LibraryManagementApplication {
    public static void main(String[] args) {
        System.out.println("Loading Spring context (Simulated AOP)...");
        BookRepository bookRepository = new BookRepository();
        BookService bookService = new BookService();
        bookService.setBookRepository(bookRepository);
        LoggingAspect aspect = new LoggingAspect();
        try {
            aspect.logExecutionTime(new ProceedingJoinPoint() {
                @Override
                public Object proceed() throws Throwable {
                    bookService.registerBook("Spring AOP Logging Concept");
                    return null;
                }
                @Override
                public Signature getSignature() {
                    return new Signature() {
                        @Override
                        public String getName() {
                            return "registerBook";
                        }
                    };
                }
            });
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
