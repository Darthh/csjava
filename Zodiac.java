package chapter3;

import java.util.Scanner;

public class Zodiac {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your age bracket: (0 = < 18, 1 = < 65, 2 = > 65.");
		int age = scan.nextInt();
		
		switch(age) {
		case 0: 
			System.out.println("You are too young to vote!");
			break;
		case 1:
			System.out.println("You are eligible to vote!");
			break;
		case 2:
			System.out.println("Oh yeah! You definitely can vote");
			break;
		}
		
		System.out.println();
		
		System.out.println("What is your favorite color? ");
		String color = scan.next();
		
		switch(color) {
		case "red":
			System.out.println("You must like tomatoes!");
			break;
		case "blue":
			System.out.println("You must like the smurfs!");
			break;
		default:
			System.out.println("You don't like my colors!");
		}
	}
}

