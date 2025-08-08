package oops;
class PatientRecord {
    private String PatientName;
    private int Age;
    private String HealthCondition;

    // Constructor
    public PatientRecord(String name, int age, String condition) {
        this.PatientName = name;
        this.Age = age;
        this.HealthCondition = condition;
    }

    // Getter and Setter for PatientName
    public String getPatientName() {
        return PatientName;
    }

    public void setPatientName(String patientName) {
        this.PatientName = patientName;
    }

    // Getter and Setter for Age
    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        this.Age = age;
    }

    // Getter and Setter for HealthCondition
    public String getHealthCondition() {
        return HealthCondition;
    }

    public void setHealthCondition(String condition) {
        this.HealthCondition = condition;
    }

    // Display method
    public void displayInfo() {
        System.out.println("Patient Name: " + PatientName);
        System.out.println("Age: " + Age);
        System.out.println("Health Condition: " + HealthCondition);
    }
}

public class patient {

	public static void main(String[] args) {
		 PatientRecord patient1 = new PatientRecord("balu", 35, "Diabetes");

	        // Accessing via getters
	        patient1.displayInfo();

	        // Updating protected data via setters
	        patient1.setHealthCondition("Improved");
	        System.out.println("\nAfter Update:");
	        patient1.displayInfo();
		

	}

}
