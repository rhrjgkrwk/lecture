package collection2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapEx3 {
	public static void main(String[] args) {
		Book b1 = new Book("java","kim",1098);
		Book b2 = new Book("c++","lee",255);
		Book b3 = new Book("oracle","park",456);
		Map<String, Book> map = new HashMap<>();
		map.put(b1.getName(), b1);
		map.put(b2.getName(), b2);
		map.put(b3.getName(), b3);
		
		for (String s : map.keySet()) {
			System.out.println(map.get(s));
		}
		
		//도서를 찾아보자.
		
		Scanner sc = new Scanner(System.in);
		String keyword = sc.nextLine();
		if (map.get(keyword)==null) {
			System.out.println("there's no book that you typed");
		}
		else {
			System.out.println(map.get(keyword));
		}
		sc.close();
	}
}
