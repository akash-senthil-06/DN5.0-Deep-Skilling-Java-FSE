package com.ormlearn.repository;
import com.ormlearn.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    @Query("SELECT e FROM Employee e")
    List<Employee> getAllEmployeesHQL();
    @Query("SELECT e FROM Employee e WHERE e.salary > 50000")
    List<Employee> getHighEarnersHQL();
}
