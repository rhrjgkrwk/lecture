package com.moblie;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
	public static void main(String[] args) {
		Map<String, Mobile> map = new HashMap<String, Mobile>();
		map.put("LU6800",new Mobile("LU6800", "Optimus 2X", 800000));
		map.put("SU6600",new Mobile("SU6600", "Optimus Black", 900000));
		map.put("KU5700",new Mobile("KU5700", "Optimus Big", 700000));
		map.put("SU7600",new Mobile("SU7600", "Optimus Mach", 950000));
		double sum = 0;
		for (Mobile s : map.values()) {
			System.out.println(s.printInfo());
			sum+=s.getPrice();
		}
		System.out.printf("합계 : %.1f",sum);
		System.out.println();
		System.out.println("가격 변경 후");
		
		for (String s : map.keySet()) {
			map.get(s).setPrice(map.get(s).getPrice()*1.1);
		}
		
		sum = 0;
		for (Mobile s : map.values()) {
			System.out.println(s.printInfo());
			sum+=s.getPrice();
		}
		System.out.printf("합계 : %.1f",sum);
	}
}