package classobject;

class Employee {
    String name;
    int id;
    String department;
    double salary;

    Employee(String empName, int empId, String empDept, double empSalary) {
        name = empName;
        id = empId;
        department = empDept;
        salary = empSalary;
    }

    void displayDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Name       : " + name);
        System.out.println("Department : " + department);
        System.out.println("Salary     : ₹" + salary);
        System.out.println("--------------------------");
    }
}
public class employeesinstore {

	public static void main(String[] args) {
		 Employee emp1 = new Employee("Rahul Sharma", 101, "IT", 55000.0);
	        Employee emp2 = new Employee("Anjali Verma", 102, "HR", 48000.0);
	        Employee emp3 = new Employee("Suresh Kumar", 103, "Finance", 60000.0);

	        emp1.displayDetails();
	        emp2.displayDetails();
	        emp3.displayDetails();
		

	}

}
