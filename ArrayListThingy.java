package chapter9;

import java.util.*;

public class ArrayListThing
		{
			
		public static void main(String[] args)
		{
			
			Scanner input = new Scanner(System.in);
			
		/*testing scenarios and arrays
		 * Uncomment the following String arrays and test cases*/
			
			

			ArrayList<String>removeAll = new ArrayList<String>();
		          String[] data1 = {"a", "b", "c", "a", "b", "c", "a", "b", "c"};
		          removeAll.add("a");
		          removeAll.add("b");
		          removeAll.add("c");
		          removeAll.add("a");
		          removeAll.add("b");
		          removeAll.add("c");
		          removeAll.add("a");
		          removeAll.add("b");
		          removeAll.add("c");
		          
		          
		          
		          
		          test(data1, "a");
		          test(data1, "b");
		          test(data1, "c");
		          String[] data2 = {"a", "a", "a", "a", "a", };
		          test(data2, "a");
		          test(data2, "b");
		          String[] data3 = {};
		          test(data3, "a");
		          
		          System.out.println("Some of the characters are: " + removeAll); //references back to arraylist string "spongebob"
		  		removeAll.remove(1); //delete 2
		
		}
		public static void test()
		{
		/*Fill missing lines of code here*/
		/*Make sure you convert this array into an ArrayList structure
		 * Then, make a call to the method: removeAll, passing
		 * the ArrayList structure and the target value to remove*/
		System.out.println();
		}
		public static void removeAll()
		{
		}
		
		//End of class
	
	}


