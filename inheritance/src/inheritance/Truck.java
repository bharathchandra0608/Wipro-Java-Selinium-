package inheritance;

public class Truck extends Vehicle {
    int loadCapacity;

    public void showTruckDetails() {
        displayInfo();
        System.out.println("Load capacity: " + loadCapacity + " tons");
    }
}
