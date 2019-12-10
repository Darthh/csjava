package chapter8;

import java.util.*;


public class Notes {
	
	public static void main(String[] args)
	{

		Scanner input = new Scanner(System.in);
		
		int days = 30;
		Integer days_wrapped = Integer.valueOf(days);
		System.out.println(days_wrapped.getClass());
		
		
		Double days_wrapped1 = Double.valueOf(days);
		System.out.println(days_wrapped.getClass());
		
		//doubles and and gets value of wrapped which is int days =30
		double backToPrimitive = days_wrapped.doubleValue();
		System.out.println(backToPrimitive);
	
		HashMap<String, String> capitalCities = new HashMap<String, String>();
		capitalCities.put("England", "London");
		capitalCities.put("Germany", "Berlin");
		capitalCities.put("Canada", "Toronto");
		capitalCities.put("Norway", "Oslo");
		capitalCities.put("USA", "Washington D.C.");
		capitalCities.put("Malaysia", "Kuala lumpur");
		
		//prints cities
		System.out.println(capitalCities);
		
		//gets value of said word in get
		String valuestring = capitalCities.get("Norway");
		System.out.println(valuestring);
		
		capitalCities.remove("Norway");
		System.out.println(capitalCities);
		
		int hashMap_size = capitalCities.size();
		System.out.println("Hashmap size: " + hashMap_size);
		
		for(String i: capitalCities.values()) {
			System.out.println("values: " + i);
		}
		
			System.out.println("Now print the keys");
			
		for(String i: capitalCities.keySet()) 
		{
			System.out.println("Keys: " + i);
		}
			
		capitalCities.clear();
		System.out.println(capitalCities);
		
		
	}

/*CREATE A STATIC METHOD WHICH RETURNS A HASHMAP
* INSTANTIATE A HASHMAP WIHTIN THE METHOD
* USE SCANNER TO ASK USER TO ADD ITEMS TO THE HASHMAP ONE AT A TIME
* UPDATE THE HASHMAP AS KEYS AND VALUES ARE ADDED TO IT
* YOU WILL ALSO ASK USER WHETHER OR NOT SHE/HE WANTS TO ADD ANOTHER ITEM
* IF USER ENTERS y = then, continue with another key and value.
* Else, if user enters "n", then, simply print the hashMap and return it.
* Use key = "George", value = 19*/
//End of main

public static HashMap<String, Integer> makePeople() {
boolean cont = true;
HashMap<String, Integer> people = new HashMap<String, Integer>();
Scanner scan = new Scanner(System.in);
while (cont) {
System.out.println("Enter a name: ");
String name = scan.nextLine();
System.out.println("Enter age: ");
int age = scan.nextInt();
Integer converted_int = Integer.valueOf(age);

people.put(name, converted_int);
System.out.println(people);

System.out.println("Do you wish to add another person? (y/n)");
String yesNo = scan.next();

if (yesNo.contentEquals("n")) {
cont = false;
System.out.println(people);
return people;
}
scan.nextLine();
}
return people;

		
		
}


}
