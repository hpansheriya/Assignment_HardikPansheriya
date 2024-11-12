package Interface_Demo;

interface Inter
{
	final int a = 10;
	
	void display();
}

class InterfaceDemo implements Inter{
	public void display() {
		System.out.println("Interface method called");
	}
	
	public static void main(String args[]) {
		InterfaceDemo main = new InterfaceDemo();
		main.display();
		System.out.println(Inter.a);
	}
}