package PokemonThingy;

public class Pokemons {
private boolean isFishing;
private boolean isFighting;
private int hitPoints;
private int amountOfDamage;
public boolean isFishing() {
 return isFishing;
}
public void setFishing(boolean isFishing) {
 this.isFishing = isFishing;
}
public boolean isFighting() {
 return isFighting;
}
public void setFighting(boolean isFighting) {
 this.isFighting = isFighting;
}
public int getHitPoints() {
 return hitPoints;
}
public void setHitPoints(int hitPoints) {
 this.hitPoints = hitPoints;
}
public int damage(int amountOfDamage, int hitPoints) {
 amountOfDamage = this.amountOfDamage;
 hitPoints = this.hitPoints;
 return hitPoints - amountOfDamage;
 
}
//1B: A field declares a certain value to be stored within the class.
//This field can be used anywhere within a class. A parameter is declared within
//a method and can only be accessed within that method but a copy can be returned
//outside of the method.
public Pokemons(int hitPoints) {
 this.hitPoints = hitPoints;
 
}

}
class client{
 //in the client class I used the Pokemans class to declare
 //each pokemon with their HP values inputed.
 public static void main(String[] args) {
  Pokemons charmander = new Pokemons(39);
  Pokemons raichu = new Pokemons(60);
  
 }
}