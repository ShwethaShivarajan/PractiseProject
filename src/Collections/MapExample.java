package Collections;

import java.util.*;
public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		
		map1.put(1, "Shreya");
		map1.put(2, "Amith");
		map1.put(4, "Jon");
		map1.put(6, "Chris");
		map1.put(2, "Ashish");
		map1.put(3, "Riya");
		System.out.println(map1);
		System.out.println("Data at 6th key is " + map1.get(6));
		
		map1.remove(2);
		System.out.println(map1);
		
		
		for(Integer key1: map1.keySet()) {
			
			System.out.println("Key is " + key1);
			System.out.println("Value is " + map1.get(key1));
		}
		
		
	}

}
