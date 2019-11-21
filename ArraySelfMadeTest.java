package chapter9;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArraySelfMadeTest {

	public static void main(String[] args) {

	//Initialize my scanner
	Scanner input = new Scanner(System.in);
	System.out.println("Enter a number for the length of your array");
	int arrayLength = input.nextInt();
	

	//Ask user for length of first array
	

	//Number to represent length of the array

	//First array method with user input
	int[] returnArray1 = firstArray(arrayLength, input);
	System.out.println(Arrays.toString(returnArray1));

	//Second randomized array method
	int[] returnArray2 = randomArray(arrayLength);
	System.out.println(Arrays.toString(returnArray2));
	System.out.println();

	//Find average of two max values

	//Close scanner
	input.close();

	}//end of main

	//Call first array method
	public static int[] firstArray(int arrayLength, Scanner input) {

	//Instantiate my array and ask user to input elements
		int[] array1 = new int [arrayLength];
		System.out.println("Now input the elements of the array (0-100)");

	//Make a while statement to keep on checking if user inputs numbers within
	//the expected range
		
		while(true)
		{
			for(int i = 0; i < arrayLength; i++) 
			{
				array1[i] = input.nextInt();
				
			}
			for(int i = 0; i < arrayLength; i++) {
				if((array1[i] >= 0) && (array1[i] <=100))
				{
					System.out.println("Your array");
					return array1;		}
			}
		}


	}//end of firstArray method

	//Start of random array
	public static int[] randomArray(int arrayLength) {
	//Instantiate random array
		int[] randomizedArray = new int[arrayLength];
		for(int i = 0; i < arrayLength; i++)
		{
			Random rand = new Random();
			randomizedArray[i] = rand.nextInt((100 - 0) + 1) +0;
			
		}

		System.out.println();
		System.out.println(" A randomized array: ");
		return randomizedArray;
	//Make traditional for loop

	//Make my randomizer

	//Put my range

	//Print random array

	}//end of randomArray method

	}//end of class
