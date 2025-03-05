import java.util.ArrayList;
import java.util.List;

class Employee {
    private int id;
    private String name;
    private double salary;
    
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    
    public void displayDetails() {
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + salary);
    }
}

public class EmployeeTest {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        
        employees.add(new Employee(101, "Alice", 50000));
        employees.add(new Employee(102, "Bob", 55000));
        employees.add(new Employee(103, "Charlie", 60000));
        
        for (Employee emp : employees) {
            emp.displayDetails();
        }
    }
}
