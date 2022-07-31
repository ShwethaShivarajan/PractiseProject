package oops;

public class Runner {

	public static void main(String[] args) {
		
		
		Employee E1 = new Employee(); //E1 is the object name
//		attributes / properties
		E1.Name = "Sam";
		E1.ID = 232;
		E1.Department = "HR";

	    E1.EmpDetails();
	
		Employee E2 = new Employee("Joe", 231, "Finance");
		E2.EmpDetails();
		
		Bank B = new Bank();
	
		B.AccountBalance();
		int Bal = B.getBalance();
		System.out.println("The account balance is " + Bal);
		
		BOABank B1 = new BOABank();
		B1.CCBalance();
		
		Overloading O = new Overloading();
		int recArea = O.GetArea(3, 2);
		int sqrArea = O.GetArea(3);
		
		System.out.println("The area of rectangle is "+recArea);
		System.out.println("The area of square is "+ sqrArea);
		
		//method overriding
		B.closeAccount(1234);
		B1.closeAccount(150);
		
		Chrome Ch = new Chrome();
		Ch.OpenBrowser();
		Ch.ExtraMethod();
		Ch.DisplayName();
		
		Browser Br = new EdgeBrowser();
		Br.CloseBrowser();
		
		Br.DisplayName();
		
		Maruthi A1 = new Maruthi();
		A1.Start();
		
		
		Encapsulation En = new Encapsulation();
		En.setName("Shreya");
		System.out.println(En.getName());
		
		
		En.setBalance(2000);
		System.out.println(En.getBalance());
		}

}
