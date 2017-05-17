package main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.plaf.basic.BasicSplitPaneUI.KeyboardUpLeftHandler;
/**
 * Loop for game functionality. This is where the game activity will take place. It will contain turns and have
 * the AI as a subclass of it.
 * @author Coby
 *
 */
public class GameLoop extends JPanel{
	/**
	 * Constructor
	 */
	public GameLoop(){
		setPreferredSize(new Dimension(FRAME.frameWidth.value(), FRAME.frameHeight.value()));
		setFocusable(true);
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
	
	
	
	
	
	
	
	//Graphics methods
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
			// TODO Auto-generated method stub
			
		}
/**
 * Called every time a key is typed. This works for most of the key but some have odd behavior (arrows, num pad
 * etc).
 */
		@Override
		public void keyTyped(KeyEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		
	}	
}

