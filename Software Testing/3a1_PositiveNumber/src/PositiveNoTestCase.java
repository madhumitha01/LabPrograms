import static org.junit.Assert.*;

import org.junit.Test;

public class PositiveNoTestCase {

	@Test
	public void test1() {
		PositiveNo p = new PositiveNo();
		String s= p.compute(5);
		assertEquals("Positive number",s);
	}
	@Test
	public void test2() {
		PositiveNo p = new PositiveNo();
		String s= p.compute(-3);
		assertEquals("Negative number",s);
	}
	@Test
	public void test3() {
		PositiveNo p = new PositiveNo();
		String s= p.compute(0);
		assertEquals("Number is 0",s);
	}

}
