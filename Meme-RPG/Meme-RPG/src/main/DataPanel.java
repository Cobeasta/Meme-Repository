package main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;
/**
 * Class for the data panel on the right. This is where we add stats on the character.
 * @author Coby
 *
 */
public class DataPanel extends JPanel  {
	@Override
	public void paint(Graphics g){
		g.setColor(Color.GREEN);
		g.fillRect(0, 0, FRAME.frameWidth.value(), FRAME.frameHeight.value());
		setPreferredSize(new Dimension(100, FRAME.frameHeight.value()));
	}
	

}
