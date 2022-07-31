package test;

public class Pattern {

	public static void main(String[] args) {
	
		
//		Nested loops
		for(int i=1; i<=5; i++) {
			
//			int j=1;
//			while(j<=i) {
//				System.out.print("*");
//				j++;
//			}
//			
			
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
