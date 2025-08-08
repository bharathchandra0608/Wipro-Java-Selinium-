package lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Step 1: Create a list of employees
        List<Employee> employees = new ArrayList<>();	
        employees.add(new Employee(101, "Alice", 50000));
        employees.add(new Employee(102, "Bob", 60000));
        employees.add(new Employee(103, "Charlie", 40000));
        employees.add(new Employee(104, "David", 55000));

        // Step 2: Sort in ascending order of salary using lambda
        employees.sort(Comparator.comparing(emp -> emp.getSalary()));

        System.out.println("Employees sorted by salary (ascending):");
        for (Employee emp : employees) {
            System.out.println(emp);
        }

        // Step 3: Sort in descending order of salary using lambda
        employees.sort(Comparator.comparing(Employee::getSalary).reversed());

        System.out.println("\nEmployees sorted by salary (descending):");
        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }
}