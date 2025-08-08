package inheritance;

public class Manager extends Employee {
    String department;

    public void showManagerDetails() {
        displayInfo();  
        System.out.println("Department: " + department);
    }
}