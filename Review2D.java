package chapter9;

import java.util.*;

public class Review2D {

	public static void main(String[] args) {
		
	}
		Scanner scan = new Scanner(System.in);
		
		String[][]studentSeating = new String[5][4]; {
		
		for(int row = 0; row < studentSeating.length; row++) 
		{
			for(int col = 0; col < studentSeating[row].length; col++ ) 
			{
				System.out.println("Name :");
				String name = scan.nextLine();
				studentSeating[row][col] = name;
				}
			
		}
		scan.close();
		Switch(studentSeating , 0, 0 , 1 , 1);
		
		}
		
		public static void Switch(String[][] array, int row1, int col1, int row2, int col2) {
			String pat = array[row1][col1];
			array[row1][col1] = array[row2][col2];
	
			array[row2][col2] = pat;		
			
			
		
		}
}
