package TestingThings;

public class Pokemon{
    private int health; //health for all
    private int strength; //attack
    private int speed; //speed does nothing rn
    private String name; //names
    
    //stats for pokemon
    public Pokemon(String name, int health, int strength, int speed){
       //var
        this.health = health;
        this.strength = strength;
        this.speed = speed;
        this.name = name;
        
    }  
    
    //BATTLE 1
    public static void battle(Pokemon pokemon1, Pokemon pokemon2)
    {
    	
    	//prints pokemon name 1 against 2
        System.out.println(pokemon1.name+" begins the fight against "+pokemon2.name);
        while
        (pokemon1.health >= 1 || pokemon2.health >= 1)
        {
        	//hp - strength + damage to
            pokemon2.health = pokemon2.health - pokemon1.strength;

            //charizard against blast 1st move
            System.out.println(pokemon1.name +" uses Inferno and does "+ pokemon1.strength +" damage to "+
                pokemon2.name +" and "+ pokemon2.name +" has "+ pokemon2.health +" health left.");

            if //if still has hp then continues
            (pokemon2.health <= 0)
            break;

            // hp - strength + prints out damage to
            pokemon1.health = pokemon1.health - pokemon2.strength;

            //blastoise against charz 1st move 
            System.out.println(pokemon2.name +" uses Hydro Pump and does "+ pokemon2.strength +" damage to "+ 
                pokemon1.name +" and "+ pokemon1.name +" has "+ pokemon1.health +" health left.");

        }

        //if 1 has less than 0 hp print lose fight
        if
        (pokemon1.health <= 1)
            System.out.println(pokemon1.name +" has lost the fight");
        
        else
            System.out.println(pokemon2.name +" has lost the fight");
        System.out.println("------------------------------------------------------------------");
        	
    }
    
   
    //BATTLE 2
    public static void battle2(Pokemon pokemon3, Pokemon pokemon4) //bug with -hp
    {
    	
    	//prints pokemon name 1
        System.out.println(pokemon3.name+" begins the fight against "+pokemon4.name);
        while
        (pokemon3.health >= 1 || pokemon4.health >= 1)
        {
        
            System.out.println(pokemon3.name +" uses SELF DESTRUCT against " + pokemon4.name);
            
          //hp - strength + damage to
            pokemon3.health = pokemon3.health - pokemon3.strength;
            pokemon4.health = pokemon4.health - pokemon3.strength;
            
            System.out.println(pokemon3.name + " has taken " + pokemon3.strength + " damage and now has " + pokemon3.health + "health");
            System.out.println(pokemon4.name + " has taken " + pokemon3.strength + " damage and now has " + pokemon4.health + "health");
            

            if
            (pokemon4.health <= 0)
            break;

            // hp - strength + prints out damage to
            pokemon3.health = pokemon3.health - pokemon4.health;

            System.out.println(pokemon4.name +" does "+ pokemon4.strength +" damage to "+ 
                pokemon3.name +" and "+ pokemon3.name +" has "+ pokemon3.health +" health left.");

        }

        //if 1 has less than 0 hp print lose fight
        if
        (pokemon3.health <= 1)
            System.out.println("Both Pokemon have lost the fight");
    	
        else 
        	 System.out.println(pokemon4.name +" has lost the fight");
        System.out.println("------------------------------------------------------------------");
        
        
    }
    //BATTLE 3
    public static void battle3(Pokemon pokemon5, Pokemon pokemon6) 
    {
    	
    	//prints pokemon name 1
        System.out.println(pokemon5.name+" begins the fight against "+pokemon6.name);
        while
        (pokemon5.health >= 1 || pokemon6.health >= 1)
        {
        	//hp - strength + damage to
            pokemon6.health = pokemon6.health - pokemon5.strength;

            System.out.println(pokemon5.name +" uses Dragon tail and does "+ pokemon5.strength +" damage to "+
                pokemon6.name +" and "+ pokemon6.name +" has "+ pokemon6.health +" health left.");

            if
            (pokemon6.health <= 0)
            break;

            // hp - strength + prints out damage to
            pokemon5.health = pokemon5.health - pokemon6.strength;

            System.out.println(pokemon6.name +" uses Ice Beam and does "+ pokemon6.strength +" damage to "+ 
                pokemon5.name +" and "+ pokemon5.name +" has "+ pokemon5.health +" health left.");

        }

        //if 1 has less than 0 hp print lose fight
        if
        (pokemon5.health <= 1)
            System.out.println(pokemon5.name +" has lost the fight");
    	
        else 
        	 System.out.println(pokemon6.name +" has lost the fight");
        System.out.println("------------------------------------------------------------------");
        
        
           
    }
    
    
    
    
    
}