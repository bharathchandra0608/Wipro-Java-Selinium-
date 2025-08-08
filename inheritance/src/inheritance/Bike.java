package inheritance;

public class Bike extends Vehicle {
    boolean hasCarrier;

    public void showBikeDetails() {
        displayInfo();
        System.out.println("Has carrier: " + (hasCarrier ? "Yes" : "No"));
    }
}
