package Data_Structure;

import java.util.*;

class Book implements Comparable<Book>{
	int id;
	String name, author, publisher;
	int quantity;
	
	public Book(int id, String name, String author, String publisher, int quantity)
	{
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.quantity = quantity;
	}
	
	 public int compareTo(Book b) {  
	        if (id > b.id) {  
	            return 1;  
	        } else if (id < b.id) {  
	            return -1;  
	        } else {  
	            return 0;  
	        }  
	    }  
}

public class QueueDemo
{
	public static void main(String args[]) {
		Queue<Book> books = new PriorityQueue<Book>();
		
		Book b1 = new Book(111, "DS", "HP", "Hardik", 5);
		Book b2 = new Book(91, "Queue", "OP", "Om", 7);
		
		books.add(b1);
		books.add(b2);
		
		for(Book b:books) {
			System.out.println(b.id +" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
		}
	}
}
