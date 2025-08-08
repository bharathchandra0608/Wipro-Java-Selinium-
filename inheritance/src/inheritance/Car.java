package inheritance;

public class Car extends Vehicle {
    int numDoors;

    public void showCarDetails() {
        displayInfo();  // inherited method
        System.out.println("Number of doors: " + numDoors);
    }
}