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
		map.put("�ε鷹", "����1");
		map.put("��ȭ", "����2");
		map.put("���޷�", "����1");
		map.put("������", "����3");
		map.put("ä��ȭ", "����2");
		Set<String> keys = map.keySet();
		/*List<Integer> li = new ArrayList<>(keys);
		Collections.sort(li);
		for (Integer i : li) {
			System.out.println(i);
		}*/
		Scanner sc = new Scanner(System.in);
		System.out.print("���̸��� �Է��Ͻÿ�(����1~����3) : ");
		String rn = sc.nextLine();
		if (map.containsValue(rn)) {
			for (String s : keys) {
				if (map.get(s).equals(rn)) {
					System.out.println(s+"�� ���� "+rn+"�� �ִ�.");
				}
			}
		}
		else {
			System.out.println("�Է��� ���� �������� �ʴ´�.");
		}
	}
}
