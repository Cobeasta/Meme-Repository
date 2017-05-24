package data;

public enum TileType {
	
	Grass("grass_tex", true), Dirt("dirt_tex", false);

	String textureName;
	boolean buildable;
	
	TileType(String textureName, boolean buildable){
		this.textureName = textureName;
		this.buildable = buildable;
	}
}
