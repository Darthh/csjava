package TestingThings;

public class PokemonTester{
	//all pokemon
	  private Pokemon charizard;
	  private Pokemon blastoise;
	  private Pokemon wailord;
	  private Pokemon snorlax;
	  private Pokemon groudon;
	  private Pokemon kyogre;
	 
	  public PokemonTester(){
		  //battle 1 poke 1 and 2
		   charizard = new Pokemon("Charizard", 100,50,50);
		   blastoise = new Pokemon("Blastoise", 150,25,150);
		   
		   //battle 2 poke 3 and 4 bugs with 2nd
		   wailord = new Pokemon("Wailord", 300, 500, 400);
		   snorlax = new Pokemon("Snorlax", 200, 300, 200);
		   
		   //battle 3 poke 5 and 6
		   groudon = new Pokemon("Groudon", 250, 100, 100);
		   kyogre = new Pokemon("Kyogre", 300, 80, 80);
		   
		 }
	  
	  
	  
	  
	  public static void main(String[] args){
		    PokemonTester tester=new PokemonTester();
		    Pokemon.battle(tester.charizard, tester.blastoise);
		    Pokemon.battle2(tester.wailord, tester.snorlax);
		    Pokemon.battle3(tester.groudon, tester.kyogre);
		    
		    
	}
	}