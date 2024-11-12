package Data_Structure;

import java.util.*;

public class Hashmap {
	public static void main(String[] args) {  
        HashMap<String, Integer> hashMap=new HashMap<>();  
  
        hashMap.put("John",25);  
        hashMap.put("Alice",30);  
        hashMap.put("Bob",35);  
  
        System.out.println("Age of John:"+hashMap.get("John"));  
        System.out.println("Age of Alice:"+hashMap.get("Alice"));  
  
        System.out.println("Is Bob present?"+hashMap.containsKey("Bob"));  
  
        hashMap.put("Alice",32);  
  
        hashMap.remove("John");  
  
        System.out.println("Key-Value pairs in the HashMap:");  
        for (String key : hashMap.keySet())   
        {  
            System.out.println(key+":"+hashMap.get(key));  
        }  
  
        System.out.println("Size of the HashMap:"+hashMap.size());  
    }  
}
