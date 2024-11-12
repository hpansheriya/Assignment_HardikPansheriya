package Oops_concept;

abstract class Homework{
	private int readpages;
	private String hwtype;
	
	{
		readpages = 0;
		hwtype = "none";
	}
	
	public Homework(int pages, String hw) {
		this.readpages = pages;
		this.hwtype = hw;
	}
	
	public abstract void createAssignment(int p);
	
	public int getreadpages() {
		return readpages;
	}
	
	public void setreadpages(int page) {
		readpages = page;
	}
	
	public String gethwtype() {
		return hwtype;
	}
	
	public void sethwtype(String hw) {
		hwtype = hw;
	}
}

class Maths extends Homework{
	
	public Maths(int pages, String hw) {
		super(pages, hw);
	}
	
	public void createAssignment(int p) {
		setreadpages(p);
		sethwtype("Math");
	}
	
	public String toString() {
		return gethwtype() + " --> " + getreadpages();
	}
}

public class AbstractDemo2
{
	public static void main(String args[]) {
		Homework h1 = new Maths(4, "Math");
		h1.createAssignment(4);
		System.out.println(h1);
	}
}
