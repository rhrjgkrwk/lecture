package test03;

import java.util.ArrayList;
import java.util.List;

public class LambdaEx9 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("월");
		list.add("화");
		list.add("수");
		list.add("목");
		list.add("금");
		
		for (String string : list) {
			System.out.println(string);
		}
		
		list.forEach(m->System.out.println(m));
	}
}
