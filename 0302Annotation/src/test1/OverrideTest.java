package test1;

import java.util.ArrayList;
import java.util.List;

public class OverrideTest /*extends Object*/{
	@Override //메서드를 오버라이드했다!
	public String toString(){
		return "메롱";
	}
	@SuppressWarnings(/*value=*/"unchecked") //검증되지 않은 연산자 관련 경고.
	public static void main(String[] args) {
		System.out.println(new OverrideTest().toString());
		@SuppressWarnings(/*value=*/"rawtypes") //제네릭스 미사용(타입 미지정)에 대한 경고 생략.
		List list = new ArrayList();
		list.add("apple");
		list.add("orange");
		list.add(5);
		
		for (Object object : list) {
			System.out.println(object);
		}
	}
}
