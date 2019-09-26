import static org.junit.Assert.*;

import org.junit.Test;

public class CommissionTestCase {

	@Test
	public void test1() {	//Sales<1000
		Commission c = new Commission();
		Double d = c.compute(1,1,1);
		assertEquals(10,d);
	}
	@Test
	public void test2() {	//Sales>1800
		Commission c = new Commission();
		Double d = c.compute(18,18,19);
		assertEquals(225,d);
	}
	@Test
	public void test3() {	//Sales>1000 && Sales<1800
		Commission c = new Commission();
		Double d = c.compute(14,14,14);
		assertEquals(160,d);
	}
	@Test
	public void test4() {	//Invalid
		Commission c = new Commission();
		Double d = c.compute(0,18,19);
		assertEquals(-1.0,d);
	}
	@Test
	public void test5() {	//Invalid
		Commission c = new Commission();
		Double d = c.compute(10,0,19);
		assertEquals(-1.0,d);
	}
	@Test
	public void test6() {	//Invalid
		Commission c = new Commission();
		Double d = c.compute(10,18,0);
		assertEquals(-1.0,d);
	}

}
