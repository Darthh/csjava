package chapter9;

import java.util.*;

public class ArrayList_Intro {

	public static void main(String[] args)
	{
		
		int myArray[] = new int[5];
		for(int i: myArray)
		{
			System.out.println(i + " ");
		}
		
		
		ArrayList<String>spongebob = new ArrayList<String>();
		spongebob.add("Patrick Star");
		spongebob.add("Squidward Tentacles");
		spongebob.add("Mr Krabs.");
		spongebob.add("Pikachu");
		spongebob.add("Sandy Cheecks");
		spongebob.add("Spongebob");
		spongebob.add("Spongebob");
		
		
		
		//Remove and add items
		System.out.println("Some of the characters are: " + spongebob); //references back to arraylist string "spongebob"
		spongebob.remove(2); //delete 2
		System.out.println("Some of the characters are : " + spongebob);
		spongebob.add(2, "Faith");
		System.out.println("Some of the characters are : " + spongebob);
		
		//checks for pikachu with boolean and containword
		//String word = "Pikachu";
		//boolean hasPikachu = spongebob.contains(word);
		//System.out.println("spongebob contains Pikachu?:" + hasPikachu);
		//System.out.println("Get the 1st item on the ArrayList" + spongebob.get(0));
		
		//Count how many times the word pikachu is found on the arraylist spongebob
		
	
		//spongebob.size(6) i++
		int countPikachu = 0;
		for(int i = 0; i< spongebob.size(); i++) {
			if(spongebob.get(i) == "Pikachu")
			{
				countPikachu++;
			}
		}
			System.out.println("Pikachu occurs " + countPikachu + " times ");
			spongebob.clear();
			System.out.println(spongebob);
		
			ArrayList<String> list = new ArrayList<String>();
			list.add("Four");
			list.add("score");
			list.add("and");
			list.add("seven");
			list.add("years");
			
			//Create a method which duplicates each value on the original
			//ArrayList and call the method: stutter
			
			mlafs;
			
			
			
			
			
			
			
			
	}

}
