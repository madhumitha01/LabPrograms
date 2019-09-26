import static org.junit.Assert.*;
import org.junit.Test;
public class TriangleTestCase {

	@Test
	public void test1() {
		Triangle t = new Triangle();
		String s=t.compute(1,1,1);
		assertEquals("Equilateral Triangle",s);
	}	
	@Test
	public void test2() {
		Triangle t = new Triangle();
		String s=t.compute(3,5,3);
		assertEquals("Isosceles Triangle",s);
	}	
	@Test
	public void test3() {
		Triangle t = new Triangle();
		String s=t.compute(3,4,5);
		assertEquals("Scalene Triangle",s);
	}	
	@Test
	public void test4() {
		Triangle t = new Triangle();
		String s=t.compute(4,3,5);
		assertEquals("Scalene Triangle",s);
	}	
	@Test
	public void test5() {
		Triangle t = new Triangle();
		String s=t.compute(-1,5,5);
		assertEquals("a not in range",s);
	}
	
	@Test
	public void test6() {
		Triangle t = new Triangle();
		String s=t.compute(5,-1,5);
		assertEquals("b not in range",s);
	}
	@Test
	public void test7() {
		Triangle t = new Triangle();
		String s=t.compute(5,5,-1);
		assertEquals("c not in range",s);
	}
	@Test
	public void test8() {
		Triangle t = new Triangle();
		String s=t.compute(11,5,5);
		assertEquals("Not a Triangle",s);
	}
	@Test
	public void test9() {
		Triangle t = new Triangle();
		String s=t.compute(5,5,10);
		assertEquals("Not a Triangle",s);
	}
	@Test
	public void test10() {
		Triangle t = new Triangle();
		String s=t.compute(5,10,5);
		assertEquals("Not a Triangle",s);
	}
	@Test
	public void test11() {
		Triangle t = new Triangle();
		String s=t.compute(10,5,5);
		assertEquals("Not a Triangle",s);
	}
	@Test
	public void test12() {
		Triangle t = new Triangle();
		String s=t.compute(10,10,9);
		assertEquals("Isosceles Triangle",s);
	}
	@Test
	public void test13() {
		Triangle t = new Triangle();
		String s=t.compute(10,9,10);
		assertEquals("Isosceles Triangle",s);
	}
	@Test
	public void test14() {
		Triangle t = new Triangle();
		String s=t.compute(10,9,10);
		assertEquals("Isosceles Triangle",s);
	}
	@Test
	public void test15() {
		Triangle t = new Triangle();
		String s=t.compute(10,9,10);
		assertEquals("Isosceles Triangle",s);
	}
}


