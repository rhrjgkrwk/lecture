package collection1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/*
제네릭스를 사용하지 않을 경우, 
컴파일 상의 문제는 없으나 실행시 형변환의 발생할 수 있다.
*/
public class ListError {
	public static void main(String[] args) {
		List<String> li = new ArrayList<>();
		//여러 종류의 객체를 넣고 싶으면 Object 객체를 넣어보자!
		List li1 = new ArrayList();
		
		li1.add("a");
		li1.add("b");
		li1.add("c");
		li1.add("d");
		li1.add("e");
		li1.add("f");
		li1.add(5);
		
		System.out.println(li1);
		Iterator it1 = li1.iterator();
		while (it1.hasNext()) {
			String object = (String) it1.next();
			System.out.println(object);
		}
		
		for (Object s : li1) {
			System.out.println((String)s);
		}
		
		for (int i = 0; i < li1.size(); i++) { //에러발생 casting error
			String s = (String)li1.get(i);
			System.out.println(s+"dd");
		}
		
		Iterator it = li.iterator();
		while (it.hasNext()) { //어떤 데이터가 나올지 모르지 최상위 객체인 Object로 반환한다.
			System.out.println(it.next());
		}
	}
}
