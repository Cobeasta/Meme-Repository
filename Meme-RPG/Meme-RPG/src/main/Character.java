package main;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;

/**
 * Class for creation of characters. Each instance of this will contain variables associated with the enum
 * statistics and the health. This will also have to contain a method for moving on the map.
 * @author Coby
 *
 */
public class Character extends GameObject{
Classes type;
Image img;
int team;
int range;
int damage;
int health;
int energy;
public Character(Classes type, int team){
	 img = Toolkit.getDefaultToolkit().getImage(Main.file +"src/assets/spongebob.jpg");

	this.type = type;
	this.team = team;
	range = type.range();
	damage = type.attack();
	health = type.health();
}
public void loseHealth(int amount){
	health -=amount;
}
@Override
public void draw(Graphics g){
	g.drawImage(img, (int)location.getX(), (int)location.getY(), null);
}


}
