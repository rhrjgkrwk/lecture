package collection2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MapEx4 {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("민들레", "객실1");
		map.put("국화", "객실2");
		map.put("진달래", "객실1");
		map.put("개나리", "객실3");
		map.put("채송화", "객실2");
		Set<String> keys = map.keySet();
		/*List<Integer> li = new ArrayList<>(keys);
		Collections.sort(li);
		for (Integer i : li) {
			System.out.println(i);
		}*/
		Scanner sc = new Scanner(System.in);
		System.out.print("방이름을 입력하시오(객실1~객실3) : ");
		String rn = sc.nextLine();
		if (map.containsValue(rn)) {
			for (String s : keys) {
				if (map.get(s).equals(rn)) {
					System.out.println(s+"는 현재 "+rn+"에 있다.");
				}
			}
		}
		else {
			System.out.println("입력한 방이 존재하지 않는다.");
		}
	}
}
