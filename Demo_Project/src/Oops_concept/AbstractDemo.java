package Oops_concept;


abstract class Shape{
	String color;

	public Shape(String color)
	{
		this.color = color;
	}
	
	abstract double area();
	
	public abstract String toString();

	public String getColor()
	{
		return color;
	}		
	
}

class Circle extends Shape{
	double radius;
	
	public Circle(String color, double radius) {
		super(color);
		this.radius = radius;
	}
	
	public double area() {
		return Math.PI * Math.pow(radius, 2);
	}
	
	public String toString() {
		return "Circle -> color : " + super.getColor() + " and Area : " + area();
	}
}


class Rectangle extends Shape{
	double length;
	double width;
	
	public Rectangle(String color, double length, double width) {
		super(color);
		this.length = length;
		this.width = width;
	}
	
	public double area() {
		return length * width;
	}
	
	public String toString() {
		return "Rectangle -> color : " + super.getColor() + " and Area : " + area();
	}
}

public class AbstractDemo
{
	public static void main(String args[]) {
		Shape s1 = new Circle("Green",4.2);
		Shape s2 = new Rectangle("Red", 3, 5);
		
		System.out.println(s1.toString());
		System.out.println(s2.toString());
	}
}
