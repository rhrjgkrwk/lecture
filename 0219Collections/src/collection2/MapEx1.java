package collection2;

import java.util.HashMap;
import java.util.Map;

public class MapEx1 {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(101, "�ε鷹");
		map.put(201, "��ȭ");
		map.put(301, "���");
		map.put(401, "������");
		System.out.println("Ű : " +101+ "\t�� : "+map.get(101));
	}
}
