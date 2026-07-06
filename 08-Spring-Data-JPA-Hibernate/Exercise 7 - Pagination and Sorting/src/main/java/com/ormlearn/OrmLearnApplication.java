package com.ormlearn;
import com.ormlearn.model.Employee;
import com.ormlearn.repository.EmployeeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import java.util.List;
@SpringBootApplication
public class OrmLearnApplication {
    public static void main(String[] args) {
        SpringApplication.run(OrmLearnApplication.class, args);
    }
    @Bean
    public CommandLineRunner run(EmployeeRepository employeeRepository) {
        return args -> {
            System.out.println("Adding Employees...");
            employeeRepository.save(new Employee(1L, "Alice", 45000.0));
            employeeRepository.save(new Employee(2L, "Bob", 60000.0));
            employeeRepository.save(new Employee(3L, "Charlie", 75000.0));
            employeeRepository.save(new Employee(4L, "David", 48000.0));
            employeeRepository.save(new Employee(5L, "Eve", 52000.0));
            employeeRepository.save(new Employee(6L, "Frank", 90000.0));
            System.out.println("SORTING");
            System.out.println("Fetching employees sorted by salary descending:");
            List<Employee> sortedEmployees = employeeRepository.findAll(Sort.by(Sort.Direction.DESC, "salary"));
            sortedEmployees.forEach(System.out::println);
            System.out.println("PAGINATION");
            System.out.println("Fetching page 0, size 3:");
            Pageable firstPageWithThreeElements = PageRequest.of(0, 3);
            Page<Employee> page1 = employeeRepository.findAll(firstPageWithThreeElements);
            page1.getContent().forEach(System.out::println);
            System.out.println("Fetching page 1, size 3:");
            Pageable secondPageWithThreeElements = PageRequest.of(1, 3);
            Page<Employee> page2 = employeeRepository.findAll(secondPageWithThreeElements);
            page2.getContent().forEach(System.out::println);
            System.out.println("Total Pages: " + page2.getTotalPages());
        };
    }
}
