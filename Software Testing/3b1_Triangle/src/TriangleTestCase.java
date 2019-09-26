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
		String s=t.compute(1,1,2);
		assertEquals("Not a Triangle",s);
	}	
	@Test
	public void test3() {
		Triangle t = new Triangle();
		String s=t.compute(1,2,1);
		assertEquals("Not a Triangle",s);
	}	
	@Test
	public void test4() {
		Triangle t = new Triangle();
		String s=t.compute(2,1,1);
		assertEquals("Not a Triangle",s);
	}	
	@Test
	public void test5() {
		Triangle t = new Triangle();
		String s=t.compute(5,5,1);
		assertEquals("Isosceles Triangle",s);
	}
	
	@Test
	public void test6() {
		Triangle t = new Triangle();
		String s=t.compute(5,1,5);
		assertEquals("Isosceles Triangle",s);
	}
	@Test
	public void test7() {
		Triangle t = new Triangle();
		String s=t.compute(1,5,5);
		assertEquals("Isosceles Triangle",s);
	}
	@Test
	public void test8() {
		Triangle t = new Triangle();
		String s=t.compute(5,5,5);
		assertEquals("Equilateral Triangle",s);
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
		String s=t.compute(2,3,4);
		assertEquals("Scalene Triangle",s);
	}
}


