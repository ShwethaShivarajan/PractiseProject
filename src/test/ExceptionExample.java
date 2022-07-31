package test;

public class ExceptionExample {

	public static void main(String[] args) {
		
		
		int[] arr = {23,22, 45, 23};
		int num = 23;
		try {
			int x = num/0;
		System.out.println(arr[2]);
		
		} 
		catch(ArithmeticException e) {
			System.out.println("There is an arithmetic exception");
			
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("There is an exception");
			
		}
		finally { 
			System.out.println("Final sentence");
		}
		System.out.println("This is the after exception");
	}

}
