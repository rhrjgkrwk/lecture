package test5;

import java.util.function.Consumer;

public class StreamEx6 {
	public static void main(String[] args) {
		Consumer<Integer> c = (a)->System.out.println("�Է��� ���ڴ� " +a);
		//���ڸ� �޾Ƽ� �Һ��ϴ� ģ���̴�. ������ ����. 	
		c.accept(122);
	}
}
