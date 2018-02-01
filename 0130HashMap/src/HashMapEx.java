import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Vector;

/*
Map --> HashMap(Map을 상속받음)
*/

public class HashMapEx {
	public static void main(String[] args) {
		Map map = new HashMap();
		// HashMap hsmap = new HashMap();
		SimpleDateFormat s = new SimpleDateFormat("yyyy년MM월dd일 출간");

		// map에 data를 넣어봅자.
		map.put("title", "Java Programming");
		map.put("author", "Chang Hee Lee");
		map.put("publisher", "MultiCampus");
		map.put("date", s.format(new Date()));

		// key를 이용해서 value를 찍어보자.
		System.out.println(map.get("title"));
		System.out.println(map.get("author"));
		System.out.println(map.get("publisher"));
		System.out.println(map.get("date"));
		System.out.println();

		// 삭제/변경를 해보자.
		map.remove("date");
		map.put("date", new Date());
		map.put("title", "JSP프로그래밍");

		System.out.println(map.get("title"));
		System.out.println(map.get("author"));
		System.out.println(map.get("publisher"));
		System.out.println(map.get("date"));
		System.out.println();

		// 제네릭스를 이용해보자. <정수, 문자열>
		HashMap<Integer, String> hsmap = new HashMap<>();
		System.out.println(hsmap.size());
		hsmap.put(1, "메롱");
		hsmap.put(2, "메로롱");
		hsmap.put(3, "메로로롱");
		hsmap.put(4, "메로로로롱");
		hsmap.put(5, "메로로로로롱");
		hsmap.put(6, "메로로로로로롱");
		for (int i = 1; i < 7; i++) {
			System.out.println(hsmap.get(i));
		}

		// key 만 따로 묶어서 출력해보자.
		Set<Integer> s1 = hsmap.keySet();
		System.out.println(s1);
		// value만 따로 묶어서 출력해보자.
		Collection<String> c1 = hsmap.values();
		System.out.println(c1);
		/*
		 * 제네릭스를 사용한 헤쉬맵 클래스에 학생이름을 넣은 후 주어진 스튜던트 클래스의 메소드를 사용하여 다음과 같이 출력하는
		 * 프로그램을 작성해보자.
		 * 
		 * Student studentId(integer) studentName(String)
		 * 
		 */

		System.out.println(
				"\n\n제네릭스를 사용한 헤쉬맵 클래스에 학생이름을 넣은 후\n" 
		+ "주어진 스튜던트 클래스의 메소드를 사용하여\n" 
						+ "다음과 같이 출력하는 프로그램을 작성해보자.\n");

		HashMap<Integer, Student> hsmap1 = new HashMap<>();
		hsmap1.put(1, new Student("메롱")); //원래 new Integer(1) 이렇게 넣어야하는데 
		hsmap1.put(2, new Student("메로롱"));
		hsmap1.put(3, new Student("메로로롱"));
		hsmap1.put(4, new Student("메로로로롱"));
		hsmap1.put(5, new Student("메로로로로롱"));

		System.out.println(hsmap1.get(1).getName());
		System.out.println(hsmap1.get(2).getName());
		System.out.println(hsmap1.get(3).getName());
		System.out.println(hsmap1.get(4).getName());
		System.out.println(hsmap1.get(5).getName());
		
		
		
		//foreach문을 활용해보자.
		Set <Map.Entry<Integer, Student>> s3 = hsmap1.entrySet(); //entrySet은 key, value 모음
		for (Map.Entry<Integer, Student> i : s3) {
			System.out.println(i.getKey()+"\t"+i.getValue().getName());
		}
		
		
		
		
		//Enumeration을 사용해보자.
		//Enumeration의 개선된 버젼이 iterator
		System.out.println();
		Vector<String> v1 = new Vector<>();
		v1.add("지니"); //KT
		v1.add("아리"); //SK
		v1.add("소피아"); //인공지능.
		
		Enumeration e1 = v1.elements(); //사용법은 iterator와 유사하다.
		while (e1.hasMoreElements()) {
			System.out.println(e1.nextElement());
		}
		
		
		
		
	}
}

class Student {
	private String name;

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String name) {
		this.name = name;
	}

	// getter&setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
