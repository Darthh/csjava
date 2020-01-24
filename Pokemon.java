package TestingThings;

public class Pokemon{
    private int health;
    private int strength;
    private int speed; //speed does nothing rn
    private String name;
    
    public Pokemon(String name, int health, int strength, int speed){
       
        this.health = health;
        this.strength = strength;
        this.speed = speed;
        this.name = name;
        
    }  
    
    
    
    
    public static void battle(Pokemon pokemon1, Pokemon pokemon2)
    {
        System.out.println(pokemon1.name+" begins the fight against "+pokemon2.name);
        while
        (pokemon1.health >= 1 || pokemon2.health >= 1)
        {

            pokemon2.health = pokemon2.health - pokemon1.strength;

            System.out.println(pokemon1.name +" does "+ pokemon1.strength +" damage to "+
                pokemon2.name +" and "+ pokemon2.name +" has "+ pokemon2.health +" health left.");

            if
            (pokemon2.health <= 0)
            break;

            pokemon1.health = pokemon1.health - pokemon2.strength;

            System.out.println(pokemon2.name +" does "+ pokemon2.strength +" damage to "+ 
                pokemon1.name +" and "+ pokemon1.name +" has "+ pokemon1.health +" health left.");

        }

        if
        (pokemon1.health < 1)
            System.out.println(pokemon1.name +" has lost the fight");
        else
            System.out.println(pokemon2.name +" has lost the fight");
    }
}