package chapter3;

import java.util.Scanner;

public class Mathapi {
	
public static void main(String args[]){
	q1();
	q2();
	q3();
}
	public static void q1() {
		//variables for question 2

		
		
		
		
	final Double R = 8.314;
	Double pressure;
	Double volume;
	Double n;
	Double temperature;
	//Varibles

	final double MIN_PRESSURE = 0;
	final double MAX_PRESSURE = 200;
	final double MIN_VOLUME = 0;
	final double MAX_VOLUME = 500;
	final double MIN_N = 0;
	final double MAX_N = 200;
	final double MIN_TEMPERATURE = 223;
	final double MAX_TEMPERATURE = 423;
	//range of variables
	
	Scanner scan = new Scanner(System.in);
	System.out.println("What value do you want to solve for?");
	System.out.println("Type 'P' for Pressure. 'V' for Volume.  'n' for # of moles. Or 'T' for Temperature.");
	String value = scan.nextLine();
	//scanner input , u put number or letter
	
	while(!value.equalsIgnoreCase("P") && !value.equalsIgnoreCase("V") && !value.equalsIgnoreCase("n") && !value.equalsIgnoreCase("T")){
	value = scan.nextLine();
	}
	//resets back to step 1, if doesn't put p , v , n or t :) made this
	{
	
		if(value.equalsIgnoreCase("P")){
			System.out.println("What is the volume in m^3 or L?  (Must be between 0-500)");
			volume = scan.nextDouble();
			while(volume < MIN_VOLUME || volume > MAX_VOLUME){
				System.out.println("Volume value is invalid.");
				volume = scan.nextDouble();
			}
		
			System.out.println("What is the number of moles?  (Must be between 0-200)");
			n = scan.nextDouble();
			while(n < MIN_N || n > MAX_N){
				System.out.println("N value is invalid. ");
				n = scan.nextDouble();
			}
			
			System.out.println("What is the tempertaure in K?  (Must be between 223-423)");
			temperature = scan.nextDouble();
			while(temperature < MIN_TEMPERATURE || volume > MAX_TEMPERATURE){
				System.out.println("Temperature value is invalid. ");
				temperature = scan.nextDouble();
			}
			//equation for pressure
			pressure = (n * R * temperature)/ volume;
			System.out.println("The pressure is " + pressure + " atm");
		}
		//scanner output if types p
	
		if(value.equalsIgnoreCase("V")){
			System.out.println("What is the pressure in atm?  (Must be between 0-200)");
			pressure = scan.nextDouble();
			while(pressure < MIN_PRESSURE || pressure > MAX_PRESSURE){
				System.out.println("Pressure value is invalid. ");
				pressure = scan.nextDouble();
			}
		
			System.out.println("What is the number of moles?  (Must be between 0-200)");
			n = scan.nextDouble();
			while(n < MIN_N || n > MAX_N){
				System.out.println("N value is invalid. ");
				n = scan.nextDouble();
			}
		
			System.out.println("What is the tempertaure in K?  (Must be between 223-423)");
			temperature = scan.nextDouble();
			while(temperature < MIN_TEMPERATURE || temperature > MAX_TEMPERATURE){
				System.out.println("Temperature value is invalid.");
				temperature = scan.nextDouble();
			}
			//equation for volume
			volume = (n * R * temperature)/ pressure;
			System.out.println("The volume is " + volume + " m^3 or L");
		}
		//scanner output if types v
	
		if(value.equalsIgnoreCase("n")){
			System.out.println("What is the pressure in atm?  (Must be between 0-200)");
			pressure = scan.nextDouble();
			while(pressure < MIN_PRESSURE || pressure > MAX_PRESSURE){
				System.out.println("Pressure value is invalid. ");
				pressure = scan.nextDouble();
			}
			
			System.out.println("What is the volume in m^3 or L?  (Must be between 0-500)");
			volume = scan.nextDouble();
			while(volume < MIN_VOLUME || volume > MAX_VOLUME){
				System.out.println("Volume value is invalid. ");
				volume = scan.nextDouble();
			}
			
			System.out.println("What is the tempertaure in K?  (Must be between 223-423)");
			temperature = scan.nextDouble();
			while(temperature < MIN_TEMPERATURE || volume > MAX_TEMPERATURE){
				System.out.println("Temperature value is invalid.");
				temperature = scan.nextDouble();
			}
			//equation for moles / n
			n = (pressure * volume) /(R * temperature);
			System.out.println("The # of moles is " + n);
		}
		//scanner output if types n
	
		if(value.equalsIgnoreCase("T")){
			System.out.println("What is the pressure in atm?  (Must be between 0-200)");
			pressure = scan.nextDouble();
			while(pressure < MIN_PRESSURE || pressure > MAX_PRESSURE){
				System.out.println("Pressure value is invalid. ");
				pressure = scan.nextDouble();
			}
			
			System.out.println("What is the volume in m^3 or L?  (Must be between 0-500)");
			volume = scan.nextDouble();
			while(volume < MIN_VOLUME || volume > MAX_VOLUME){
				System.out.println("Volume value is invalid. ");
				volume = scan.nextDouble();
			}
			
			System.out.println("What is the number of moles?  (Must be between 0-200)");
			n = scan.nextDouble();
			while(n < MIN_N || n > MAX_N){
				System.out.println("N value is invalid.");
				n = scan.nextDouble();
			}
			//equation for temperature
			temperature = (pressure * volume) /(n * R);
			System.out.println("The Temperature is " + temperature + " K");
			System.out.println("k done bye");
			//scanner output if types t	+ ending
			}
			}			
			}
			public static void q2() {
			
				
				
				
				
			}
			public static void q3() {
	}
}




