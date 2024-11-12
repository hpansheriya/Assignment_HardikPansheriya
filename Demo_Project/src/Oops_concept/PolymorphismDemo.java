package Oops_concept;

class Bank{
	public double getTotalInterest(double amount) {
		return amount * 0;
	}
}

class SBI extends Bank{
	public double getTotalInterest(double amount) {
		return amount * (8.4 / 100);
	}
}

class ICICI extends Bank{
	public double getTotalInterest(double amount) {
		return amount * (7.2 / 100);
	}
}

class AXIS extends Bank{
	public double getTotalInterest(double amount) {
		return amount * (9.6 / 100);
	}
}

public class PolymorphismDemo
{
	public static void main(String args[]) {
		Bank b;
		b = new SBI();
		System.out.println(b.getTotalInterest(200000));
		b = new ICICI();
		System.out.println(b.getTotalInterest(403000));
		b = new AXIS();
		System.out.println(b.getTotalInterest(762130));
	}
}
