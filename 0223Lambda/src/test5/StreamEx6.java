package test5;

import java.util.function.Consumer;

public class StreamEx6 {
	public static void main(String[] args) {
		Consumer<Integer> c = (a)->System.out.println("입력한 숫자는 " +a);
		//인자를 받아서 소비하는 친구이다. 리턴이 없다. 	
		c.accept(122);
	}
}
