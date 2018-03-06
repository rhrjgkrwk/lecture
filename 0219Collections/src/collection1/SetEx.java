package collection1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
(1)Set�������̽�  : �ߺ� X, ���� X(LinkedHashSet ����)
1)HashSet
    - Set�� ��ü�� �����ϴµ� Hash�� ����Ͽ� ó���ӵ��� ������
2) LinkedHashSet
    - HashSet�� ���� ����.�������� Set�� �߰��Ǵ� ������ �����Ѵٴ°�
3)TreeSet
   - ��ü�� Hash���� ���� ���������� ������ �����Ѵ�
*/
public class SetEx {
	@SuppressWarnings(value="unchecked")
	public static void main(String[] args) {
		//���� ������ ����ϰԵǸ� ���� ���� �ʴ� �Ϳ� ���� ������ �����ش�.
		
		Set set = new HashSet();
		set.add(2);
		set.add(new Float(2.12));
		set.add(4.00);
//		int ==> Integer : boxing (�⺻�� ==> ��ü)
//		Integer --> int : Unboxing (��ü ==> �⺻��)
		
		
		Iterator it = set.iterator();
		while (it.hasNext()) { //� �����Ͱ� ������ ���� �ֻ��� ��ü�� Object�� ��ȯ�Ѵ�.
			System.out.println(it.next());
		}
		
	}
}
