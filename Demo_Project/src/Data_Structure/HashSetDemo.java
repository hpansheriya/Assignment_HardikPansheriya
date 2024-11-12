package Data_Structure;

import java.util.*;

class Person{
	private String name;
	private int age;
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String toString() {
		return "name -> "+name+" age -> "+age;
	}
}

public class HashSetDemo
{
	public static void main(String args[]) {
		HashSet<String> hs = new HashSet<String>();
		
		hs.add("Hardik");
		hs.add("Vijay");
		hs.add("Om");
		hs.add("Yogesh");
		System.out.println(hs);
		
		Iterator<String> it = hs.iterator();
		System.out.print("Using Iterator -> ");
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
		
		System.out.println();
		System.out.print("Convert into Array -> ");
		String array[] = hs.toArray(new String[0]);
		for (String ele: array) {
			System.out.print(ele+" ");
		}
		
		HashSet<Person> personSet = new HashSet<Person>();
		
		personSet.add(new Person("hardik", 20));
		personSet.add(new Person("Om", 21));
		personSet.add(new Person("Yogesh", 23));
		
		System.out.println();
		System.out.println(personSet);
	}
}
