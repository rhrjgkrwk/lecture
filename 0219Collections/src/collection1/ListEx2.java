package collection1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListEx2 {
	public static void main(String[] args) {
		List<String> li = new ArrayList<>();
		//여러 종류의 객체를 넣고 싶으면 Object 객체를 넣어보자!
		List<Object> li1 = new ArrayList<>();
		
		li1.add("a");
		li1.add("b");
		li1.add("c");
		li1.add("d");
		li1.add("e");
		li1.add("f");
		
/*		li.add(2);
		li.add(new Float(2.12));
		li.add(4.00);*/ 
		//generics를 설정하면 해당 객체만 넣어야한다.
		
		li.add("앙뇽");
		
//		int ==> Integer : boxing (기본형 ==> 객체)
//		Integer --> int : Unboxing (객체 ==> 기본형)
		System.out.println(li);
		Iterator it1 = li1.iterator();
		while (it1.hasNext()) {
			String object = (String) it1.next();
			System.out.println(object);
		}
		
		for (Object s : li1) {
			System.out.println((String)s);
		}
		
		Iterator it = li.iterator();
		while (it.hasNext()) { //어떤 데이터가 나올지 모르지 최상위 객체인 Object로 반환한다.
			System.out.println(it.next());
		}
	}
}
