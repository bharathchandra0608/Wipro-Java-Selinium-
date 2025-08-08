package oops;

// Step 1: Create Car class with encapsulated fields
class Car {
	private boolean engineStatus;
	private int speed;
	private double fuelLevel;

	// Setter for engine status
	public void setEngineStatus(boolean status) {
		engineStatus = status;
		if (status) {
			System.out.println("Engine started.");
		} else {
			System.out.println("Engine stopped.");
		}
	}

	// Getter for engine status
	public boolean getEngineStatus() {
		return engineStatus;
	}

	// Setter for speed
	public void setSpeed(int s) {
		if (s >= 0) {
			speed = s;
		} else {
			System.out.println("Invalid speed.");
		}
	}

	// Getter for speed
	public int getSpeed() {
		return speed;
	}

	// Setter for fuel level
	public void setFuelLevel(double fuel) {
		if (fuel >= 0) {
			fuelLevel = fuel;
		} else {
			System.out.println("Invalid fuel level.");
		}
	}

	// Getter for fuel level
	public double getFuelLevel() {
		return fuelLevel;
	}

// Step 2: Main class to test the Car object
	public class CarEncapsulation {
		public static void main(String[] args) {
			Car myCar = new Car();

			myCar.setEngineStatus(true);
			myCar.setSpeed(60);
			myCar.setFuelLevel(25.5);

			System.out.println("Car Status:");
			System.out.println("Engine On: " + myCar.getEngineStatus());
			System.out.println("Speed: " + myCar.getSpeed() + " km/h");
			System.out.println("Fuel Level: " + myCar.getFuelLevel() + " liters");
		}
	}
}
