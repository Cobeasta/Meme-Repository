package main;

import java.awt.Point;

public class GameObject {
	Direction direction; 
	Point location;
	public void setLocation(Point p){
		location = p;
		direction = Direction.up;
	}
	public enum Direction{left, right, down, up}
	public void move(Direction direction){
		this.direction = direction;
		switch(direction){
			case left:
				
				location.setLocation(location.getX() -1, location.getY());
				break;
			case right:
				location.setLocation(location.getX() +1, location.getY());
				break;
			case up:
				location.setLocation(location.getX(), location.getY() + 1);
				break;
			case down:
				location.setLocation(location.getX(), location.getY() -1);
				break;
			default:
				break;
		}
	}
	
}
