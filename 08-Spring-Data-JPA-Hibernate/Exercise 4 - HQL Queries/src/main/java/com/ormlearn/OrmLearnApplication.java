package com.ormlearn;
import com.ormlearn.model.Employee;
import com.ormlearn.repository.EmployeeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
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
            System.out.println("Fetching all employees using HQL:");
            List<Employee> allEmployees = employeeRepository.getAllEmployeesHQL();
            allEmployees.forEach(System.out::println);
            System.out.println("Fetching high earners (Salary > 50000) using HQL:");
            List<Employee> highEarners = employeeRepository.getHighEarnersHQL();
            highEarners.forEach(System.out::println);
        };
    }
}
