package main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.plaf.basic.BasicSplitPaneUI.KeyboardUpLeftHandler;
/**
 * Loop for game functionality. This is where the game activity will take place. It will contain turns and have
 * the AI as a subclass of it.
 * <P>WARNING You must change turn between 1 and 2.
 * @author Coby
 *
 */
public class GameLoop extends JPanel implements Runnable{
	Character character;
	ArrayList<Character> playerGroup;
	ArrayList<Character> aiGroup;
	public int left, right, up, down;
	Thread thread;
	int turn;
	Boolean running;
	/**
	 * Constructor
	 * TODO create charcters for player and ai.
	 */
	public GameLoop(){
		turn = 1;
		left = 0; right = 1; up = 2; down = 3;
		setPreferredSize(new Dimension(FRAME.frameWidth.value(), FRAME.frameHeight.value()));
		setFocusable(true);
		Key key = new Key();
		addKeyListener(key);
		start();
		
	}
	/**
	 * starts the thread and sets running to true. 
	 */
	public void start(){
		thread = new Thread();
		thread.start();
		running = true;
	}
	/**
	 * Called periodically, draws the game elements on the game portion of the frame. The way to invoke this
	 * method in this section of code is to call repaint() in this class.
	 */
	@Override
	public void paint(Graphics g){
		g.setColor(Color.BLACK);
		g.drawRect(0, 0, FRAME.frameWidth.value(), FRAME.frameHeight.value());
	}
	/**
	 * Called repeatedly while running
	 */
	public void tick(){
		
	}
	/**
	 * run method. While running this calls tick() over and over while the app is active. Keep this method as
	 * simple as possible and use it to invoke other methods repeatedly.
	 */
	@Override
	public void run() {
		while(running){
			tick();
		}
	}	
	
	public boolean withinRange(Character one, Character two){
		double distance;
		if(one.location.getX() == two.location.getX()){
			distance = Math.abs(one.location.getX() - two.location.getX());
			if(distance < one.range) return true;
		}
		if(one.location.getY() == two.location.getY()){
			distance = Math.abs(one.location.getY() - two.location.getY());
			if(distance < one.range) return true;
		}
	
		return false;
		
	}
	
	public void attack(Character attacker, Character victim, int direction){
		if(withinRange(attacker, victim)){
			victim.loseHealth(attacker.damage);
		}
	}
	/**
	 * Key listener for the game.
	 * @author Coby
	 *
	 */
	 class Key implements KeyListener{
		/**
		 * Called every time a key is pressed in. Holding a key will call this repeatedly.
		 */
		@Override
		public void keyPressed(KeyEvent arg0) {
			
		}
/**
 * Called every time a key is released. Good for when you only want to move once and not mistake for multiple.
 */
		@Override
		public void keyReleased(KeyEvent arg0) {
			switch(arg0.getKeyCode()){
			case KeyEvent.VK_W:
				break;
				
			}
			System.out.println(arg0);
		}
/**
 * Called every time a key is typed. This works for most of the key but not all. For example, arrows.
 */
		@Override
		public void keyTyped(KeyEvent arg0) {
		}
		
	}

/**
 * This is the AI. It will access variables like  a player but have a method called whenever it is the AI's turn.
 * @author Coby
 *
 */
public class AI{
	
	public AI(){
		
		
	}
	/**
	 * Main algorithim to move. This checks in order the different methods to identify the situation. The
	 * order it does these in determines the priority of the move. 
	 * @param int direction: use GameLoop.left, 
	 */
	public void move(int direction){
		switch(direction){
		case 0:
			break;
		case 1:
			break;
		case 2:
			break;
		case 3:
			break;
		default:
			
			break;
		
			
		}
	}

	/**
	 * Moves away from the enemy
	 */
	public void runAway(){
		
	}

	public void moveRandom(Character attacker, Character victim){
		
	}
	/**
	 * 
	 */
	
	/**
	 * Checks if any enemies are within range. If so returns the character.
	 * TODO 
	 * @return
	 */
	
	/**
	 * Checks the health of nearby enemies. Returns the character with the least health.
	 * @return
	 */
	public boolean almostDead(){
		return false;
		
	}
	/**
	 * Creates characters for each team. Each team should get a certain amount of each character.
	 */
	public void createCharacters(){
		
		
	}
	
	
}
/**
 * Grid class. Field for game.
 * @author Miles
 *
 */
public class Grid{
	
	Tile[][] field;
	/**
	 * Creates the grid. 
	 */
	public Grid(){
		field = new Tile[19][19];
	}
	
	public void createTerrain(){
		Tile tile;
		for(int i = 0; i < 20; i++){
			for(int temp = 0; temp < 20; temp++){
				
				field[i][temp] = new Tile();
				tile = field[i][temp];
				tile.setTerrain((int) Math.random());
				
			}
		}
		
	}
}


/**
 * Calculates the distance between the character requested.
 * @return
 */
public int findDistance(Character character){
	return 0;
	
}

/**
 * Moves a certain direction 1 square.
 */
public void goTo(){
	
}
/**
 * Attacks an enemy a certain direction.
 */
public void attack(Character character){
	
}

	
}

