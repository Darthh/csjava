package chapter3;

import java.util.Scanner;

//Version 1.0 by Patrick V , put notes so u know I understand each step and process, simple else if and next inputs etc
//and yes I did use some examples from online with this which I then used cause I was not here cause of a tumor in my neck

public class Computetaxess {
	public static void main(String[] args) {
		//makes scanner
		Scanner input = new Scanner(System.in);
		
		//user can pick 0 , 1 , 2 or 3
		System.out.println("0-single filer");
		System.out.println("1-married jointly");
		System.out.println("2-married separately");
		System.out.println("3-head of household");
		System.out.println("Enter your filing status :");
		
		//next int goes to status of # picked
		int status = input.nextInt();
		
		//user then enters taxable income # say (400000(
		System.out.print("Enter the taxable income: ");
		double income = input.nextDouble();
		
		//tax
		double tax = 0;
		
		//tax for if status = 0 (single filer)
		if (status == 0) {
			
			//10% if to 8350 
			if (income <= 8350)
				tax = income * 0.10;
			//15%
			else if (income <= 33950)
				tax = 8350 * 0.10 + (income - 8350) * 0.15;
			//25%
			else if (income <= 82250)
				tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +
					(income - 33950) * 0.25;
			//28%
			else if (income <= 171550)
				tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +
					(82250- 33950) * 0.25 + (income- 82250) * 0.28;
			//33%
			else if (income <= 372950)
				tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +
					(82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 +
					(income - 171550) * 0.35;
			//35%
			else tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +
					(82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 +
					(372950 - 171550) * 0.33 + (income - 372950) * 0.35;
		}
		
		//tax for if status = 1 (married jointly)
		if (status == 1) {
			//10%
			if (income <= 16700)
				tax = income * 0.10;
			//15%
			else if (income <= 67900)
				tax = 16700 * 0.10 + (income - 16700) * 0.15;
			//25%
			else if (income <= 137050)
				tax = 16700 * 0.10 + (67900 - 16700) * 0.15 + 
					(income - 137050) * 0.25;
			//28%
			else if (income <= 208850)
				tax = 16700 * 0.10 + (67900 - 16700) * 0.15 + 
					(208850 - 1370501) * 0.25 + (income - 208851) * 0.28;
			//33%
			else if (income <=372950)
				tax = 16700 * 0.10 + (67900 - 16700) * 0.15 + 
					(208850 - 1370501) * 0.25 + (372950 - 208851) * 0.28 +
					(income - 208851) * 0.33;
			//35%
			else tax = 16700 * 0.10 + (67900 - 16700) * 0.15 + 
					(208850 - 1370501) * 0.25 + (372950 - 208851) * 0.28 +
					(372950 - 208851) * 0.33 + (income - 372951) * 0.35;
		}
		
		//tax for if status = 2 (married seperately)
		if (status == 2) {
			//10%
			if (income <= 8350)
				tax = income * 0.10;
			//15%
			else if (income <= 33950)
				tax = 8350 * 0.10 + (income - 8350) * 0.15;
			//25%
			else if (income <= 68525)
				tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +
					(income - 33950) * 0.25;
			//28%
			else if (income <= 104425)
				tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +
					(68525 - 33950) * 0.25 + (income - 68525) * 0.28;
			//33%
			else if (income <= 186475) 
				tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +
					(68525 - 33950) * 0.25 + (104425 - 68525) * 0.28 +
					(income - 104426) * 0.33;
			//35%
			else 	tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +
				(68525 - 33950) * 0.25 + (104425 - 68525) * 0.28 +
				(186475 - 104426) * 0.33 + (income - 186476) * 0.35;
		}
		//tax for if status = 3 (head of household)
		if (status == 3) {
			//10%
			if (income <= 11950)
				tax = income * 0.10;
			//15%
			else if (income <= 45500)
				tax = 11950 * 0.10 + (income - 11950) * 0.15;
			//25%
			else if (income <= 117450)
				tax = 11950 * 0.10 + (45500 - 11950) * 0.15 +
					(income - 45500) * 0.25;
			//28%
			else if (income <= 190200)
				tax = 11950 * 0.10 + (45500 - 11950) * 0.15 +
					(117450 - 45500) * 0.25 + (income - 117450) * 0.28;
			//33%
			else if (income <= 372950) 
				tax = 11950 * 0.10 + (33950 - 11950) * 0.15 +
					(117450 - 45500) * 0.25 + (190200 - 117450) * 0.28 +
					(income - 190201) * 0.33;
			//35%
			else 	tax = 11950 * 0.10 + (33950 - 11950) * 0.15 +
				(117450 - 45500) * 0.25 + (190200 - 117450) * 0.28 +
				(372950 - 190201) * 0.33 + (income - 372951) * 0.35;
		}

		// end result if works would be the status + number with tax bracket
		System.out.println("Tax is: $" + (int)(tax * 100) / 100.0);
		
	} //end of main
} //end of class


