package oops;

class Employee {
	private double salary;

	public void setSalary(double s) {
		if (s >= 0) {
			salary = s;
		} else {
			System.out.println("Invalid salary amount.");
		}
	}

	public double getSalary() {
		return salary;
	}
}

public class empsalary {

	public static void main(String[] args) {
		Employee emp = new Employee();

		emp.setSalary(5000);

		System.out.println("Employee Salary: " + emp.getSalary());

	}

}
