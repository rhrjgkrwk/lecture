package test1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
	private Calculator ob;
	
	/*인스턴스 생성을 각 단위 테스트마다 진행하면 메모리 낭비.. 
	Before를 이용해 인스턴스를 한번만 생성하도록 할 수 있다.
	이럴때에 before를 쓴다. 
	*/
	@Before 
	public void setUp(){
		ob = new Calculator();
		System.out.println("setUp");
	}
	@Test
	public void concatenate(){
		String s = ob.concatenate("abc","가나다");
		assertEquals("abc가나다",s);
		System.out.println("concatenate");
	}
	@Test
	public void substract(){
		int c = ob.substract(1, 2);
		assertEquals(-1, c);
		System.out.println("sub");
	}
	@Test
	public void add(){
		int c = ob.add(1, 2);
		assertEquals(3, c);
		System.out.println("add");
	}
	@After
	public void tearDown(){
		System.out.println("tearDown");
		System.out.println();
	}
}
