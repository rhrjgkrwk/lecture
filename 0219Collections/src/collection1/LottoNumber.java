package collection1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class LottoNumber { //Set을 쓰면 중복을 거를수 있다.
	public static void main(String[] args) {
		Set<Integer> ln = new HashSet<>();
		while (ln.size()<=6) {
			ln.add(new Random().nextInt(45)+1);
		}
		List<Integer> l = new ArrayList<>(ln);
		Collections.sort(l);
		for (Integer temp : l) {
			System.out.println(temp);
		}
	}
}
