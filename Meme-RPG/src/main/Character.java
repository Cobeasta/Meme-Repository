package main;

import java.awt.Point;

/**
 * Class for creation of characters. Each instance of this will contain variables associated with the enum
 * statistics and the health. This will also have to contain a method for moving on the map.
 * @author Coby
 *
 */
public class Character extends GameObject{
Classes type;
int team;
int range;
int damage;
int health;
public Character(Classes type, int team){
	this.type = type;
	this.team = team;
	range = type.range();
	damage = type.attack();
	health = type.health();
}
public void loseHealth(int amount){
	health -=amount;
}


}
