package main;

import java.awt.GridLayout;

import javax.swing.JFrame;

public class Main extends JFrame{

	JFrame frame;
	public Main(){	
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(FRAME.	frameWidth.value(), FRAME.frameHeight.value());
		System.out.println("APPLICATION_INFO:     Frame created");
		create();
	}
		public void create(){
			setResizable(false);
			setLayout(new GridLayout(1, 2));
			setLocation((FRAME.screenWidth.value()/2)-FRAME.frameWidth.value()/2, 0);
			GameLoop game = new GameLoop();
			DataPanel panel = new DataPanel();
			add(game);
			add(panel);
			setVisible(true);
			setResizable(false);
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
