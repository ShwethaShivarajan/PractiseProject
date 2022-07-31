package test;

public class Looping {

	public static void main(String[] args) {

//		
//		String str = "Print the sentence into word count";
//		String[] str2 = str.split(" ");

		// printing odd or even numbers ; skipping the number - while loop
	//	int num = 1;

//		while (num <= 10) {
//
//			if (num == 6) {
//				num = num + 2;
//				continue;
//			} else
//
//				System.out.println(num);
//
//		}
//		
		
		// for loop
		
		for(int i =1; i<=10; i++) {
			
			if(i==3) {
				continue;
			}
			System.out.println(i);
			
		}
		
		//for each loop - can only be used with arrays or list
		
//		int[] x = {10, 20, 30, 49, 50};
//		for(int num1:x) {
//			System.out.println(num1);
//		}
//		
		
		//print the array elements without using for each loop
		
//		int[] x = {10, 20, 30, 49, 50};
//		for(int i=0; i<x.length;i++) {
//			System.out.println(x[i]);
//		}
//		

	}
}
