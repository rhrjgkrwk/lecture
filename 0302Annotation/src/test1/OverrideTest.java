package test1;

import java.util.ArrayList;
import java.util.List;

public class OverrideTest /*extends Object*/{
	@Override //�޼��带 �������̵��ߴ�!
	public String toString(){
		return "�޷�";
	}
	@SuppressWarnings(/*value=*/"unchecked") //�������� ���� ������ ���� ���.
	public static void main(String[] args) {
		System.out.println(new OverrideTest().toString());
		@SuppressWarnings(/*value=*/"rawtypes") //���׸��� �̻��(Ÿ�� ������)�� ���� ��� ����.
		List list = new ArrayList();
		list.add("apple");
		list.add("orange");
		list.add(5);
		
		for (Object object : list) {
			System.out.println(object);
		}
	}
}
