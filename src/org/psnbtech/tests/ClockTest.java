package org.psnbtech.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import org.psnbtech.Clock;

public class ClockTest {
	
	private Clock clock;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		clock = new Clock(1000);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testClockPaused() {
		clock.setPaused(true);
		assertTrue(clock.isPaused());
		clock.setPaused(false);
		assertFalse(clock.isPaused());
	}

}
