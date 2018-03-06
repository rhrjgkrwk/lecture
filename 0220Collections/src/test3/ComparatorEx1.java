package test3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorEx1{
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("축구");
		list.add("야구");
		list.add("농구");
		list.add("배구");
		list.add("탁구");
		Collections.sort(list); //기본적으로 오름차순으로 되어있다.
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		Collections.sort(list, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o2.compareTo(o1);  //내림차순으로 바꾼다.
				//compare 메서드를 쓰면 스택오버플로우.. 넘나 당연하다.
				//compareTo 를 쓰자.
			}
		});
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}
