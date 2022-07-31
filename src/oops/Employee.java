package oops;

public class Employee {

//	attributes / properties
	public String Name;
	public int ID;
	public String Department;

	public Employee() {
		System.out.println("Default contructor");
	}

	public Employee(String Name, int P2, String P3) {
		this.Name = Name;
		Department = P3;
		ID = P2;
	}

	public void EmpDetails() {
		System.out.println(Name);
		System.out.println(Department);
		System.out.println(ID);
	}
}
