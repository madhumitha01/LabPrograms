import static org.junit.Assert.*;

import org.junit.Test;

public class NextdateTest {

	@Test
	public void test1() {
		NextDate d = new NextDate();
		assertEquals("13/6/2004",d.caldate(12,6,2004));
		}	
	@Test
	public void test2() {
		NextDate d = new NextDate();
		assertEquals("1/5/2004",d.caldate(30,4,2004));
		}	
	@Test
	public void test3() {
		NextDate d = new NextDate();
		assertEquals("|day invalid|",d.caldate(31,4,2011));
		}	
	@Test
	public void test4() {
		NextDate d = new NextDate();
		assertEquals("11/1/2004",d.caldate(10,1,2004));
		}	
	@Test
	public void test5() {
		NextDate d = new NextDate();
		assertEquals("1/2/2004",d.caldate(31,1,2004));
		}	
	@Test
	public void test6() {
		NextDate d = new NextDate();
		assertEquals("31/12/2005",d.caldate(30,12,2005));
		}	
	@Test
	public void test7() {
		NextDate d = new NextDate();
		assertEquals("1/1/2006",d.caldate(31,12,2005));
		}	
	@Test
	public void test8() {
		NextDate d = new NextDate();
		assertEquals("28/2/2005",d.caldate(27,2,2005));
		}	
	@Test
	public void test9() {
		NextDate d = new NextDate();
		assertEquals("29/2/2004",d.caldate(28,2,2004));
		}	
	@Test
	public void test10() {
		NextDate d = new NextDate();
		assertEquals("1/3/2005",d.caldate(28,2,2005));
		}	
	@Test
	public void test11() {
		NextDate d = new NextDate();
		assertEquals("1/3/2004",d.caldate(29,2,2004));
		}	
	@Test
	public void test12() {
		NextDate d = new NextDate();
		assertEquals("|day invalid|",d.caldate(29,2,2005));
		}	
	@Test
	public void test13() {
		NextDate d = new NextDate();
		assertEquals("|day invalid|",d.caldate(30,2,2005));
		}	
	@Test
	public void test14() {
		NextDate d = new NextDate();
		assertEquals("|year invalid|",d.caldate(30,3,2013));
		}	
	@Test
	public void test15() {
		NextDate d = new NextDate();
		assertEquals("|year invalid|",d.caldate(30,3,1820));
		}	
	@Test
	public void test16() {
		NextDate d = new NextDate();
		assertEquals("|month invalid|",d.caldate(30,13,2010));
		}	
	@Test
	public void test17() {
		NextDate d = new NextDate();
		assertEquals("|month invalid|",d.caldate(30,-1,2010));
		}	
	@Test
	public void test18() {
		NextDate d = new NextDate();
		assertEquals("|day invalid|",d.caldate(31,6,2011));
		}	
	@Test
	public void test19() {
		NextDate d = new NextDate();
		assertEquals("|day invalid|",d.caldate(31,9,2011));
		}	
	@Test
	public void test20() {
		NextDate d = new NextDate();
		assertEquals("|day invalid|",d.caldate(31,11,2011));
		}	
	@Test
	public void test21() {
		NextDate d = new NextDate();
		assertEquals("|day invalid|",d.caldate(-1,11,2011));
		}	
	@Test
	public void test22() {
		NextDate d = new NextDate();
		assertEquals("|day invalid|",d.caldate(32,1,2011));
		}
	/*@Test
	public void test22a() {
		NextDate d = new NextDate();
		assertEquals("|day invalid|",d.caldate(32,4,2011));
		}*/
	
	@Test
	public void test23() {
		NextDate d = new NextDate();
		assertEquals("|day invalid|",d.caldate(32,3,2011));
		}	
	@Test
	public void test24() {
		NextDate d = new NextDate();
		assertEquals("|day invalid|",d.caldate(32,5,2011));
		}	
	@Test
	public void test25() {
		NextDate d = new NextDate();
		assertEquals("|day invalid|",d.caldate(32,7,2011));
		}	
	@Test
	public void test26() {
		NextDate d = new NextDate();
		assertEquals("|day invalid|",d.caldate(32,8,2011));
		}	
	@Test
	public void test27() {
		NextDate d = new NextDate();
		assertEquals("|day invalid|",d.caldate(32,10,2011));
		}	
	@Test
	public void test28() {
		NextDate d = new NextDate();
		assertEquals("|day invalid|",d.caldate(32,12,2011));
		}	
	@Test
	public void test29() {
		NextDate d = new NextDate();
		assertEquals("|day invalid|",d.caldate(-1,12,2011));
		}	
	@Test
	public void test30() {
		NextDate d = new NextDate();
		assertEquals("|month invalid||day invalid|",d.caldate(32,13,2011));
		}	
	@Test
	public void test31() {
		NextDate d = new NextDate();
		assertEquals("|month invalid||day invalid|",d.caldate(-1,13,2011));
		}	
	@Test
	public void test32() {
		NextDate d = new NextDate();
		assertEquals("|day invalid|",d.caldate(30,2,2004));
		}	
	@Test
	public void test33() {
		NextDate d = new NextDate();
		assertEquals("|day invalid|",d.caldate(30,2,2000));
		}	
	@Test
	public void test34() {
		NextDate d = new NextDate();
		assertEquals("|day invalid|",d.caldate(-1,2,2000));
		}	
	@Test
	public void test35() {
		NextDate d = new NextDate();
		assertEquals("|day invalid|",d.caldate(-1,2,2005));
		}	
	@Test
	public void test36() {
		NextDate d = new NextDate();
		assertEquals("16/9/2004",d.caldate(15,9,2004));
		}	
	@Test
	public void test37() {
		NextDate d = new NextDate();
		assertEquals("16/11/2004",d.caldate(15,11,2004));
		}	
	@Test
	public void test38() {
		NextDate d = new NextDate();
		assertEquals("31/3/2011",d.caldate(30,3,2011));
		}	
	@Test
	public void test39() {
		NextDate d = new NextDate();
		assertEquals("31/5/2011",d.caldate(30,5,2011));
		}	
	@Test
	public void test40() {
		NextDate d = new NextDate();
		assertEquals("31/7/2011",d.caldate(30,7,2011));
		}	
	@Test
	public void test41() {
		NextDate d = new NextDate();
		assertEquals("31/8/2011",d.caldate(30,8,2011));
		}	
	@Test
	public void test42() {
		NextDate d = new NextDate();
		assertEquals("31/10/2011",d.caldate(30,10,2011));
		}	
	@Test
	public void test43() {
		NextDate d = new NextDate();
		assertEquals("29/2/2000",d.caldate(28,2,2000));
		}	
	@Test
	public void test44() {
		NextDate d = new NextDate();
		assertEquals("24/3/1822",d.caldate(23,3,1822));
		}	
	@Test
	public void test45() {
		NextDate d = new NextDate();
		assertEquals("24/3/2012",d.caldate(23,3,2012));
		}	
	@Test
	public void test46() {
		NextDate d = new NextDate();
		assertEquals("2/4/2004",d.caldate(1,4,2004));
		}	
	@Test
	public void test47() {
		NextDate d = new NextDate();
		assertEquals("2/3/2004",d.caldate(1,3,2004));
		}	
	@Test
	public void test48() {
		NextDate d = new NextDate();
		assertEquals("2/2/2004",d.caldate(1,2,2004));
		}	
	@Test
	public void test49() {
		NextDate d = new NextDate();
		assertEquals("2/2/2003",d.caldate(1,2,2003));
		}	
	@Test
	public void test50() {
		NextDate d = new NextDate();
		assertEquals("1/3/2000",d.caldate(29,2,2000));
		}
	@Test
	public void test50a() {
		NextDate d = new NextDate();
		assertEquals("|day invalid|",d.caldate(29,2,1900));
		}
	@Test
	public void test50b() {
		NextDate d = new NextDate();
		assertEquals("1/3/1900",d.caldate(28,2,1900));
		}
	
	@Test
	public void test51() {
		NextDate d = new NextDate();
		assertEquals("|day invalid|",d.caldate(-1,1,2004));
		}
	@Test
	public void test52() {
		NextDate d = new NextDate();
		assertEquals("|day invalid|",d.caldate(-1,3,2004));
		}
	@Test
	public void test53() {
		NextDate d = new NextDate();
		assertEquals("|day invalid|",d.caldate(-1,5,2004));
		}
	@Test
	public void test54() {
		NextDate d = new NextDate();
		assertEquals("|day invalid|",d.caldate(-1,7,2004));
		}
	@Test
	public void test55() {
		NextDate d = new NextDate();
		assertEquals("|day invalid|",d.caldate(-1,8,2004));
		}
	@Test
	public void test56() {
		NextDate d = new NextDate();
		assertEquals("|day invalid|",d.caldate(-1,10,2004));
		}
	@Test
	public void test57() {
		NextDate d = new NextDate();
		assertEquals("2/1/2004",d.caldate(1,1,2004));
		}
	@Test
	public void test58() {
		NextDate d = new NextDate();
		assertEquals("2/5/2004",d.caldate(1,5,2004));
		}
	@Test
	public void test59() {
		NextDate d = new NextDate();
		assertEquals("2/7/2004",d.caldate(1,7,2004));
		}
	@Test
	public void test60() {
		NextDate d = new NextDate();
		assertEquals("2/8/2004",d.caldate(1,8,2004));
		}
	@Test
	public void test61() {
		NextDate d = new NextDate();
		assertEquals("2/10/2004",d.caldate(1,10,2004));
		}
	@Test
	public void test62() {
		NextDate d = new NextDate();
		assertEquals("2/12/2004",d.caldate(1,12,2004));
		}	
	@Test
	public void test63() {
		NextDate d = new NextDate();
		assertEquals("1/4/2004",d.caldate(31,3,2004));
		}
	@Test
	public void test64() {
		NextDate d = new NextDate();
		assertEquals("1/6/2004",d.caldate(31,5,2004));
		}
	@Test
	public void test65() {
		NextDate d = new NextDate();
		assertEquals("1/8/2004",d.caldate(31,7,2004));
		}
	@Test
	public void test66() {
		NextDate d = new NextDate();
		assertEquals("1/9/2004",d.caldate(31,8,2004));
		}
	@Test
	public void test67() {
		NextDate d = new NextDate();
		assertEquals("1/11/2004",d.caldate(31,10,2004));
		}
}
