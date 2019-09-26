import static org.junit.Assert.*;

import org.junit.Test;

public class VowelConstTestCase {

	@Test
	public void test1() {
		VowelConsonant v = new VowelConsonant();
		String s = v.compute("a");
		assertEquals("Vowel",s);
	}
	@Test
	public void test2() {
		VowelConsonant v = new VowelConsonant();
		String s = v.compute("e");
		assertEquals("Vowel",s);
	}
	@Test
	public void test3() {
		VowelConsonant v = new VowelConsonant();
		String s = v.compute("i");
		assertEquals("Vowel",s);
	}
	@Test
	public void test4() {
		VowelConsonant v = new VowelConsonant();
		String s = v.compute("o");
		assertEquals("Vowel",s);
	}
	@Test
	public void test5() {
		VowelConsonant v = new VowelConsonant();
		String s = v.compute("u");
		assertEquals("Vowel",s);
	}
	@Test
	public void test6() {
		VowelConsonant v = new VowelConsonant();
		String s = v.compute("A");
		assertEquals("Vowel",s);
	}
	@Test
	public void test7() {
		VowelConsonant v = new VowelConsonant();
		String s = v.compute("E");
		assertEquals("Vowel",s);
	}
	@Test
	public void test8() {
		VowelConsonant v = new VowelConsonant();
		String s = v.compute("I");
		assertEquals("Vowel",s);
	}
	@Test
	public void test9() {
		VowelConsonant v = new VowelConsonant();
		String s = v.compute("O");
		assertEquals("Vowel",s);
	}
	@Test
	public void test10() {
		VowelConsonant v = new VowelConsonant();
		String s = v.compute("U");
		assertEquals("Vowel",s);
	}
	@Test
	public void test11() {
		VowelConsonant v = new VowelConsonant();
		String s = v.compute("M");
		assertEquals("Consonant",s);
	}

}
