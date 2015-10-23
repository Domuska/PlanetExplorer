package org.unioulu.tol.sqat2015.planetExplorer.tests;

import static org.junit.Assert.*;

import org.junit.Test;
import org.unioulu.tol.sqat2015.planetExplorer.PlanetExplorer;

public class TestPlanetExplorer {

	@Test
	public void testPlanetExplorerWithGoodPlanetSizeAndNoObstacles() {
		
		PlanetExplorer explorer = new PlanetExplorer(5,5,"");
		
		assertNotNull(explorer);
	}
	
	@Test
	public void testPlanetExplorerGetStartingCoordinates(){
		
		PlanetExplorer explorer = new PlanetExplorer(100,100,"");
		
		assertEquals("0,0,N", explorer.executeCommand(""));
	}
	
	
}
