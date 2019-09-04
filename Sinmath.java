package chapter3;

public class Sinmath {

	public static void main(String [] args) {
	table(360, 30);
	System.out.println();
	table(100, 10);
	} //end of main

	public static void table(int maximum, int increment)
	{
		System.out.println("n\tsin(n)\tcos(n)");
		int entries = maximum / increment;
		for (int i = 0; i <= entries; i++)
		{
		int n = i * increment;
		double myRadian = Math.toRadians(n);
		System.out.println(n + "\t" + rounding(Math.sin(myRadian)) + "\t" +  rounding(Math.cos(myRadian)));
			
		}
	} // end of table method

	public static double rounding(double sine) 
	{
		return Math.round(sine * 100.)/100.;
	} 
} 

