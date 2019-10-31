package chapter5;

import java.util.*;
import java.util.Arrays;


public class TestingBC {

	public static void main(String[] args) {

		int[] data = new int[8];
		data[0] = 3;
		data[7] = -18;
		data[4] = 5;
		data[1] = data[0];

		int x = data[4];
		data[4] = 6;
		data[x] = data[0] * data[1];


		

        System.out.println(Arrays.toString(data));
        
		}
		
	}
	
