package test;

import java.util.Scanner;

public class ArrayExample {

	public static void main(String[] args) {
		
		
		//integer array example
		int[] arr1 = {1, 12, 23, 21, 22, 54};
		System.out.println("The number of elements in the array is " + arr1.length);
		System.out.println("The second number is " + arr1[1]);
		System.out.println("The last element in the array is " + arr1[(arr1.length-1)]);

		
		//string array example
		
	
		String[] strArr = {"Apple", "mango", "cherry"};
		
		//number of words in a string
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the string");
		String str = scanner.nextLine();
		
		 
		String[] words = str.split(" "); //split function gives array of space in the string
		System.out.println("the fifth word is " + words[4]);
		System.out.println("The number of words in the sentence is " + words.length);
		
		
	}

}
