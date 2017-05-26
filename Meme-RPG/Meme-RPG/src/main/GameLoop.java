package main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

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
	Character victim;
	ArrayList<Character> playerGroup;
	ArrayList<Character> aiGroup;
	public int left, right, up, down;
	Thread thread;
	Grid grid;
	int turn;
	Boolean running;
	Character player;
	
	/**
	 * Constructor
	 * TODO create charcters for player and ai.
	 */
	public GameLoop(){
		
		turn = 1;
		character = new Character(Classes.BLADEMASTER, up);
		victim = new Character(Classes.KNIGHT, left);
		left = 0; right = 1; up = 2; down = 3;
		grid = new Grid();
		setPreferredSize(new Dimension(FRAME.frameWidth.value(), FRAME.frameHeight.value()));
		setFocusable(true);
		Key key = new Key();
		addKeyListener(key);
		grid.createTerrain();
		
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
		//g.setColor(Color.BLACK);
		//g.fillRect(0, 0, FRAME.frameWidth.value(), FRAME.frameHeight.value());
		
		grid.drawTerrain(g);
		
	}
	/**
	 * Called repeatedly while running
	 */
	public void tick(){
		repaint();
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
	
	public void attack(Character attacker, Character victim){
		if(withinRange(attacker, victim)){
			attacker.energy-= 3;
			victim.loseHealth(attacker.damage);
			
		}
		else{
			return;
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
			if(turn == 1){
				
			switch(arg0.getKeyCode()){
			case KeyEvent.VK_W:
				character.move(GameObject.Direction.up);
				break;
			case KeyEvent.VK_S:
				character.move(GameObject.Direction.down);

				break;
			case KeyEvent.VK_A:
				character.move(GameObject.Direction.left);

				break;
			case KeyEvent.VK_D:
				character.move(GameObject.Direction.right);

				break;
			case KeyEvent.VK_SPACE:
				attack(character, victim);
				
			}
			System.out.println(arg0);
			}
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
	
	Tile[] field;
	/**
	 * Creates the grid. 
	 */
	public Grid(){
		field = new Tile[100];
	}
	
	public void createTerrain(){
		System.out.println("creating terrain.");
		Tile tile;
		
				InputStream is = null; 
			      InputStreamReader isr = null;
			      BufferedReader br = null;

			      try {
			   //   System.out.println(file);
			         // open input stream test.txt for reading purpose.
			         is = new FileInputStream(Main.file + "/src/assets/map.txt");
			         
			         // create new input stream reader
			         isr = new InputStreamReader(is);
			         
			         // create new buffered reader
			         br = new BufferedReader(isr);
			      
			         int value = 0;
			         int count = 0;
			         int count2 =0;
			         int count3 = 0;
			         // reads to the end of the stream 
			         while((value = br.read()) != -1) {
			         
			            // converts int to character
			            String c = String.valueOf(value);
			            int number = Integer.parseInt(c);
			            //48 is ASCii of 0
			           field[count3] = new Tile(number, new Point(count, count2));
			           System.out.println(count +" " + number);
			            // prints character
			            if(count < 9){
			            	count++;
			            	
			            }
			            else{
			            	count2++;
			            	count = 0;
			            }
			            count3++;
			         }
			         
			      } catch(Exception e) {
			         e.printStackTrace();
			      } finally {
			         
			         // releases resources associated with the streams
			         if(is!=null)
						try {
							is.close();
						} catch (IOException e2) {
							// TODO Auto-generated catch block
							e2.printStackTrace();
						}
			         if(isr!=null)
						try {
							isr.close();
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
			         if(br!=null)
						try {
							br.close();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
			      }
			      repaint();
		}
//				field[i][temp] = new Tile();
//				tile = field[i][temp];
//				tile.setTerrain((int) Math.random());
				
		public void drawTerrain(Graphics g){
			for(Tile t: field){
				if(t != null){
				t.draw(g);
				}
			}
		}
		/**
		 * 
		 * @param x 0-9 coordinate on map
		 * @param y 0-9 coordinate on map
		 * @return
		 */
		public boolean checkTerrainMoveable(int x, int y){
			int placeX;
			int placeY;
			placeX = x;
			placeY = y*10;
			if(field[placeX + placeY].isMoveable()){
				return true;
			}
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


}


