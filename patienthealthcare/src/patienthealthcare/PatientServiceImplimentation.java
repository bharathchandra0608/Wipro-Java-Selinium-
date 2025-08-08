package patienthealthcare;

import java.util.HashMap;
import java.util.Map;

public class PatientServiceImplimentation implements PatientService {
    private Map<Integer, Patient> patientMap = new HashMap<>();

    @Override
    public void registerPatient(Patient patient) {
        patientMap.put(patient.getId(), patient);
        System.out.println("Patient registered: " + patient.getName());
    }

    @Override
    public void showPatient(int id) {
        Patient patient = patientMap.get(id);
        if (patient != null) {
            patient.showDetails();
        } else {
            System.out.println("Patient not found with ID: " + id);
        }
    }
}
