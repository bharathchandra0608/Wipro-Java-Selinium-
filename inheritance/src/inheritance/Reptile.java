package inheritance;

public class Reptile extends Animal {
    boolean isColdBlooded;

    public void showReptileDetails() {
        displayInfo();
        System.out.println("Cold-blooded: " + (isColdBlooded ? "Yes" : "No"));
    }
}