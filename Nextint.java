package chapter3;

import java.util.*;

public class Nextint {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		//System.out.println("Enter your name");
		//String name = "You typed: " + scan.next();
		//System.out.println(name);
		
	//System.out.println("Enter your first name and last name: ");
	//scan.useDelimiter("<end>");
	//String name = scan.next();
	//System.out.println(name);
		
	//	System.out.println("Input your age: ");
	//	if(scan.hasNextInt())
	//	{
	//		int age = scan.nextInt();
	//	}
	//	System.out.println("Your age is: " + age);
		
		System.out.println("Input your age: ");
		while(!scan.hasNextInt())
		{
			System.out.println("Your input is not valid.");
			System.out.println("Input your age: ");
			scan.hasNext();
		}
		int age = scan.nextInt();
		System.out.println("Your age is: " + age);
		
	}
}
