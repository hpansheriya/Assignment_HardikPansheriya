package Data_Structure;

import java.util.*;

class CountStringchar{
	public void countChar(String s) {
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		
		for (int i = 0; i < s.length(); i++) {
			if (!hm.containsKey(s.charAt(i))) {
				hm.put(s.charAt(i), 1);
			}else {
				hm.put(s.charAt(i), hm.get(s.charAt(i))+1);
			}
		}
		
		for (Map.Entry<Character,Integer> data : hm.entrySet()) {
			System.out.println(data.getKey() + " : " + data.getValue());
		}
	}
}

public class HashmapDemo2
{
	public static void main(String args[]) {
		CountStringchar c1 = new CountStringchar();
		c1.countChar("HardikHar");
	}
}
