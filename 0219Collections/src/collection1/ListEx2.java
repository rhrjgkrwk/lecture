package collection1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListEx2 {
	public static void main(String[] args) {
		List<String> li = new ArrayList<>();
		//���� ������ ��ü�� �ְ� ������ Object ��ü�� �־��!
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
		//generics�� �����ϸ� �ش� ��ü�� �־���Ѵ�.
		
		li.add("�Ӵ�");
		
//		int ==> Integer : boxing (�⺻�� ==> ��ü)
//		Integer --> int : Unboxing (��ü ==> �⺻��)
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
		while (it.hasNext()) { //� �����Ͱ� ������ ���� �ֻ��� ��ü�� Object�� ��ȯ�Ѵ�.
			System.out.println(it.next());
		}
	}
}
