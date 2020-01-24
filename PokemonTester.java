package TestingThings;

public class PokemonTester{
	  private Pokemon charizard;
	  private Pokemon blastoise;
	 
	  public PokemonTester(){
		   charizard = new Pokemon("charizard", 100,50,50);
		   blastoise = new Pokemon("blastoise", 150,25,150);
		 }
	  
	  public static void main(String[] args){
		    PokemonTester tester=new PokemonTester();
		    Pokemon.battle(tester.charizard, tester.blastoise);
		
		    
		    
	}
	}