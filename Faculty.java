package Thursday;


//-------------------------------------------------------
public class Faculty extends Employee {
	public static void main(String[] args) {
		new Faculty();
	}

	public Faculty() {
		System.out.println("(4) Performs Faculty tasks");
	}
	
} //end of faculty
//------------------------------------------------------------------------
class Employee extends Person{

public Employee(){this("(2) Invoke Employee's overloaded constructor");

	System.out.println("(3) Performs Employee's tasks");
	
}

	public Employee(String s)
	{
		System.out.println(s);
		}
	} //end of employee
//---------------------------------------------------------------

	class Person{

	public Person(){
		
		System.out.println("(1) Performs Person's tasks");
		}
	
} //end of person