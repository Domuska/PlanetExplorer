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
		
		PlanetExplorer explorer = createDefaultEmptyPlanet();
		
		assertEquals("0,0,N", explorer.executeCommand(""));
	}
	
	@Test
	public void testPlanetExplorerMoveOneBlockNorthFromStart(){
		
		PlanetExplorer explorer = createDefaultEmptyPlanet();
		
		explorer.executeCommand("f");
		
		assertEquals("0,1,N", explorer.executeCommand(""));
		
	}
	
	
	@Test
	public void testPlanetExplorerMoveBackWardFromStartEndAtOtherSideOfPlanet(){
		
		PlanetExplorer explorer = createDefaultEmptyPlanet();
		
		explorer.executeCommand("b");
		
		assertEquals("0,99,N", explorer.executeCommand(""));
	}
	
	
	//TEST NOT FINISHED, RAN OUT OF TIME
	@Test
	public void testPlanetWithObstacleAt5And5(){
		
		PlanetExplorer explorer = new PlanetExplorer(100,100,"(5,5)");
		
		assert(false);
	}
	
	
	//HELPER METHODS
	private PlanetExplorer createDefaultEmptyPlanet(){
		
		return new PlanetExplorer(100,100,"");
	}
	
}
