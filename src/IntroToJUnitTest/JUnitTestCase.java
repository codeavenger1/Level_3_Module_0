package IntroToJUnitTest;

import static org.junit.Assert.*;

import org.junit.Test;

public class JUnitTestCase {
	

	Calc c = new Calc();
	

	@Test
	public void addTest() {
		assertTrue(c.add(2, 2) == 4);
			}
	@Test
	public void subtractTest() {
		assertTrue(c.subtract(2,2) == 0);
		}
	@Test
	public void multiplyTest() {
		assertTrue(c.multiply(2, 2)== 4);
		}
	@Test
	public void divideTest() {
		assertTrue(c.divide(2, 2)== 1);
	}


}
