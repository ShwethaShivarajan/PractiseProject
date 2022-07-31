package Collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {
	
	public static void main(String[] args) {
		
		ArrayList<String> list1 = new ArrayList<String>();
		
		list1.add("Mango");
		list1.add("Cherry");
		list1.add("Apple");
		list1.add("Guava");
		list1.add("Chikko");
		list1.add("Banana");
		System.out.println("List names are " + list1);
		
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.add(10);
		list2.add(20);
		list2.add(30);
		list2.add(40);
		
		System.out.println(list2);
		System.out.println(list2.size());
		
		list2.remove(1);
		System.out.println(list2);
		
		list2.add(50);
		list2.add(60);
		System.out.println(list2);
		System.out.println(list2.get(3)); // to print the data
		list2.set(2, 200);// to replace the data
		System.out.println(list2);
		
		Collections.sort(list2); // in collections class, sort method in ascending is used
		System.out.println(list2);
		list2.sort(Collections.reverseOrder());
		System.out.println(list2);
		
		for(int i=0; i<=list2.size(); i++)
		{
			System.out.println(list1.get(i));
		}
		
		
		System.out.println(list1.size());
		for(String name:list1) {
			System.out.println(name);
		}
		
		// to print the index
		for(int i=0; i<list1.size(); i++) {
			
			
			if(list1.get(i).equals("Guava")) {
				
				System.out.println("The position of Guava is "+ i);
				break;
			}
		}
	}

}
