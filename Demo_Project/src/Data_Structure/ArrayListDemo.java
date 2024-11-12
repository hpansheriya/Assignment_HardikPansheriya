package Data_Structure;

import java.util.*;

public class ArrayListDemo {
	public static void main(String args[]) {
		ArrayList<Integer> numArrayList = new ArrayList<Integer>(List.of(10,20,30,40,50));
		
		numArrayList.add(60);
		
		  System.out.println("Element at index 0:"+numArrayList.get(0));  
	      System.out.println("Element at index 2:"+numArrayList.get(2));  
	      System.out.println("Element at index 4:"+numArrayList.get(4));  
	      
	      int sum = numArrayList.stream().mapToInt(Integer::intValue).sum();
	      System.out.println(sum);
	      
	      System.out.println(numArrayList.size());
	      
	      System.out.println(numArrayList);
	}
}
