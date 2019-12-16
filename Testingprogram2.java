package chapter9;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Testingprogram2 {
	
	Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
	    ArrayList<Integer> random = new ArrayList<Integer>();
	    random = getRandom(10, 10);
	    for (int i = 0; i < random.size(); i++)
	        System.out.println(random.get(i));
	    
	    
	    
	    
	    
	}

	private static ArrayList<Integer> getRandom(int range, int size) {
	    ArrayList<Integer> randomNumbers = new ArrayList<Integer>();
	    for (int i = 0; i < size; i++)
	    	randomNumbers.add(new Random().nextInt(range)+1);
	    return randomNumbers;
	}
	

}
