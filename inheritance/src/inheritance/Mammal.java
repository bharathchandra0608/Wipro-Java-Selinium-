package inheritance;

public class Mammal extends Animal {
    boolean hasFur;

    public void showMammalDetails() {
        displayInfo();
        System.out.println("Has fur: " + (hasFur ? "Yes" : "No"));
    }
}