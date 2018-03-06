package ex02;

import java.util.ArrayList;

public class ListTest01 {
	public static void main(String[] args) {
		// argument로 정수를 받는다.
		// MakeList 객체 생성
		MakeList m = new MakeList();
		m.makeArrayList(Integer.parseInt(args[0]));
		ArrayList<Integer> list = null;
		// for문을 이용하여 ArrayList의 정보 출력하고 평균을 출력 한다.
		list = m.getList();
		for (Integer i : list) {
			System.out.print(i+" ");
		}
		System.out.println();
		// 평균 출력
		System.out.println(m.getAverage());
	}
}

