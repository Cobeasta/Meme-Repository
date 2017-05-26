package data;

import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import org.newdawn.slick.opengl.Texture;

import static org.lwjgl.opengl.GL11.*;

import static helpers.Artist.*;

public class Boot {

	public static final int WIDTH = 1280, HEIGHT = 960;
	
	
	public Boot(){
		
		BeginSession();
		
	
		Tile tile = new Tile(TileType.Grass, 0, 64, 64, 0);
		Tile tile2 = new Tile(TileType.Dirt, 0, 64, 64, 64);
		while(!Display.isCloseRequested()){
	
			DrawQuadTex(tile.getTexture(), tile.getX(), tile.getY(), tile.getWidth(), tile.getHeight());
			DrawQuadTex(tile2.getTexture(), tile2.getX(), tile2.getY(), tile2.getWidth(), tile2.getHeight());
		
			Display.update();
			Display.sync(60);
			
		}
		
		Display.destroy();
	}
	
	public static void main(String[] args){
		new Boot();
	}
}
