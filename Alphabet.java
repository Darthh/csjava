package chapter9;

public class Alphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] data = new int[4][4];
		
		//1st row
		data[0][0] = 'A';
		data[0][1] = 'B';
		data[0][2] = 'C';
		data[0][3] = 'D';
		data[0][4] = 'E';

		//2nd row
		data[1][0] = 'F';
		data[1][1] = 'G';
		data[1][2] = 'H';
		data[1][3] = 'I';
		data[1][4] = 'J';

		//3rd row
		data[2][0] = 'K';
		data[2][1] = 'L';
		data[2][2] = 'M';
		data[2][3] = 'N';
		data[2][4] = 'O';

		//4th row
		data[3][0] = 'P';
		data[3][1] = 'Q';
		data[3][2] = 'R';
		data[3][3] = 'S';
		data[3][4] = 'T';

		//5th row
		data[4][0] = 'U';
		data[4][1] = 'V';
		data[4][2] = 'W';
		data[4][3] = 'X';
		data[4][4] = 'Y';
		
		printfirstRow(data);
		System.out.println(" \n ");
		
		printlastRow(data);
		System.out.println(" \n ");
		
		printfirstColumn(data);
		System.out.println(" \n ");
		
		public static void printfirstRow(int[][] data)
		{
			System.out.println("First row: " );
			for (int = 0; i < firstRow[0].length; i++) 
			{
				System.out.println((char)firstRow[0][i] );
			}
		}

		public static void printLastrow(int [][] data)
		{
			System.out.println("Last row: ");
			{
				for (int = 0; i < lastRow[4].length; i++) {
					System.out.println((char)lastRow[4][i] );
				}
			}
		}
		
		
		public static void printFirstColumn(int[][] data)
		{
			System.out.println("First Column ");
			{
				for (int = 0; i < firstColumn[0].length; i++) {
					System.out.println((char) firstColumn[i][0]);
				}
			}
		
	}
}
}

		
		
		
		