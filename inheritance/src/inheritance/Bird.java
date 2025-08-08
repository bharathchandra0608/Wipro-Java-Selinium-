package inheritance;

public class Bird extends Animal {
    boolean canFly;

    public void showBirdDetails() {
        displayInfo();
        System.out.println("Can fly: " + (canFly ? "Yes" : "No"));
    }
}