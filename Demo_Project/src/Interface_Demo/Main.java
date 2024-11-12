package Interface_Demo;


class Car implements Vehicle {
	public void wheels() {
		System.out.println("4 wheels");
	}
	
	public void gear() {
		System.out.println("6 gear");
	}
	
}

class Bike implements Vehicle, ModifyVehicle{
	public void wheels() {
		System.out.println("2 wheels");
	}
	public void gear() {
		System.out.println("4 gear");
	}
	public void turboEngine() {
		System.out.println("Modify Engine Bike");
	}
}

public class Main
{
	public static void main(String args[]) {
		System.out.println("Car : ");
		Car c1 = new Car();
		c1.wheels();
		c1.gear();
		System.out.println("\nBike : ");
		Bike b1 = new Bike();
		b1.wheels();
		b1.gear();
		b1.turboEngine();
	}
}
