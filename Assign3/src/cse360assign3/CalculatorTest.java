package cse360assign3;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testCalculator() {
		Calculator test = new Calculator();
		assertNotNull(test);
	}

	@Test
	public void testadd(){
		Calculator test = new Calculator();
		test.add(3);
		assertEquals(3,test.getTotal());
	}
	
	@Test
	public void testsubtract(){
		Calculator test = new Calculator();
		test.subtract(3);
		assertEquals(-3,test.getTotal());
	}
	
	@Test
	public void testmultiply(){
		Calculator test = new Calculator();
		test.multiply(3);
		assertEquals(0,test.getTotal());
		test.add(1);
		test.multiply(3);
		assertEquals(3,test.getTotal());
	}
	
	@Test
	public void testdivide(){
		Calculator test = new Calculator();
		test.divide(0);
		assertEquals(0,test.getTotal());
		test.add(21);
		test.divide(7);
		assertEquals(3,test.getTotal());
	}
	
	@Test
	public void testgetTotal(){
		Calculator test = new Calculator();
		assertEquals(0,test.getTotal());
		test.add(3);
		assertEquals(3,test.getTotal());
	}
	
	@Test
	public void testgetHistory(){
		Calculator test = new Calculator();
		test.add(3);
		test.subtract(2);
		test.divide(0);
		assertEquals("0 + 3 - 2 / 0",test.getHistory());
	}
}
