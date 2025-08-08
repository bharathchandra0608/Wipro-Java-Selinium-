package patienthealthcare;

public class Main {
    public static void main(String[] args) {
        PatientService service = new PatientServiceImplimentation();

        Patient p1 = new Patient(1, "Ali", 30, "Fever");
        Patient p2 = new Patient(2, "Baba", 45, "Heart Disease");

     
        service.registerPatient(p1);
        service.registerPatient(p2);

        System.out.println("\nShowing patient details:");
        service.showPatient(1);
        service.showPatient(2);

        System.out.println("\nDoctor Diagnoses:");
        Doctor gp = new Generaldoctor("Dr. balu");
        Doctor cardiologist = new Specialist("Dr. bharath", "Cardio");

        gp.diagnose(p1);
        cardiologist.diagnose(p2);
    }
}

