package ex02;

import java.util.ArrayList;
import java.util.Random;

public class MakeList {
	ArrayList<Integer> list;
	public MakeList() {
		list = new ArrayList<>();
	}
	public void makeArrayList(int size){
		/*Size 만큼의 정수형 데이터를 랜덤 하게 만들어
		ArrayList에 넣는다.*/
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
기본 생성자
+makeArrayList(size:int):void
Size 만큼의 정수형 데이터를 랜덤 하게 만들어
ArrayList에 넣는다.
+getAverage():double ArrayList에 셋팅 된 정수들의 평균을 리턴 한다.
+getList():ArrayList 만들어진 ArrayList 정보를 리턴 한다.

*/