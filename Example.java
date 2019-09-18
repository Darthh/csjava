package chapter3;

public class Example {
    public static void main(String[] args) {
        System.out.println();
    	System.out.println("frq:");
        System.out.println(frontAgain("edited"));
        System.out.println(frontAgain("edit"));
        System.out.println(frontAgain("ed"));
	
    }

	   public static boolean frontAgain(String str) {

	        if (str.length() > 1) {
	            return str.substring(0, 2).equals(str.substring(str.length() - 2, str.length()));
	        }
	        return false;
	   }
}