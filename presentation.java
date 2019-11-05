package Chapter9;

import java.util.*;

// Patrick and Benjamin Presentation has:
// 2 loops minimum
//1 enhanced, and 1 traditional
// if else statement 
// instantiates a new array
// has a randomizer

	public class presentation {
		public static void main(String[] args) {
			//creates scanner
			Scanner scan = new Scanner(System.in);
			//the ints
			int count = 0;
			int count2 = 0;
			int count3 = 0;
			int score = 0;
			int dub = 0;
			
			//the 2 arrays with a number of set numbers
			int[] array2 = new int[10];
			int[] array3 = new int[5];

			//randomizer up to 20 numbers 10 spaces long
			while(count < 10) {
				array2[count] = (int) ((Math.random() * ((20 - 0) + 1)) + 0);
				count++;
			}
			//randomizer up to 10 numbers and 5 spaces long
			while(count3 < 5) {
				array3[count3] = (int) ((Math.random() * ((10 - 0) + 1)) + 0);
				count3++;
			}

			//prints the 2 arrays from array to string 
			System.out.println(Arrays.toString(array2));
			System.out.println(Arrays.toString(array3));
			while(count2 < 5) {
				
				//input numbers via scanner up to amount of numbers in the array
				System.out.print("What is your guess: ");
				int number = scan.nextInt();
				for(int i : array2) {
					if ((int)i == number) {
						score++;
					}
				}
				count2++;
			}
			//prints line --------------  and gets score according to score
			System.out.println("------------------------------------");
			System.out.println("Score " + score);
			
			//if score is equal to or greater to 10 then print won jackpot 10mil
			if(score >= 10) {
				System.out.println("You WON the JACKPOT $10,000,000!!!!");
				System.out.println();
			}
			
			//if score is equal to or greater then to 5 then print 1mil
			else if(score >= 5) {
				System.out.println("You WON $1,000,000!!!!!");
				System.out.println();
			}
			
			//if score is less than 5 then print you lose and try again
			else if(score < 5) {
				System.out.println("You LOSE!!! :(");
				System.out.println("TRY AGAIN");
				System.out.println();
			}

			//after print is done then println chance to double money if number = one on array + is a next int
			System.out.println("CHANCE TO DOUBLE YOUR MONEY");
			System.out.println("PICK A NUMBER OUT FROM 0 TO 10");
			System.out.print("GUESS: ");
			int number2 = scan.nextInt();
			for (int i = 0; i < array3.length; i++) {
				if(array3[i] == number2) {
					dub++;
				}
			}
			//prints the double ????
			System.out.println("Double" + dub);
			
			//prints the array after the double is inputd
			String asdaa = Arrays.toString(array2);
			System.out.println(asdaa);
			System.out.println("Maybe next time you win :)");
			
			//scanner closes
			scan.close();
			
			
			
		}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	