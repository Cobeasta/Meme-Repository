package main;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class DataPanel extends JPanel  {
	@Override
	public void paint(Graphics g){
		g.setColor(Color.GREEN);
		g.fillRect(0, 0, FRAME.frameWidth.value(), FRAME.frameHeight.value());
	}

}
