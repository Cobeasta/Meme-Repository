package main;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;

public class Tile extends GameObject{
	Color texture;
	int sGrass = 49;
	int sWater = 48;
	int spacing = 64;
	BufferedImage img;
public boolean moveable;
Image type;

public Tile(int i, Point location){
	this.location = location;
	if(i == sGrass ){
		type = Toolkit.getDefaultToolkit().getImage(Main.file +"/src/grass_tile.png");
		texture = new Color(139,69,19);
		moveable = true;

	}
	else if(i == sWater){
		type = Toolkit.getDefaultToolkit().getImage(Main.file +"/src/water_tile.png");
		texture = new Color(0, 0, 255);
		moveable = false;

	}
	 img = new BufferedImage(64, 64, BufferedImage.TYPE_INT_ARGB);
	Graphics2D g = img.createGraphics();
	g.drawImage(type, 0, 0, null);
	
	
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
		
		g.drawImage(type, (int) location.getX() * spacing, (int) location.getY() * spacing, null);
//		g.setColor(texture);
//		g.fillRect((int) location.getX()*64,(int) location.getY()*64, 198, 198);
	//System.out.println(location.getX() +" " +location.getY() +" " +location.getX() * 64 + " " +location.getY() * 64 + " " +texture);

	}
	public boolean isMoveable(){
		if(moveable == true){
			return true;
			
		}
		return false;
	}

}
