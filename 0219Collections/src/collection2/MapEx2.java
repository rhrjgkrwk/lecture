package collection2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MapEx2 {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(101, "민들레");
		map.put(201, "국화");
		map.put(301, "장미");
		map.put(401, "개나리");
		Set<Integer> keys = map.keySet();
		List<Integer> li = new ArrayList<>(keys);
		Collections.sort(li);
		for (Integer i : li) {
			System.out.println(i);
		}
	}
}
