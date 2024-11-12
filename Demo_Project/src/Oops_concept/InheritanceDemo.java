package Oops_concept;

class Vehicle{
	public int gear;
	public int speed;
	
	public Vehicle(int gear, int speed) {
		this.gear = gear;
		this.speed = speed;
	}
	
	public void applyBreak(int decrement) {
		speed -= decrement;
	}
	
	public void speedUp(int increment) {
		speed += increment;
	}
	
	public String toString() {
		return "gear : " + gear + " speed : " + speed;
	}
}

class Bicycle extends Vehicle{
	public String model;
	
	public Bicycle(String model, int gear, int speed) {
		super(gear, speed);
		this.model = model;
	}
	
	public void setmodel(String modelname) {
		model = modelname;
	}
	
	public String toString() {
		return (super.toString() +" model is : " + model);
	}
}

public class InheritanceDemo
{
	public static void main(String args[]) {
		Bicycle b1 = new Bicycle("2017", 4, 60);
		System.out.println(b1.toString());
		b1.applyBreak(20);
		System.out.println(b1.toString());
	}
}
