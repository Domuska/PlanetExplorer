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

	@Test
	public void testPlanetObstacleAdditionWithOneObstacleAt5And5(){
		
		Planet planet = new Planet(100,105);
		
		planet.addObstacle(5,5);
		
		assertEquals("*", planet.getContents(5,5));
	}
	
	@Test
	public void testPlanetObstacleAdditionWithOneObstacleAt10And15(){
		
		Planet planet = new Planet(100,105);
		
		planet.addObstacle(10, 15);
		
		assertEquals("*", planet.getContents(10, 15));
	}
	
	@Test
	public void testPlanetObstacleAdditionWithNoObstacles(){
		
		Planet planet = new Planet(100,105);
		
		assertEquals("*", planet.getContents(10, 15));
	}
}
