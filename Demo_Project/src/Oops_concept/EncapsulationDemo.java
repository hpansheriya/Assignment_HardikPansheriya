package Oops_concept;

class Person{
	private String name;
	private int age;
	
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public int getAge()
	{
		return age;
	}
	public void setAge(int age)
	{
		this.age = age;
	}
	
}

public class EncapsulationDemo
{
	public static void main(String args[]) {
		Person p1 = new Person();
		
		p1.setName("Hardik");
		p1.setAge(23);
		System.out.println(p1.getName());
		System.out.println(p1.getAge());
	}
}
