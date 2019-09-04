package chapter3;

	import java.util.Scanner;

	public class ParametersIntro {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("How many # to display? ");
	int numbersDisplayed = scan.nextInt();
	writeSpaces(numbersDisplayed);//Actual parameter

	int myAge = 14;
	displayName(scan, myAge);

	//double anotherNumber = Math.sqrt(a);
	//shortcut for math computations
}	//End of main

	private static void writeSpaces(int number) {//Formal parameter
		for(int i = 1; i <= number; i++) {
			System.out.print(i + " ");
}
	System.out.println();
	}//End of method

		private static void displayName(Scanner newScanner, int anotherAge) {
		System.out.println("What is your name? ");
		String myName = newScanner.next();
		System.out.println("My name is : " + myName + " and my age is: " + anotherAge);

}

}//End of class

