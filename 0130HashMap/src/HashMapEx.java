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
Map --> HashMap(Map�� ��ӹ���)
*/

public class HashMapEx {
	public static void main(String[] args) {
		Map map = new HashMap();
		// HashMap hsmap = new HashMap();
		SimpleDateFormat s = new SimpleDateFormat("yyyy��MM��dd�� �Ⱓ");

		// map�� data�� �־��.
		map.put("title", "Java Programming");
		map.put("author", "Chang Hee Lee");
		map.put("publisher", "MultiCampus");
		map.put("date", s.format(new Date()));

		// key�� �̿��ؼ� value�� ����.
		System.out.println(map.get("title"));
		System.out.println(map.get("author"));
		System.out.println(map.get("publisher"));
		System.out.println(map.get("date"));
		System.out.println();

		// ����/���渦 �غ���.
		map.remove("date");
		map.put("date", new Date());
		map.put("title", "JSP���α׷���");

		System.out.println(map.get("title"));
		System.out.println(map.get("author"));
		System.out.println(map.get("publisher"));
		System.out.println(map.get("date"));
		System.out.println();

		// ���׸����� �̿��غ���. <����, ���ڿ�>
		HashMap<Integer, String> hsmap = new HashMap<>();
		System.out.println(hsmap.size());
		hsmap.put(1, "�޷�");
		hsmap.put(2, "�޷η�");
		hsmap.put(3, "�޷ηη�");
		hsmap.put(4, "�޷ηηη�");
		hsmap.put(5, "�޷ηηηη�");
		hsmap.put(6, "�޷ηηηηη�");
		for (int i = 1; i < 7; i++) {
			System.out.println(hsmap.get(i));
		}

		// key �� ���� ��� ����غ���.
		Set<Integer> s1 = hsmap.keySet();
		System.out.println(s1);
		// value�� ���� ��� ����غ���.
		Collection<String> c1 = hsmap.values();
		System.out.println(c1);
		/*
		 * ���׸����� ����� �콬�� Ŭ������ �л��̸��� ���� �� �־��� ��Ʃ��Ʈ Ŭ������ �޼ҵ带 ����Ͽ� ������ ���� ����ϴ�
		 * ���α׷��� �ۼ��غ���.
		 * 
		 * Student studentId(integer) studentName(String)
		 * 
		 */

		System.out.println(
				"\n\n���׸����� ����� �콬�� Ŭ������ �л��̸��� ���� ��\n" 
		+ "�־��� ��Ʃ��Ʈ Ŭ������ �޼ҵ带 ����Ͽ�\n" 
						+ "������ ���� ����ϴ� ���α׷��� �ۼ��غ���.\n");

		HashMap<Integer, Student> hsmap1 = new HashMap<>();
		hsmap1.put(1, new Student("�޷�")); //���� new Integer(1) �̷��� �־���ϴµ� 
		hsmap1.put(2, new Student("�޷η�"));
		hsmap1.put(3, new Student("�޷ηη�"));
		hsmap1.put(4, new Student("�޷ηηη�"));
		hsmap1.put(5, new Student("�޷ηηηη�"));

		System.out.println(hsmap1.get(1).getName());
		System.out.println(hsmap1.get(2).getName());
		System.out.println(hsmap1.get(3).getName());
		System.out.println(hsmap1.get(4).getName());
		System.out.println(hsmap1.get(5).getName());
		
		
		
		//foreach���� Ȱ���غ���.
		Set <Map.Entry<Integer, Student>> s3 = hsmap1.entrySet(); //entrySet�� key, value ����
		for (Map.Entry<Integer, Student> i : s3) {
			System.out.println(i.getKey()+"\t"+i.getValue().getName());
		}
		
		
		
		
		//Enumeration�� ����غ���.
		//Enumeration�� ������ ������ iterator
		System.out.println();
		Vector<String> v1 = new Vector<>();
		v1.add("����"); //KT
		v1.add("�Ƹ�"); //SK
		v1.add("���Ǿ�"); //�ΰ�����.
		
		Enumeration e1 = v1.elements(); //������ iterator�� �����ϴ�.
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
