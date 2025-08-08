package strings;
import java.util.Scanner;


public class employeeprofile {

	public static void main(String[] args) {
		Scanner profile = new Scanner(System.in);

        
        System.out.print("Enter number of employees: ");
        int n = profile.nextInt();
        profile.nextLine(); 

        
        String[] names = new String[n];
        int[] ids = new int[n];
        String[] departments = new String[n];
        double[] salaries = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Employee " + (i + 1) + ":");
            System.out.print("Employee ID: ");
            ids[i] = profile.nextInt();
            profile.nextLine(); 

            System.out.print("Name: ");
            names[i] = profile.nextLine();

            System.out.print("Department: ");
            departments[i] = profile.nextLine();

            System.out.print("Salary: ");
            salaries[i] = profile.nextDouble();
            profile.nextLine(); 
        }
        System.out.println("\n--- Employee Profile Report ---");
        System.out.printf("%-10s %-20s %-15s %-10s%n", "EmpID", "Name", "Department", "Salary");

        for (int i = 0; i < n; i++) {
            System.out.printf("%-10d %-20s %-15s %-10.2f%n", ids[i], names[i], departments[i], salaries[i]);
        }

        profile.close();


		
	}

}
