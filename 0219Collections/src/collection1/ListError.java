package collection1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/*
���׸����� ������� ���� ���, 
������ ���� ������ ������ ����� ����ȯ�� �߻��� �� �ִ�.
*/
public class ListError {
	public static void main(String[] args) {
		List<String> li = new ArrayList<>();
		//���� ������ ��ü�� �ְ� ������ Object ��ü�� �־��!
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
		
		for (int i = 0; i < li1.size(); i++) { //�����߻� casting error
			String s = (String)li1.get(i);
			System.out.println(s+"dd");
		}
		
		Iterator it = li.iterator();
		while (it.hasNext()) { //� �����Ͱ� ������ ���� �ֻ��� ��ü�� Object�� ��ȯ�Ѵ�.
			System.out.println(it.next());
		}
	}
}
