package chapter5;  //java

import java.util.*;

public class quizArraysSTU {
             
	//problem 1 
	Scanner scan = new Scanner(System.in);

	int[] a = {1, 2, 3, 4, 5,};

		// problem 2has to be double
	public static double percentEven(int[] array) {
	if (array.length == 0) {
	return 0.0;
} else {
	double evenNum = 0;

	for (int i = 0; i < array.length; i++) {
	if (array[i] % 2 == 0) {
	evenNum++;
	}
}

	return evenNum * 100 / array.length;
	}
	}
}



/*Problem 1 * Set up scanner, instantiate your array * Call the function, and print the array*/
/*
* Pass an array which has a list of consecutive numbers up to 10 elements in it.
* The user should be able to via a Scanner, select the starting number of this array
* The numbers should be in consecutive order from the first element.
* Instantiate a second array which will save only the first 5 odd numbers
* in the original array
* return the array
* Name your method: displayFirstFiveOddNumbers
*/

/****************************** Problem 2 *********************************/

/*
* Write a method called percentEven that accepts
*  an array of integers as a parameter and
*  returns the percentage of even numbers in the array as a real number.
*  For example, if the array stores the elements {6, 2, 9, 11, 3},
*  then your method should return 40.0.
*  If the array contains no even elements or no elements at all,
*  return 0.0.
*/
