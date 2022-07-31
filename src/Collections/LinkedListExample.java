package Collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedList<String> list1 = new LinkedList<String>();
		
		list1.add("Mango");
		list1.add("Cherry");
		list1.add("Apple");
		list1.add("Guava");
		list1.add("Chikko");
		list1.add("Banana");
		System.out.println("List names are " + list1);
		
		for(String name:list1) {
			System.out.println(name);
		}
	}
	

}
