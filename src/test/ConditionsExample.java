package test;

public class ConditionsExample {

	public static void main(String[] args) {
		
		/*
		 * Multiple lines comments
		 */
		
//		= (assignment operator)
//				== (comparator)
		
		int age = 17;
		
		if(age>=18) {
			System.out.println("Eligible for voting");
		}
		else if(age==17){
			System.out.println("Eligible after one year");
		}
		
		else {
			System.out.println("not eligible");
		}
		
		

	}

}
