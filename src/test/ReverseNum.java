package test;

public class ReverseNum {

	public static void main(String[] args) {
		
		int num = 945904;
		int result = 0;
		while(num>0) 
		{
		int rem = num%10;
		result = (result*10)+rem;
		num = num/10;
		}
		System.out.println(result);
	}
}


// finding the occurance of each word in a sentence