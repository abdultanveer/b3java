package basics.unittesting;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import junit.framework.TestCase;

public class CalculatorTest extends TestCase {
	
	@Test
	public void testAdd() {
		int expected = 40;
		int actual = Calculator.add(10, 20);
		assertEquals(expected, actual);
		
	}

}
