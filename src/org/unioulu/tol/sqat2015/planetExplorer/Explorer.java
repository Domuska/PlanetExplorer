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
			this.y += 1;
			break;
		case "E":
			this.x += 1;
			break;
		case "S":
			this.y -= 1;
			break;
		case "W":
			this.x -= 1;
			break;
		
		}
	}
	
	public void moveBackward() {
		
		switch(orientation){
		
		case "N":
			this.y -= 1;
			break;
		case "E":
			this.x -= 1;
			break;
		case "S":
			this.y += 1;
			break;
		case "W":
			this.x += 1;
			break;
		
		}
	}

	public void turnRight() {
		
		switch(orientation){
		
		case "N":
			orientation = "E";
			break;
		case "E":
			orientation = "S";
			break;
		case "S":
			orientation = "W";
			break;
		case "W":
			orientation = "N";
			break;
		
		}
		
	}

	public void turnLeft() {
		switch(orientation){
		
		case "N":
			orientation = "W";
			break;
		case "E":
			orientation = "N";
			break;
		case "S":
			orientation = "E";
			break;
		case "W":
			orientation = "S";
			break;
		
		}
		
	}

	public void setPosition(int i, int j) {
		// TODO Auto-generated method stub
		
	}

	
	
	
}
