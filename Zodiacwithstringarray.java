package chapter5;

import java.util.Scanner;
//this program is with zodiacs and string arrays instead of switches and breaks and cases
public class Zodiacwithstringarray {	
	
	public static void main(String[] args) {
			//scanr
			Scanner input = new Scanner(System.in);

			// arroy of the 12 zodiac chinse signs
			String[] zodiacs = {"monkey", "rooster","dog", "pig","rat","ox", "tiger","rabbit", "dragon", "snake", "horse", "sheep"};

			// print user to enter a year with input
			System.out.print("Enter a year: ");
			int year = input.nextInt();

			// displays zodiac animal for the year on array
			System.out.println(zodiacs[year % 12]);
		}
	}
