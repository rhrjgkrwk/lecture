package com.elite;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class ListHashSet {
	public static void main(String[] args) {
		int size = Integer.parseInt(args[0]);
		ArrayList<Integer> list = new ArrayList<Integer>();
		HashSet<Integer> set = new HashSet<Integer>();
		// ArrayList에 size만큼의 개수 만큼 랜덤한 숫자를 넣는다.
		Random rd = new Random();
		for (int i = 0; i < size; i++) {
			int tmp = rd.nextInt(size)+1;
			list.add(tmp);
			System.out.print(tmp+" ");
		}System.out.println();
		
		// ArrayList에 정보를 HashSet에 넣는다.
		set.addAll(list);
		System.out.println(set);
	}
}



/*eclipse argument로 10을 입력 하였을 때 결과
6 9 9 6 9 2 7 5 5 10
[2, 5, 6, 7, 9, 10]*/