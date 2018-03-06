package test2;

import static org.junit.Assert.*;

import org.junit.Test;

public class AnimalTest {

	@Test
	public void test1() {
		String ob1 = "강아지";
		String ob2 = "쿠냥이ㅎㅎㅎㅎ";
		Animal m = new Animal(ob2);
		assertEquals(m.name, ob2);
	}

}
