package patienthealthcare;

public class Specialist extends Doctor {
    public Specialist(String name, String specialization) {
        super(name, specialization);
    }

    @Override
    public void diagnose(Patient patient) {
        System.out.println(name + " (" + specialization + ") diagnosing: " + patient.getName());
        System.out.println("Advanced treatment for: " + patient.getIllness());
    }
}
