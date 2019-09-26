import static org.junit.Assert.*;

import org.junit.Test;

public class SimpleCalcTestCase {

	@Test
	public void test1() {
		SimpleCalc c = new SimpleCalc();
		int s = c.compute(1,2,1);
		assertEquals(3,s);
	}
	@Test
	public void test2() {
		SimpleCalc c = new SimpleCalc();
		int s = c.compute(2,2,1);
		assertEquals(1,s);
	}
	@Test
	public void test3() {
		SimpleCalc c = new SimpleCalc();
		int s = c.compute(3,2,1);
		assertEquals(2,s);
	}
	@Test
	public void test4() {
		SimpleCalc c = new SimpleCalc();
		int s = c.compute(4,2,1);
		assertEquals(2,s);
	}
	@Test
	public void test5() {
		SimpleCalc c = new SimpleCalc();
		int s = c.compute(5,2,1);
		assertEquals(-1,s);
	}

}
