package lambda;

import java.util.*;

class Employee {
    private int empId;
    private String name;
    private double salary;

    // Constructor
    public Employee(int empId, String name, double salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    // Getters
    public int getEmpId() {
        return empId;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    // toString method for printing
    @Override
    public String toString() {
        return "Employee[ID=" + empId + ", Name=" + name + ", Salary=" + salary + "]";
    }
}
