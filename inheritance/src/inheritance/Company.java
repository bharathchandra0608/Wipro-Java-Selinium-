package inheritance;

public class Company {
	  public static void main(String[] args) {
	        Manager mgr = new Manager();
	        mgr.name = "balu";
	        mgr.empId = 101;
	        mgr.department = "HR";
	        mgr.showManagerDetails();

	        System.out.println("----------------------");

	        Developer dev = new Developer();
	        dev.name = "Bobby";
	        dev.empId = 102;
	        dev.programmingLanguage = "Java";
	        dev.showDeveloperDetails();
	    }
	}

