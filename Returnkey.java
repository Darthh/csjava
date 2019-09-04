package chapter3;

import java.util.Scanner;

public class Returnkey {

	public static void main(String[] args) {
		//set up scanner
		Scanner input = new Scanner(System.in);
		
		//user inputs values
		System.out.println("Enter 1st of 3 floating-point values: ");
		double number1 = input.nextDouble();
		System.out.println("Enter 2nd of 3 floating-point values: ");
		double number2 = input.nextDouble();
		System.out.println("Enter 3rd of 3 floating-point values: ");
		double number3 = input.nextDouble();
		
		double result = maximum(number1, number2, number3);
		System.out.println("The max value is: " + result);
		
	} //end of main

	public static double maximum(double number1, double number2, double number3) {
		double maximumValue = number1;
		if(number2 > maximumValue)
		{
			maximumValue = number2;
		}
		if(number3 > maximumValue)
		{
			maximumValue = number3;
		}
		
		return maximumValue;
	}
} // end of class