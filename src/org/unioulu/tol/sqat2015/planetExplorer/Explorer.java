package org.unioulu.tol.sqat2015.planetExplorer;

public class Explorer {

	private int x,y;
	private String orientation; 
	private final String COMMA = ",";
	
	public Explorer(int x,int y, String orientation){
		
		this.x = x;
		this.y = y;
		this.orientation = orientation;
	}

	public String getPosition() {
		
		String position = "" + x + COMMA + y + COMMA + orientation;
		
		return position;
	}

	public void moveForward() {
		
		switch(orientation){
		
		case "N":
			this.x += 1;
			break;
		
		
		}
	}
}
