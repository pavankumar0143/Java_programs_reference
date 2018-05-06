package unitTest;

import static org.junit.Assert.*;

import org.junit.*;
import org.junit.Test;

public class Test1Test {
	  static Test1 t;
	 @BeforeClass
	public static void intialize(){
		 t=new Test1();
		System.out.println("After Test");
	}
	@Test
	public void test() {
		System.out.println("IN TEST1");
		assertEquals(5,t.ADD(3, 2));
	}
	@Test
	public void test1(){
		System.out.println("IN TEST2");
		assertEquals(1,t.Arr(new int[]{5,3,4,2,1,6}));
	}
	//@Test
	//public void test2(){
		//assertTrue(true,Test1.boo(5).isSafe());
	//}

}
