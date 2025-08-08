package patienthealthcare;

public class Generaldoctor extends Doctor {
    public Generaldoctor(String name) {
        super(name, "General Physician");
    }

    @Override
    public void diagnose(Patient patient) {
        System.out.println(name + " (General Doctor) diagnosing: " + patient.getName());
        System.out.println("Basic treatment provided for: " + patient.getIllness());
    }
}
