package test;

public class DataType {

	public static void main(String[] args) {
		
		int a = 30;
		int b = 75;
		int sum = a+b;
		int mul = a*b;
		float div = (float)b/a;
		System.out.println("The sum of two numbers is " + sum);
		System.out.println("The multiplication of two numbers is " + mul);
		System.out.println("The div of two numbers is " + div);
		
		String str = "\"This is a string datatype\"";
		System.out.println(str);
		
		//index of the strings - finding out the first and last characters
		char chr1 = str.charAt(0);
		System.out.println("The first character in the string is " + chr1);
		System.out.println("The length of the string is " + str.length());
		char chr2 = str.charAt(str.length() - 1);
		System.out.println("The last char of the string is " + chr2);
		
		// changing the string to upper or lower case

		System.out.println("The string in uppercase " + str.toUpperCase());
		System.out.println("The string in lowercase is " + str.toLowerCase());
		
		
		
	}

}
