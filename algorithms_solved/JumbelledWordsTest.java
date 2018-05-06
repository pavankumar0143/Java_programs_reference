import static org.junit.Assert.*;

import org.junit.Test;

public class JumbelledWordsTest {

	@Test
	public void test() {
		assertEquals("POETCJR BSDEA LANNGIRE",JumbelledWords.jumble("PROJECT BASED LEARNING", 1));
		
		
	}
	@Test
	public void test1(){
		assertEquals("POETRJC BSDAE LANNERIG",JumbelledWords.jumble("PROJECT BASED LEARNING", 2));
		
	}
	@Test
	public void test2(){
		
		assertEquals("WPOIR LMTDIIE",JumbelledWords.jumble("WIPRO LIMITED", 2));
		
	}
	@Test
	public void test3(){
		assertEquals("ETRRSEIPEN APIAINOTCLP ITGAINOTREN",JumbelledWords.jumble("ENTERPRISE APPLICATION INTEGRATION", 1));
		
	}
	@Test
	public void test4(){
		assertEquals("ETRRSNEPIE APIAINPLCTO ITGAINNERTO",JumbelledWords.jumble("ENTERPRISE APPLICATION INTEGRATION", 2));
		
	}
	@Test
	public void test5(){
		assertEquals("WRDLO WDEI WBE",JumbelledWords.jumble("WORLD WIDE WEB", 1));
		
	}
	@Test
	public void test6(){
		assertEquals("WRDOL WDIE WBE",JumbelledWords.jumble("WORLD WIDE WEB", 2));
		
	}
	@Test
	public void test7(){
		assertEquals("SFWREATO AS A SRIECVE",JumbelledWords.jumble("SOFTWARE AS A SERVICE", 1));
		
	}
	@Test
	public void test8(){
		assertEquals("SFWROTAE AS A SRIEEVC",JumbelledWords.jumble("SOFTWARE AS A SERVICE", 2));
	}
}
