package org.unioulu.tol.sqat2015.planetExplorer;

import static org.junit.Assert.*;

import org.junit.Test;

public class ExplorerTest {

	@Test
	public void testMoveForwardFromNull() {
	
		Explorer explorer = new Explorer(0,0,"N");
		
		explorer.moveForward();
		
		assertEquals("0,1,N", explorer.getPosition());
		
	}
	
	@Test
	public void testMoveForwardFromNullTurnRightAndMoveForwardTwice(){
		
		Explorer explorer = new Explorer(0,0,"N");
		
		explorer.moveForward();
		explorer.turnRight();
		explorer.moveForward();
		explorer.moveForward();
		
		assertEquals("2,1,E", explorer.getPosition());
		
	}
	
	@Test
	public void testMoveForwardTwiceTurnLeftAndReverseOnce(){
		
		Explorer explorer = new Explorer(0,0,"N");
		
		explorer.moveForward();
		explorer.moveForward();
		explorer.turnLeft();
		explorer.moveBackward();
		
		
		assertEquals("1,2,W", explorer.getPosition());
	}

}
