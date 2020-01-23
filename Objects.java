package chapter2020;

import java.util.concurrent.ThreadLocalRandom;

public class Objects 
{
	private int x;
	private int y;
	
	//priv
	public Objects(int first, int second)
	{
		this.x = first;
		this.y = second;
	}
	
	
	//object
	public Objects(int numPts)
	{
		createPointsArray(numPts);
		
		
	}
	
	
	//creates array with limits
	public void createPointsArray(int numPts)
	{
		int lowLimit, highLimit;
		Objects[] myArray = new Objects[numPts];
		lowLimit = ThreadLocalRandom.current().nextInt(1, 50);
		highLimit = ThreadLocalRandom.current().nextInt(51, 100);
		for (int i = 0; i < myArray.length; i++)
		{
			myArray[i] = new Objects(lowLimit, highLimit);
		
		lowLimit = ThreadLocalRandom.current().nextInt(1, 50);
		highLimit = ThreadLocalRandom.current().nextInt(51, 100);
		System.out.println(myArray[i]);
		}
	}
	@Override
	public String toString()
	{
		return "(" + x + "," + y + ")";
	}
	
	
}//eoc

	



class ObjectsClient
{
	public static void main(String[] args)
	{
		new Objects(5);
	}
	
	
	
}//eoc