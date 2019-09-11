package chapter3;
 
public class Thingything {
	
	    public static void main(String[] args) {
	    	System.out.println("Question 1:");
	        System.out.println(middleThree("Candy"));
	        System.out.println(middleThree("and"));
	        System.out.println(middleThree("solving"));
	        
	        System.out.println();
	    	System.out.println("Question 2:");
	        System.out.println(hasBad("badxx"));
	        System.out.println(hasBad("xbadxx"));
	        System.out.println(hasBad("xxbadxx"));
	        
	        System.out.println();
	    	System.out.println("Question 3:");
	        System.out.println(frontAgain("edited"));
	        System.out.println(frontAgain("edit"));
	        System.out.println(frontAgain("ed"));
	        
	        System.out.println();
	        System.out.println("Question 4:");
	        System.out.println(makeOutWord("<<>>", "Yay"));
	        System.out.println(makeOutWord("<<>>", "WooHoo"));
	        System.out.println(makeOutWord("[[]]", "word"));
	        
	        System.out.println();
	        System.out.println("Question 5:");
	        System.out.println(nonStart("Hello", "There"));
	        System.out.println(nonStart("java", "code"));
	        System.out.println(nonStart("shotl", "java"));

	        System.out.println();
	        System.out.println("Question 6:");
	        System.out.println(right2("Hello"));
	        System.out.println(right2("java"));
	        System.out.println(right2("Hi"));
	    }
	    //question 1
	    public static String middleThree(String str) {

	        if (str.length() > 3) {
	            return str.substring(str.length() / 2 - 1, str.length() / 2 + 2);
	        }
	        return str;
	    }
	
	    //question 2
	    public static boolean hasBad(String str) {
	    		
	    	 if (str.length() > 3)
	             if (str.substring(0, 3).equals("bad"))
	                 return true;
	         if (str.length() > 3)
	             if (str.substring(1, 4).equals("bad"))
	                 return true;
	         return false;
	     } 		
	    //question 3
	    public static boolean frontAgain(String str) {

	        if (str.length() > 1) {
	            return str.substring(0, 2).equals(str.substring(str.length() - 2, str.length()));
	        }
	        return false;
	    } 
	    //question 4
	    public static String makeOutWord(String out, String word) {
	        return out.substring(0, 2) + word + out.substring(2, 4);
	    }
	    //question 5
	    public static String nonStart(String a, String b) {
	        return a.substring(1, a.length()) + b.substring(1, b.length());
	    }
	    //question 6
	    public static String right2(String str) {
	        String first = str.substring(str.length() - 2, str.length());
	        String end = str.substring(0, str.length() - 2);
	        return first + end;
	    }
	    
}



