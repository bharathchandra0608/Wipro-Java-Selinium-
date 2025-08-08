package collections;
import java.util.HashSet;
import java.util.Scanner;

public class HospitalRegistration {
    public static void main(String[] args) {
        HashSet<String> registeredPatientIDs = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- 🏥 Hospital Registration System ---");
            System.out.println("1. Register New Patient");
            System.out.println("2. View Registered Patient IDs");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();  // Clear buffer

            switch (choice) {
                case 1:
                    System.out.print("Enter Patient ID: ");
                    String id = scanner.nextLine();

                    if (registeredPatientIDs.add(id)) {
                        System.out.println("✅ Patient registered successfully.");
                    } else {
                        System.out.println("❌ Patient with ID '" + id + "' is already registered.");
                    }
                    break;

                case 2:
                    System.out.println("\n📋 Registered Patient IDs:");
                    if (registeredPatientIDs.isEmpty()) {
                        System.out.println("No patients registered yet.");
                    } else {
                        for (String pid : registeredPatientIDs) {
                            System.out.println("ID: " + pid);
                        }
                    }
                    break;

                case 3:
                    System.out.println("Exiting... Thank you!");
                    break;

                default:
                    System.out.println("⚠️ Invalid choice. Please try again.");
            }

        } while (choice != 3);

        scanner.close();
    }
}
