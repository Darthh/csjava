package chapter3;

import java.util.Scanner;

public class TestCalculator2 {

	public static void main(String[] args) {

		//input of 2 nums
	    int num1;
	    int num2;
	    String operation;
	    
	    //scanner for input of 2 numbers
	    Scanner input = new Scanner(System.in);
	    
	    //1st input
	    System.out.println("Enter your first number");
	    num1 = input.nextInt();
	    
	    //2nd input
	    System.out.println("Enter your second number");
	    num2 = input.nextInt();

	    //scanner for input of operations
	    Scanner op = new Scanner (System.in);

	    //prints what operation u want with operation options
	    System.out.println("Enter the operation you want ");
	    System.out.println(" +   ,  -  ,   x   ,   /   ");
	    
	    //goes to the next one 
	    operation = op.next();
	    
	    //the addition one
	    if (operation.equals("+"))
	    {
	        System.out.println("Your Answer is "+(num1 + num2));
	    }
	    
	    //the substitution one
	    else if (operation.equals("-"))
	    {
	        System.out.println("Your Answer is "+(num1 - num2));
	    }   
	    
	    //the multiplication one
	    else if (operation.equals("x"))
	    {
	        System.out.println("Your Answer is "+(num1 * num2));
	    }   
	    
	    //the division one 
	    else if (operation.equals("/"))
	    {
	        System.out.println("Your Answer is "+(num1 / num2));
	    }
	    
	}
}


