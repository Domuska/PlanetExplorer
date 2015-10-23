package org.unioulu.tol.sqat2015.planetExplorer;

import java.util.ArrayList;

public class Planet {

	private int x;
	private int y;
	
	private ArrayList<Integer> obstacleArray = new ArrayList<>();
	
	private final int DEFAULT_X_SIZE = 50;
	private final int DEFAULT_Y_SIZE = 50;
	
	/**
	 * The maximum x and y coordinates that can be reached (100, 100
	 * makes a planet that has 101 and 101 planes)
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

	/**
	 * Check if there is an obstacle in the coordinates given
	 * @param x coord of the node to check
	 * @param y coord of the node to check
	 * @return empty string if no obstacles, otherwise "*"
	 */
	public String getContents(int x, int y) {
		
		
		for(int i = 0; i < obstacleArray.size(); i=+2){
			
			if(obstacleArray.get(i) == x && obstacleArray.get(i+1) == y){
				return "*";
			}
		}
		
		return "";
	}


	public void addObstacle(int x, int y) {

		obstacleArray.add(x);
		obstacleArray.add(y);
	}
	
	
	
}
