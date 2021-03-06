package tiles;

public abstract class Tile {
	protected String description;
	protected boolean walkable;
	
	public final boolean isWalkable() { return this.walkable; }
	public final String toString() { return this.description; }
	
	public abstract char getSymbol();
}
