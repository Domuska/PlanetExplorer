package org.unioulu.tol.sqat2015.planetExplorer;

public class Planet {

	private int x;
	private int y;
	
	private final int DEFAULT_X_SIZE = 50;
	private final int DEFAULT_Y_SIZE = 50;
	
	/**
	 * Reverts to 50,50 if the values given in are not good,
	 * negative values for an example
	 * @param x plane size of the new planet
	 * @param y plane size of the new planet
	 */
	public Planet(int x, int y){
		
		if(x > 0){
			this.x = x;
		}
		else{
			this.x = DEFAULT_X_SIZE;
		}
			
		
		if(y > 0){
			this.y = y;
		}
		
		else{
			this.y = DEFAULT_Y_SIZE;
		}
	}


	public int getX() {
		return x;
	}


	public int getY() {
		return y;
	}


	public Object getContents(int i, int j) {
		// TODO Auto-generated method stub
		return null;
	}


	public void addObstacle(int i, int j) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
