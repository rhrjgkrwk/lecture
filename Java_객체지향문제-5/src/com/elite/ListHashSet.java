package com.elite;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class ListHashSet {
	public static void main(String[] args) {
		int size = Integer.parseInt(args[0]);
		ArrayList<Integer> list = new ArrayList<Integer>();
		HashSet<Integer> set = new HashSet<Integer>();
		// ArrayList�� size��ŭ�� ���� ��ŭ ������ ���ڸ� �ִ´�.
		Random rd = new Random();
		for (int i = 0; i < size; i++) {
			int tmp = rd.nextInt(size)+1;
			list.add(tmp);
			System.out.print(tmp+" ");
		}System.out.println();
		
		// ArrayList�� ������ HashSet�� �ִ´�.
		set.addAll(list);
		System.out.println(set);
	}
}



/*eclipse argument�� 10�� �Է� �Ͽ��� �� ���
6 9 9 6 9 2 7 5 5 10
[2, 5, 6, 7, 9, 10]*/