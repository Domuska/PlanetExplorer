package org.unioulu.tol.sqat2015.planetExplorer.tests;

import static org.junit.Assert.*;

import org.junit.Test;
import org.unioulu.tol.sqat2015.planetExplorer.Planet;

public class PlanetTest {

	@Test
	public void testPlanetCreationWithGoodValues() {
		
		Planet planet = new Planet(100,105);
		
		assertEquals(100, planet.getX());
		assertEquals(105, planet.getY());
		
	}
	
	@Test
	public void testPlanetCreationWithNegativeValues(){
		
		Planet planet = new Planet(-5,-5);
		
		assertEquals(50, planet.getX());
		assertEquals(50, planet.getY());
	}

}
