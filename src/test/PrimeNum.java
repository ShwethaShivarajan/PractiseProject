package test;

import java.util.Scanner;

public class PrimeNum {

	public static void main(String[] args) {
	
		// prime number
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = scan.nextInt();
		boolean flag = true;
		for(int i=2;i<num;i++)
		{
			int rem = num%i;
			if(rem==0) {
				System.out.println("num is not prime");
				flag = false;
				break; //check using if else and debug to check how it works
			}
		}
		if(flag) {
			System.out.println("The num is prime");
		}

	}

//	write a program for checking set of prime numbers
	
}
