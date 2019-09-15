import static org.junit.Assert.*;
 
import org.junit.Test;
 
public class NextDateTestCase {
 
	@Test
	public void test1() {
		NextDate n=new NextDate("15-06-1812");
		assertEquals("16-6-1812",n.nextDate());
	}
	@Test
	public void test2() {
		NextDate n=new NextDate("15-06-1813");
		assertEquals("16-6-1813",n.nextDate());
	}
	@Test
	public void test3() {
		NextDate n=new NextDate("15-06-1912");
		assertEquals("16-6-1912",n.nextDate());
	}
	@Test
	public void test4() {
		NextDate n=new NextDate("15-06-2012");
		assertEquals("16-6-2012",n.nextDate());
	}
	@Test
	public void test5() {
		NextDate n=new NextDate("15-06-2011");
		assertEquals("16-6-2011",n.nextDate());
	}
	@Test
	public void test6() {
		NextDate n=new NextDate("15-01-1912");
		assertEquals("16-1-1912",n.nextDate());
	}
	@Test
	public void test9() {
		NextDate n=new NextDate("15-02-1912");
		assertEquals("16-2-1912",n.nextDate());
	}
	@Test
	public void test7() {
		NextDate n=new NextDate("31-06-1912");
		assertEquals("Invalid Date",n.nextDate());
	}
	@Test
	public void test8() {
		NextDate n=new NextDate("15-12-1912");
		assertEquals("16-12-1912",n.nextDate());
	}
	@Test
	public void test10() {
		NextDate n=new NextDate("15-11-1912");
		assertEquals("16-11-1912",n.nextDate());
	}
}