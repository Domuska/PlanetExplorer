package org.unioulu.tol.sqat2015.planetExplorer;

import static org.junit.Assert.*;

import org.junit.Test;

public class ExplorerTest {

	@Test
	public void testMoveForward() {
	
		Explorer explorer = new Explorer(0,0,"N");
		
		explorer.moveForward();
		
		assertEquals("1,0,N", explorer.getPosition());
		
	}

}
