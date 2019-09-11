package chapter3;

import java.util.Scanner; 

public class PasswordThingy {
		 
	    public static void main(String[] args){
	 
	    	//password is patrick123 is set
	        String password = "Patrick123";
	        
	        //input is next line
	        String inputPass;
	        
	        //scaner
	        Scanner input = new Scanner(System.in);
	         
	        //prints enter your password
	        System.out.println("Enter your password: ");
	        inputPass = input.nextLine();
	        
	        //if print is = then will print welcome dude
	        if (inputPass.equals(password)) {
	            System.out.println("Welcome dude! (>'-')> <('-'<) ^(' - ')^ <('-'<) (>'-')>");
	            
	        } else {
	        	//if it isnt the right password it prints burh enter the right one , prints twice
	            for (int i = 0; i < 2; i++) {
	                System.out.println("Bruh enter the right password:");
	                inputPass = input.nextLine();
	                
	                //if it does correctly on 2nd or 3rd well = print again welcome dude
	                if (inputPass.equals(password)) {
	                    System.out.println("Welcome dude");
	                } 
	              }
	            //if fails all 3 attempts will print = ok u dont get in
	         System.out.println("Ok you dont get in then, bye");
	        }
	    }
	}