package test4;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BendingMachineTest {
	BendingMachine bm;
	@Before
	public void setUp() {
		bm = new BendingMachine();
	}
	@Test
	public void testInsertCoin() {
		bm.insertCoin(500);
		bm.insertCoin(100);
		bm.insertCoin(100);
		assertEquals(700, bm.getCurrent());
	}
	@Test(expected = RuntimeException.class)
	public void testNegativeCoin() throws Exception{
		bm.insertCoin(-100);
//		if (bm.getCurrent()<0) {
//			throw new Exception("음수 입력 불가");
//		}
//		System.out.println(bm.getCurrent());
	}
	//@After
	public void tearDown(){
		assertEquals(700, bm.getCurrent());
	}
}
