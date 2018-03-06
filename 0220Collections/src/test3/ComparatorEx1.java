package test3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorEx1{
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("�౸");
		list.add("�߱�");
		list.add("��");
		list.add("�豸");
		list.add("Ź��");
		Collections.sort(list); //�⺻������ ������������ �Ǿ��ִ�.
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		Collections.sort(list, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o2.compareTo(o1);  //������������ �ٲ۴�.
				//compare �޼��带 ���� ���ÿ����÷ο�.. �ѳ� �翬�ϴ�.
				//compareTo �� ����.
			}
		});
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}
