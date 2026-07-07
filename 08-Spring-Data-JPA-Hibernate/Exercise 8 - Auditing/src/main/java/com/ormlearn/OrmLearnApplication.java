package com.ormlearn;
import com.ormlearn.model.Employee;
import com.ormlearn.repository.EmployeeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
@SpringBootApplication
@EnableJpaAuditing
public class OrmLearnApplication {
    public static void main(String[] args) {
        SpringApplication.run(OrmLearnApplication.class, args);
    }
    @Bean
    public CommandLineRunner run(EmployeeRepository employeeRepository) {
        return args -> {
            System.out.println("Adding an Employee...");
            Employee emp = new Employee(1L, "Alice", 45000.0);
            employeeRepository.save(emp);
            Employee savedEmp = employeeRepository.findById(1L).get();
            System.out.println("Created Employee: " + savedEmp);
            System.out.println("Sleeping for 2 seconds to simulate time gap...");
            Thread.sleep(2000);
            System.out.println("Updating Employee's salary...");
            savedEmp.setSalary(50000.0);
            employeeRepository.save(savedEmp);
            Employee updatedEmp = employeeRepository.findById(1L).get();
            System.out.println("Updated Employee: " + updatedEmp);
        };
    }
}
