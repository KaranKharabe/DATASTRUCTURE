package datastructure.arrays.java;

public class Kite {
	
	String color;
	String owner;
	int length;
	boolean flying;
	Kite next; //self refrential Data structure 
	public Kite(String color, String owner, int length, boolean flying) {
		super();
		this.color = color;
		this.owner = owner;
		this.length = length;
		this.flying = flying;
		
	}
	@Override
	public String toString() {
		return "Kite [color=" + color + ", owner=" + owner + ", length=" + length + ", flying=" + flying +"]";
	}

}
