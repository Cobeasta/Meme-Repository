package main;
/**
 * Class for creation of characters. Each instance of this will contain variables associated with the enum
 * statistics and the health. This will also have to contain a method for moving on the map.
 * @author Coby
 *
 */
public class Character {
Classes type;
int team;
public Character(Classes type, int team){
	this.type = type;
	this.team = team;
}

}
