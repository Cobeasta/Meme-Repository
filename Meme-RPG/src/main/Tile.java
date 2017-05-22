package main;

import java.awt.Color;
import java.awt.Graphics;

public class Tile {
	Color rough, smooth;
	
public boolean moveable;
public Tile(){
	
	
}
public void setTerrain(int terrain){
	if(terrain == 0){
		moveable = false;
		
	}
	else{
		moveable =true;
	}
	
}
public void draw(Graphics g){
	
}
}
