package Wrapper;

import java.util.Scanner;

public class StudentMarks {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter marks for Subject 1: ");
        Integer subject1 = Integer.valueOf(sc.nextInt());

        System.out.print("Enter marks for Subject 2: ");
        Integer subject2 = Integer.valueOf(sc.nextInt());

        System.out.print("Enter marks for Subject 3: ");
        Integer subject3 = Integer.valueOf(sc.nextInt());

        Integer total = subject1 + subject2 + subject3;
        Double average = Double.valueOf(total) / 3;

        System.out.println("\n--- Student Report ---");
        System.out.println("Name: " + name);
        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + average);

        sc.close();
    }
}
