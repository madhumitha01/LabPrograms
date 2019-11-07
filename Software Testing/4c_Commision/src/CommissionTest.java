import static org.junit.Assert.*;

import org.junit.Test;

public class CommissionTest {
	
	@Test
	public void test1() {	//Sales<1000
		Commission c = new Commission();
		Double d = c.compute(1,1,1);
		assertEquals(Double.valueOf(10),d);
	}
	@Test
	public void test2() {	//Sales>1800
		Commission c = new Commission();
		Double d = c.compute(18,18,19);
		assertEquals(Double.valueOf(225),d);
	}
	@Test
	public void test3() {	//Sales>1000 && Sales<1800
		Commission c = new Commission();
		Double d = c.compute(14,14,14);
		assertEquals(Double.valueOf(160),d);
	}
	@Test
	public void test4() {	//Sales=1800
		Commission c = new Commission();
		Double d = c.compute(18,18,18);
		assertEquals(Double.valueOf(220),d);
	}
	@Test
	public void test5() {	//Sales=1000
		Commission c = new Commission();
		Double d = c.compute(10,10,10);
		assertEquals(Double.valueOf(100),d);
	}
	@Test
	public void test6() {	//Invalid1
		Commission c = new Commission();
		Double d = c.compute(0,18,19);
		assertEquals(Double.valueOf(-1),d);
	}
	@Test
	public void test7() {	//Invalid2
		Commission c = new Commission();
		Double d = c.compute(10,0,19);
		assertEquals(Double.valueOf(-1),d);
	}
	@Test
	public void test8() {	//Invalid3
		Commission c = new Commission();
		Double d = c.compute(10,18,0);
		assertEquals(Double.valueOf(-1),d);
	}
	@Test
	public void test9() {	//Invalid4
		Commission c = new Commission();
		Double d = c.compute(10,0,0);
		assertEquals(Double.valueOf(-1),d);
	}
	@Test
	public void test10() {	//Invalid5
		Commission c = new Commission();
		Double d = c.compute(0,0,19);
		assertEquals(Double.valueOf(-1),d);
	}
	@Test
	public void test11() {	//Invalid6
		Commission c = new Commission();
		Double d = c.compute(0,18,0);
		assertEquals(Double.valueOf(-1),d);
	}
	@Test
	public void test12() {	//Invalid7
		Commission c = new Commission();
		Double d = c.compute(0,0,0);
		assertEquals(Double.valueOf(-1),d);
	}
}