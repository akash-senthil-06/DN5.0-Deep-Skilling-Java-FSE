package Algorithms.Exercise04;
public class EmployeeTest {
    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager(5);
        manager.addEmployee(new Employee("E001", "Alice", "Manager", 85000));
        manager.addEmployee(new Employee("E002", "Bob", "Developer", 65000));
        manager.addEmployee(new Employee("E003", "Charlie", "Designer", 60000));
        manager.traverseEmployees();
        System.out.println("Searching for Employee E002:");
        Employee emp = manager.searchEmployee("E002");
        System.out.println(emp);
        manager.deleteEmployee("E002");
        manager.traverseEmployees();
    }
}
