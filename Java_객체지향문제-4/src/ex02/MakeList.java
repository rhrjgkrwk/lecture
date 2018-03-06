package ex02;

import java.util.ArrayList;
import java.util.Random;

public class MakeList {
	ArrayList<Integer> list;
	public MakeList() {
		list = new ArrayList<>();
	}
	public void makeArrayList(int size){
		/*Size ��ŭ�� ������ �����͸� ���� �ϰ� �����
		ArrayList�� �ִ´�.*/
		list = new ArrayList<>(size);
		Random rd = new Random();
		for (int i = 0; i < size; i++) {
			list.add(rd.nextInt(45)+1);
		}
	}
	public double getAverage(){
		int sum = 0;
		for (Integer i : list) {
			sum+=i;
		}
		return sum/list.size();
	}
	public ArrayList<Integer> getList(){
		return list;
	}
}
/*
MakeList()
�⺻ ������
+makeArrayList(size:int):void
Size ��ŭ�� ������ �����͸� ���� �ϰ� �����
ArrayList�� �ִ´�.
+getAverage():double ArrayList�� ���� �� �������� ����� ���� �Ѵ�.
+getList():ArrayList ������� ArrayList ������ ���� �Ѵ�.

*/