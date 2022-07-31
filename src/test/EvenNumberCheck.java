package test;

import java.util.Scanner;

public class EvenNumberCheck {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the number : ");
		int num = scanner.nextInt();
		
		System.out.println(num % 2);
		if (num % 2 == 0) {

			System.out.println("The number is even");

		} else {
			System.out.println("The number is not even");
		}

	}
}
