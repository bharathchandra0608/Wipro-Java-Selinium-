package inheritance;

public class ZooMain {
    public static void main(String[] args) {
        Bird parrot = new Bird();
        parrot.name = "Parrot";
        parrot.age = 2;
        parrot.canFly = true;
        parrot.showBirdDetails();

        System.out.println("------------------");

        Mammal tiger = new Mammal();
        tiger.name = "Tiger";
        tiger.age = 5;
        tiger.hasFur = true;
        tiger.showMammalDetails();

        System.out.println("------------------");

        Reptile snake = new Reptile();
        snake.name = "Cobra";
        snake.age = 4;
        snake.isColdBlooded = true;
        snake.showReptileDetails();
    }
}