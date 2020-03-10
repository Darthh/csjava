package chapter2020;

public class Dog extends Animal

{
	
	public Dog(String name)
	{
		super();
		this.name = name;
		
	}

	
	public Dog() {
		// TODO Auto-generated constructor stub
	}


	@Override
	public void speaks() 
	{
		System.out.println("I say I am a dog!");
	}
	
	
}
