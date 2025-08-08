package inheritance;

public class TransportMain {
    public static void main(String[] args) {
        Car car = new Car();
        car.brand = "Toyota";
        car.speed = 120;
        car.numDoors = 4;
        car.showCarDetails();

        System.out.println("------------------");

        Bike bike = new Bike();
        bike.brand = "Honda";
        bike.speed = 80;
        bike.hasCarrier = true;
        bike.showBikeDetails();

        System.out.println("------------------");

        Truck truck = new Truck();
        truck.brand = "Tata";
        truck.speed = 60;
        truck.loadCapacity = 10;
        truck.showTruckDetails();
    }
}