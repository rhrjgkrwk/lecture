package collection2;

import java.util.HashMap;
import java.util.Map;

public class MapEx1 {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(101, "민들레");
		map.put(201, "국화");
		map.put(301, "장미");
		map.put(401, "개나리");
		System.out.println("키 : " +101+ "\t값 : "+map.get(101));
	}
}
