package filehandling;

import java.io.*;
import java.util.*;

class Patient implements Serializable {
	int id;
	String name;
	String disease;
	int age;

	public Patient(int id, String name, String disease, int age) {
		this.id = id;
		this.name = name;
		this.disease = disease;
		this.age = age;
	}

	public String toString() {
		return id + " - " + name + " - " + disease + " - " + age;
	}
}

public class PatientApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Patient> patients = new ArrayList<>();

		System.out.print("How many patients do you want to enter? ");
		int count = sc.nextInt();
		sc.nextLine(); // consume leftover newline

		for (int i = 0; i < count; i++) {
			System.out.println("\n--- Enter details for Patient " + (i + 1) + " ---");
			
			System.out.print("Enter ID: ");
			int id = sc.nextInt();
			sc.nextLine(); // consume newline

			System.out.print("Enter Name: ");
			String name = sc.nextLine();

			System.out.print("Enter Disease: ");
			String disease = sc.nextLine();

			System.out.print("Enter Age: ");
			int age = sc.nextInt();
			sc.nextLine(); // consume newline

			patients.add(new Patient(id, name, disease, age));
		}

		// Save list of patients to file
		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("patients.dat"))) {
			out.writeObject(patients);
			System.out.println("\n✅ All patients saved successfully.");
		} catch (IOException e) {
			System.out.println("❌ Error writing file: " + e.getMessage());
		}

		// Read list of patients from file
		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("patients.dat"))) {
			List<Patient> savedPatients = (List<Patient>) in.readObject();
			System.out.println("\n📋 Saved Patients:");
			for (Patient p : savedPatients) {
				System.out.println(p);
			}
		} catch (Exception e) {
			System.out.println("❌ Error reading file: " + e.getMessage());
		}
	}
}
