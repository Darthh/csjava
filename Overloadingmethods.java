package chapter3;

public class Overloadingmethods {

	public static void main(String[] args) {
		int number = 5;
		String text = "What a great day today is!";
		howManyTimes();
		howManyTimes(number, text);
	}
	
	private static void howManyTimes(int number, String text)
	{
		System.out.println("Call within overloaded method");
		for(int i = 1; i<=number; i++)
		{
			System.out.println(text);
		}
	}
	
	public static void howManyTimes() 
	{
		System.out.println("--Call withing default method--");
		int repeat = 1;
		for (int i = 1; 1<= repeat; i++)
		
		{
			System.out.println("I print up to " + 1 + " times(s)");
			System.out.println();
		}
	}
}
