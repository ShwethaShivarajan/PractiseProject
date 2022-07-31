package oops;

public class Chrome extends Browser {

	@Override
	public void OpenBrowser() {
		// TODO Auto-generated method stub
		System.out.println("Chrome open browser");
	}

	@Override
	public void CloseBrowser() {
		// TODO Auto-generated method stub
		System.out.println("Chrome close browser");
	}

	public void ExtraMethod() {
		System.out.println("This is an extra method in the child class");
	}
	
}
