package test03;

import java.util.ArrayList;
import java.util.List;

public class LambdaEx9 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("��");
		list.add("ȭ");
		list.add("��");
		list.add("��");
		list.add("��");
		
		for (String string : list) {
			System.out.println(string);
		}
		
		list.forEach(m->System.out.println(m));
	}
}
