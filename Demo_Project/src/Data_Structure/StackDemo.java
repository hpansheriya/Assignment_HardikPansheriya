package Data_Structure;

import java.util.*;
public class StackDemo
{
	public static void main(String args[]) {
		Stack<Integer> st = new Stack<Integer>();
		
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		
		System.out.println(st);
		
		System.out.println(st.pop());
		System.out.println(st.empty());
		
		System.out.println(st.search(30));
		
		Iterator<Integer> it = st.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
