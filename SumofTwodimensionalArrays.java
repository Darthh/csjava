package chapter8;

public class SumofTwodimensionalArrays {

	public static void main(String[] args) {
		int[][] a = { {10, 20, 30}, {45, 60, 75} };
		int[][] b = { {12, 24, 36}, {40, 50, 60} };
		//sum of certain arrays
		int[][] Sum = new int [2][3];
		int rows, columns;
		
		for(rows = 0; rows < a.length; rows++) {
			for(columns = 0; columns < a[0].length; columns++ ) {
				Sum[rows][columns] = a[rows][columns] + b[rows][columns];			
		}

	}
		System.out.println("Sum of those two arrays are:");
		for(rows = 0; rows < a.length; rows++) {
			for(columns = 0; columns < a[0].length; columns++) {
				System.out.print(Sum[rows][columns]);
			}
			System.out.println("");
		}
		
		
	}
}
