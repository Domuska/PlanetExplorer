package org.unioulu.tol.sqat2015.planetExplorer;

// Before submitting write your ID and finish time here. Your ID is written on project description sheets.
// ID: 146
// Finish time:
public class PlanetExplorer {
	
	private Planet myPlanet;
	private Explorer myExplorer;
	
	
	public PlanetExplorer(int x, int y, String obstacles){
	/*	x and y represent the size of the grid.
	 *  Obstacles is a String formatted as follows: "(obs1_x,obs1_y)(obs2_x,obs2_y)...(obsN_x,obsN_y)" with no white spaces. 
	 *  
		Example use:
		PlanetExplorer explorer = new PlanetExplorer(100,100,"(5,5)(7,8)")  //A 100x100 grid with two obstacles at coordinates (5,5) and (7,8) 
	 */
		
		myPlanet = new Planet(x,y);
		myExplorer = new Explorer(0,0,"N");
		

	}
	
	
	public String executeCommand(String command){
		
		/* The command string is composed of "f" (forward), "b" (backward), "l" (left) and "r" (right)
		 * Example: 
		 * The explorer is on a 100x100 grid at location (0, 0) and facing NORTH. 
		 * The explorer is given the commands "ffrff" and should end up at (2, 2) facing East.
		 
		 * The return string is in the format: "(pos_x,pos_y,facing)(obs1_x,obs1_y)(obs2_x,obs2_y)..(obsN_x,obsN_y)" 
		 * Where pos_x and pos_y are the final coordinates, facing is the current direction the explorer is pointing to (N,S,W,E).
		 * The return string should also contain a list of coordinates of the encountered obstacles. No white spaces.
		 */
		
		char singleCommand;
		
		for(int i = 0; i < command.length(); i++){
			
			singleCommand = command.charAt(i);
			
			switch(singleCommand){
			
			case 'f':
				myExplorer.moveForward();
				break;
			case 'b':
				myExplorer.moveBackward();
				break;
			case 'l':
				myExplorer.turnLeft();
				break;
			case 'r':
				myExplorer.turnRight();
				break;
			}	
		}
		
		//why does this not work?
		System.out.println(myExplorer.getXPostion());
		if(myExplorer.getXPostion() < 0){
			
			myExplorer.setPosition(myPlanet.getX() - myExplorer.getXPostion(), 
					myExplorer.getYPosition());
			
		}
		
		return myExplorer.getPosition();
	}
}
