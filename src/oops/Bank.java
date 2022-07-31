package oops;

public class Bank {

	public int AccountNum;

	public void AccountBalance() {

		System.out.println("Inside Account balance");
	}

	public int getBalance() {
		return 100;
	}

	public void closeAccount(int a) {
		System.out.println("This is inside Bank" + a);
	}
}
