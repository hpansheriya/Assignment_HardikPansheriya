package Data_Structure;

import java.util.*;
public class LinkedListDemo
{
	public static void main(String args[]) {
		LinkedList<String> ll = new LinkedList<String>();
		
		ll.add("One");
        ll.add("Two");
        ll.add("Three");
        ll.add("Four");
        ll.add("Five");
        
        System.out.println(ll);
        
        ll.remove("Five");
        
        ll.add(4,"Six");
        
        System.out.println(ll);
        System.out.println(ll.contains("Six"));
        System.out.println(ll.getFirst());
        System.out.println(ll.indexOf("Three"));
        System.out.println(ll.peek());
        
        for (String s:ll) {
        	System.out.println(s);
        }
	}
}
