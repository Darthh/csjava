package chapter9;
import java.util.*; 
public class ToRemove {
	  
	    // Driver code 
	    public static void main(String[] args) 
	    { 
	  
	        // Initializing a list of type Linkedlist 
	        List<Integer> l = new LinkedList<>(); 
	        //lists all these
	        l.add(10); 
	        l.add(30); 
	        l.add(50); 
	        l.add(70); 
	        l.add(90); 
	        System.out.println(l); 
	  
	        
	        //new array list removes added
	        ArrayList<Integer> arr = new ArrayList<>(); 
	        arr.add(30); 
	        arr.add(50); 
	        //removes the list above
	        l.removeAll(arr); 
	  
	        
	        
	        //prints l's
	        System.out.println(l); 
	    } 
	
}
