package org.unioulu.tol.sqat2015.planetExplorer.tests;

import static org.junit.Assert.*;

import org.junit.Test;
import org.unioulu.tol.sqat2015.planetExplorer.Planet;

public class PlanetTest {

	@Test
	public void testPlanetCreationWithGoodValues() {
		
		Planet planet = new Planet(100,100);
		
		assertNotNull(planet);
		
	}

}
