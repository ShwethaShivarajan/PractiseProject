package test;

public class Reverse {

	public static void main(String[] args) {

		String rev = "This is a sentence to reverse the string";

		String result = "";
		for (int i = rev.length()-1; i>=0; i--) {
			result = result + rev.charAt(i);
		}
		System.out.println(result);
		
		//write a program to reverse the number
	}

}
