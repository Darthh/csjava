package chapter3;

public class Verse {

	public static void main(String[] args) {
		
		String text = new String("Hello");
		System.out.println(text);
		
		String s1 = "hello";
		String s2 = "how are you?";
		
		String combined = s1 + " " + s2;
		System.out.println(combined);
		
		int stringLength = s1.length();
		System.out.println(stringLength);
		System.out.println("Length of combined: " + combined.length());
		
		//*************************** notes 9/4 ***************************************
		
		String s = "today";
		int lengthOfs = s.length() - 2;
		System.out.println(s + " has " + lengthOfs + " characters ");
		
		String si = "Hasta ma\u00F1nana";
		System.out.println(si);
		
		for(int i = 0; i < si.length(); i++)
	{
	System.out.println(si.charAt(10));
	}
		
	System.out.println();
	for(int i = si.length() -1; i >= 0; i--)
	{
		System.out.println(si.charAt(i));
	}
	
		System.out.println();
		
		
		
		for(int i = 0; i < si.length(); i++) 
		{
			System.out.println(si.charAt(i % 2));
		}
		System.out.println(3%2);
		System.out.println(4%2);
		System.out.println(5%2);
	
		//-------------------------------------
		System.out.println();
		
		System.out.println("s2: " + s2);
		String extracted = s2.substring(0, 3);
		System.out.println(extracted);
		
		System.out.println(" you?");
		System.out.println(s2.substring(8, 12));
		System.out.println(s2.substring(8 ));
		System.out.println(s2.substring(8, 13));
		
		//-------------------------------------------------------
		System.out.println("Bus song: "); 
		int indexNumber = s2.indexOf('e');
	}
	
		public static void verse (String item, String lyric, String verb) {
		verse("wheels", "go", "round and round");
		verse("vipers", "go", "swish and swish");
		verse("horn", "goes", "beep and beep");
		


 	
}
}










