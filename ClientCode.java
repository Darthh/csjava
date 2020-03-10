package chapter2020;

public class ClientCode {
	
	public static void main(String[] args) 
	
	{
		
		
	Animal Skippy = new Dog();
	Animal meow = new Cat();
	Animal dog2 = new Dog();
	
	List hello = new ArrayList<>();
	

	
	Animal[] myPets = new Animal[] {Skippy, meow, dog2};
	for (int i = 0; i < myPets.length; i++)
	{
		myPets[i].speaks();
	}
	}
	

}
