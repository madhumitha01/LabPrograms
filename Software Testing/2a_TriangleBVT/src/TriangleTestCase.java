import static org.junit.Assert.*;

import org.junit.Test;

public class TriangleTestCase {

	@Test
	public void test1() {
		Triangle t = new Triangle();
		String s=t.compute(100,100,1);
		assertEquals("Isosceles Triangle",s);
	}
	/* Just sample test case is added. Fill the rest */

}
