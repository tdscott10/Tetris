package org.psnbtech.tests;

import org.junit.*;
import org.psnbtech.Clock;

import static org.junit.Assert.*;

/**
 * The class <code>ClockTest</code> contains tests for the class <code>{@link Clock}</code>.
 *
 * @generatedBy CodePro at 4/12/16 6:43 PM
 * @author tdscott
 * @version $Revision: 1.0 $
 */
public class ClockTest {
	/**
	 * Run the Clock(float) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/12/16 6:43 PM
	 */
	@Test
	public void testClock_1()
		throws Exception {
		float cyclesPerSecond = 1.0f;

		Clock result = new Clock(cyclesPerSecond);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.hasElapsedCycle());
		assertEquals(false, result.peekElapsedCycle());
		assertEquals(false, result.isPaused());
	}

	/**
	 * Run the boolean hasElapsedCycle() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/12/16 6:43 PM
	 */
	@Test
	public void testHasElapsedCycle_1()
		throws Exception {
		Clock fixture = new Clock(1.0f);
		fixture.setPaused(true);

		boolean result = fixture.hasElapsedCycle();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean hasElapsedCycle() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/12/16 6:43 PM
	 */
	@Test
	public void testHasElapsedCycle_2()
		throws Exception {
		Clock fixture = new Clock(1.0f);
		fixture.setPaused(true);

		boolean result = fixture.hasElapsedCycle();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isPaused() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/12/16 6:43 PM
	 */
	@Test
	public void testIsPaused_1()
		throws Exception {
		Clock fixture = new Clock(1.0f);
		fixture.setPaused(true);

		boolean result = fixture.isPaused();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isPaused() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/12/16 6:43 PM
	 */
	@Test
	public void testIsPaused_2()
		throws Exception {
		Clock fixture = new Clock(1.0f);
		fixture.setPaused(false);

		boolean result = fixture.isPaused();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean peekElapsedCycle() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/12/16 6:43 PM
	 */
	@Test
	public void testPeekElapsedCycle_1()
		throws Exception {
		Clock fixture = new Clock(1.0f);
		fixture.setPaused(true);

		boolean result = fixture.peekElapsedCycle();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean peekElapsedCycle() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/12/16 6:43 PM
	 */
	@Test
	public void testPeekElapsedCycle_2()
		throws Exception {
		Clock fixture = new Clock(1.0f);
		fixture.setPaused(true);

		boolean result = fixture.peekElapsedCycle();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the void reset() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/12/16 6:43 PM
	 */
	@Test
	public void testReset_1()
		throws Exception {
		Clock fixture = new Clock(1.0f);
		fixture.setPaused(true);

		fixture.reset();

		// add additional test code here
	}

	/**
	 * Run the void setCyclesPerSecond(float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/12/16 6:43 PM
	 */
	@Test
	public void testSetCyclesPerSecond_1()
		throws Exception {
		Clock fixture = new Clock(1.0f);
		fixture.setPaused(true);
		float cyclesPerSecond = 1.0f;

		fixture.setCyclesPerSecond(cyclesPerSecond);

		// add additional test code here
	}

	/**
	 * Run the void setPaused(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/12/16 6:43 PM
	 */
	@Test
	public void testSetPaused_1()
		throws Exception {
		Clock fixture = new Clock(1.0f);
		fixture.setPaused(true);
		boolean paused = true;

		fixture.setPaused(paused);

		// add additional test code here
	}

	/**
	 * Run the void update() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/12/16 6:43 PM
	 */
	@Test
	public void testUpdate_1()
		throws Exception {
		Clock fixture = new Clock(1.0f);
		fixture.setPaused(false);

		fixture.update();

		// add additional test code here
	}

	/**
	 * Run the void update() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/12/16 6:43 PM
	 */
	@Test
	public void testUpdate_2()
		throws Exception {
		Clock fixture = new Clock(1.0f);
		fixture.setPaused(true);

		fixture.update();

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 4/12/16 6:43 PM
	 */
	@Before
	public void setUp()
		throws Exception {
		// add additional set up code here
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @generatedBy CodePro at 4/12/16 6:43 PM
	 */
	@After
	public void tearDown()
		throws Exception {
		// Add additional tear down code here
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 4/12/16 6:43 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(ClockTest.class);
	}
}