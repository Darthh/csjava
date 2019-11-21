package chapter8;

public class twoDimensional {

	public static void main(String[] args) {
		
		int rows, columns;
		
		int[][] Testing = new int[100][50];
		for (rows = 0; rows < 100; rows++ ) {
			for (columns = 0; columns < 50; columns++) {
				Testing[rows][columns] = rows + columns;
			}
		}
		System.out.println("Element at" + Testing);

	}

}
