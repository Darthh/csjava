package chapter9;

import java.util.*;

public class TestingArrays {

	public static void main(String[] args) {
		//double[] pat = new double[1028];
		
		Scanner scan = new Scanner(System.in);
		
		String[][]studentSeating = new String[5][4];
		
		int count = 0;
		for(int row = 0; row < studentSeating.length; row++)  {
			for(int col = 0; col < studentSeating[row].length; col++ ) {
				studentSeating[row][col] = scan.nextLine();
			}
			System.out.println();
		}
		//System.out.println(studentSeating[0][0]);

	System.out.println(Arrays.toString(studentSeating[0]));
	System.out.println(Arrays.toString(studentSeating[1]));
	System.out.println(Arrays.toString(studentSeating[2]));
	System.out.println(Arrays.toString(studentSeating[3]));
	System.out.println(Arrays.toString(studentSeating[4]));
	
	System.out.println(studentSeating[4][1]);
	}

}
