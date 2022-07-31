package oops;

public class BOABank extends Bank {
	
	public int CreditCardNum;
	
	public void CCBalance() {
		
		System.out.println("Inside CC balance");
		this.CreditCardNum = 100;
		super.getBalance();
	}

	public void closeAccount(int a) {
		System.out.println("This is inside BOA" + a);
	}
}
