package main;

import java.awt.Color;
import java.awt.Graphics;

public class Tile extends GameObject{
	Color texture;
	int spacing = 198;
public boolean moveable;
public Tile(){
	
	
}
public void setTerrain(int terrain){
	if(terrain == 0){
		moveable = false;
		texture = new Color(139,69,19);
		
	}
	else{
		moveable =true;
		texture = new Color(0, 100, 0);
	}
	
}
public void draw(Graphics g){
	g.setColor(texture);
	g.fillRect((int) location.getX(), (int) location.getY(), spacing, spacing);
	
}
}
