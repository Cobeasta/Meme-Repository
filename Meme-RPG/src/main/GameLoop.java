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
	
	
	
	
	/**
	 * Key listener for the game.
	 * @author Coby
	 *
	 */
	public class Key implements KeyListener{
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
	 */
	public void move(){
		
	}
	/**
	 * Moves away from the enemy
	 */
	public void runAway(){
		
	}

	public void moveRandom(){
		
	}
	/**
	 * 
	 */
	
	/**
	 * Checks if any enemies are within range. If so returns the character.
	 * TODO 
	 * @return
	 */
	public boolean withinRange(){
		return false;
		
	}
	/**
	 * Checks the health of nearby enemies. Returns the character with the least health.
	 * @return
	 */
	public boolean almostDead(){
		return false;
		
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

