package main;

import java.awt.GridLayout;

import javax.swing.JFrame;

public class Main extends JFrame{
	public static String file =System.getProperty("user.dir") ;

	JFrame frame;
	public Main(){	
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(FRAME.	frameWidth.value(), FRAME.frameHeight.value());
		System.out.println("APPLICATION_INFO:     Frame created");
		create();
	}
		public void create(){
			setResizable(false);
			setLayout(new GridLayout(1, 1));
			setLocation((FRAME.screenWidth.value()/2)-FRAME.frameWidth.value()/2, 0);
			GameLoop game = new GameLoop();
			DataPanel panel = new DataPanel();
			add(game);
			//add(panel);
			setVisible(true);
			setResizable(true);
//				
//			}
		}
	/**
	 * Called upon start of the app.
	 * @param args
	 */
	public static void main(String[] args) {
	new Main();

	}

}
