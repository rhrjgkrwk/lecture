package test1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
	private Calculator ob;
	
	/*�ν��Ͻ� ������ �� ���� �׽�Ʈ���� �����ϸ� �޸� ����.. 
	Before�� �̿��� �ν��Ͻ��� �ѹ��� �����ϵ��� �� �� �ִ�.
	�̷����� before�� ����. 
	*/
	@Before 
	public void setUp(){
		ob = new Calculator();
		System.out.println("setUp");
	}
	@Test
	public void concatenate(){
		String s = ob.concatenate("abc","������");
		assertEquals("abc������",s);
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
