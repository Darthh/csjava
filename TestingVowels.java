package chapter8;

import java.util.*;

public class TestingVowels {
	
	public static int[] vowelCount(String string) {
		
	    int[] array = new int[5];
	    
	    for (int i = 0; i < string.length(); i++) {
	        char letter = string.charAt(i);
	        if(letter == 'a') {
	            array[0]++;
	        } else if (letter == 'e') {
	            array[1]++;
	        } else if (letter == 'i') {
	            array[2]++;
	        } else if (letter == 'o') {
	            array[3]++;
	        } else if (letter == 'u') {
	            array[4]++;
	        } 
	    }
	    return array;

	}
}

