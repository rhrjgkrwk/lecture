package ex02;

import java.util.ArrayList;

public class ListTest01 {
	public static void main(String[] args) {
		// argument�� ������ �޴´�.
		// MakeList ��ü ����
		MakeList m = new MakeList();
		m.makeArrayList(Integer.parseInt(args[0]));
		ArrayList<Integer> list = null;
		// for���� �̿��Ͽ� ArrayList�� ���� ����ϰ� ����� ��� �Ѵ�.
		list = m.getList();
		for (Integer i : list) {
			System.out.print(i+" ");
		}
		System.out.println();
		// ��� ���
		System.out.println(m.getAverage());
	}
}

