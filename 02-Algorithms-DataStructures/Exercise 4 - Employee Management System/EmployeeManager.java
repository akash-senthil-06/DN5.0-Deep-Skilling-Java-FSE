package Algorithms.Exercise04;
public class EmployeeManager {
    private Employee[] employees;
    private int size;
    public EmployeeManager(int capacity) {
        employees = new Employee[capacity];
        size = 0;
    }
    public void addEmployee(Employee emp) {
        if (size < employees.length) {
            employees[size++] = emp;
            System.out.println("Added Employee: " + emp.getName());
        } else {
            System.out.println("Error: Employee registry is full.");
        }
    }
    public Employee searchEmployee(String employeeId) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getEmployeeId().equalsIgnoreCase(employeeId)) {
                return employees[i];
            }
        }
        return null;
    }
    public void traverseEmployees() {
        if (size == 0) {
            System.out.println("No employees registered.");
            return;
        }
        System.out.println("Employee Records:");
        for (int i = 0; i < size; i++) {
            System.out.println(employees[i]);
        }
    }
    public void deleteEmployee(String employeeId) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (employees[i].getEmployeeId().equalsIgnoreCase(employeeId)) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            for (int j = index; j < size - 1; j++) {
                employees[j] = employees[j + 1];
            }
            employees[size - 1] = null; 
            size--;
            System.out.println("Deleted Employee ID: " + employeeId);
        } else {
            System.out.println("Error: Employee ID " + employeeId + " not found.");
        }
    }
}
