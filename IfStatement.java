package chapter3;

import java.util.Scanner;

public class IfStatement {

	public static void main(String[] args) {
		
	Scanner console = new Scanner(System.in);
	System.out.println("What percentage did you earn? ");
	double percentage = console.nextDouble();
	
	if (percentage >= 90) 
	{
		System.out.println("You got an A.");
	}
	else if(percentage >= 80)
	if (percentage >= 80) 
	{
		System.out.println("You got an B.");
	}
	else if(percentage >= 70)
	if (percentage >= 70) 
	{
		System.out.println("You got an C.");
	}
	else if(percentage >= 60)
	if (percentage >= 60) 
	{
		System.out.println("You got an D.");
	}
	else
	{
	System.out.println("None is true!");
	}
	
	System.out.println("Thank you for using our APCSA system.");
	
	console.close();
	}

}


