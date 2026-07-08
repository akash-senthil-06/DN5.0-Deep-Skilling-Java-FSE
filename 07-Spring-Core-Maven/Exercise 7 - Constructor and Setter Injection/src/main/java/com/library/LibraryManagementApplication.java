package com.library;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.library.service.BookService;
public class LibraryManagementApplication {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println("\nTesting Constructor Injection");
        BookService serviceConstructor = context.getBean("bookServiceConstructor", BookService.class);
        serviceConstructor.registerBook("Learning Spring via Constructor DI");
        System.out.println("\nTesting Setter Injection");
        BookService serviceSetter = context.getBean("bookServiceSetter", BookService.class);
        serviceSetter.registerBook("Learning Spring via Setter DI");
        context.close();
    }
}
