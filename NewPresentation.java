package chapter9;


import java.util.*;

public class NewPresentation {

public static void main(String[] args) {
//Initialize the scanner

	Scanner scan = new Scanner(System.in);
	
//Initialize the three count variables, score variable, and dub variable
	
	int count = 0;
	int count2 = 0;
	int count3 = 0;
	int score = 0;
	int dub = 0;

//Initialize the 2 arrays that will be used

	int[] array2 = new int[10];
	int[] array3 = new int[5];

//create a while loop that makes the first array full of 10 random numbers
	
	while(count < 10) {
		array2[count] = (int) (Math.random( ) * ((20 - 0) + 1) + 0);
		count++;
	}


//create a while loop that makes another array full of 5 random numbers
	
	while(count3 < 5) {
		array3[count3] = (int) (Math.random( ) * ((10 - 0) + 1) + 0);
		count3++;
	}
	

//another while loop that asks the user what their input data is or "guess"

	while(count2 < 5) {
		System.out.print("What is your guess: ");
		int number = scan.nextInt();
		for(int i : array2) {
			if (i == number) {
				score++;
			}
		}
		count2++;
	}
	
	
//for enhanced loop to check if the users guess is one of the random
//numbers in the first array

	System.out.println("---------------------------------");
	System.out.println("Score " + score);


//if statement that adds to the score if they guess right

	if(score >= 4) {
		System.out.println("You won the jackpot $10,000,000!!");
	}
	
	else if(score >= 2) {
		System.out.println("You won $1,000,000!");
	}
	
	else if(score <= 1) {
		System.out.println("You lose!! :(");
		System.out.println("Try again next time :)");
		System.exit(0);
	}

//add count statement to stop the while statement in 5

	System.out.println("---------------------------------");
	System.out.println("CHANCE TO DOUBLE YOUR MONEY!!");
	System.out.println("Pick a number from 0 to 10");
	System.out.print("Guess : ");
	int number2 = scan.nextInt();
	for(int i = 0; i < array3.length; i++) {
		if(array3[i] == number2) {
			dub++;
		}
	}
	
	
//print the score they received

	if(dub >= 1 && score >= 4) {
		System.out.println("You won the Double Jackpot , You won $20,000,000");
	}
	else if(dub >= 1 && score >= 2) {
		System.out.println("You won the Double Jackpot, You won $2,000,000");
	}
	else if(dub < 1) {
		System.out.println("You did not win the double jackpot :(");
	}

	
//if else statements to tell the user how much money they have won



//give the user a chance to double their money
//asks user for a number in between 0 - 10 using the scanner
//for traditional loop to check if the guess is in the second array


//if else statements to tell the user how much they won if they were able
//to double their money


//close scanner
	System.out.println("---------------------------------");
	scan.close();

}

}

