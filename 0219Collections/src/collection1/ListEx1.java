package collection1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/*
 * 
 * 4) ���׸���
        Heterogeneous��Ư¡�� ���� Collection�� Compile-time type�� �����԰� cating�� ����
        �������� ���ֱ� ���� Homegeneous�� ���·� �ٲٴ� ���ο� Ÿ���̴�
        �ڹٿ��� Ÿ�Կ� ���õ� ���� ���׸����� ������ ���´�
        (���Թ��)
            - CollectionŬ������ ���� �ٸ� ��ü�� �����ϴ� �Ϳ� ���� ���ѺҰ�
            - ������ �ϴ� ���� Ÿ�� Ȯ���� �Ұ����ϴ�
            - ����� ��ü�� ���ÿ��� �ݵ�� ĳ�����ؾ��Ѵ�
              (ClassCastException�� ���� ��Ÿ�� ������ �߻�)
         (���׸����� Ư¡)
             1. Collection ����ÿ�< >�ȿ� �Ű�����Ÿ��������, �����Ϸ����� ���Ÿ���� ����
             2. ĳ������ �ʿ����, ���� ������ �ڵ带 �ۼ��Ҽ� �ִ�
             3. �޼ҵ尡 �޾Ƶ��ϼ� �ִ� Ÿ���� ���� �����ν� �����˻�, Ÿ�԰˻縦 �����Ҽ� �ִ�
             4. java.util��Ű���� �÷���Ŭ���� ���� �⺻������ ���׸����� �����Ѵ�
             5. �Ű����� Ÿ�Կ��� primitiveŸ��(�⺻��)�� ����Ҽ� ����

 * 
(2)List�������̽� 
List�������̽��� ������ Ŭ������ ArrayList, Vector, Stack, LinkedList�� �ִ�
1) List
  - List�� ��ҿ��� ������ ������
2) ArrayList
  -�ڹٿ����� �迭�� �����Ҷ� �迭�Ǳ��̸� �ø��ų� ���ϼ�����.
  -ArrayListŬ������ ���Ұ� �������ԵǸ� �ڵ������� ���念���� �÷��ش� 
  - List���� ��ü�� ���µ� ȿ�����̴�
  - ����ȭ(synchroniztion)�� �������� �ʴ´�
3) LinkedList
  - List���� �յڿ� �����͸� �����ϰų� �����ϴµ� ȿ�����̴�
   -����ȭ�� �������� �ʴ´�  - ���Ϳ��� ������
   
4) Vecter
  : �����迭�� ó���ϴ� Ŭ����   
   �迭(Array)�� �������̸� ����ϱ� ������ ���̸� �ø��ų� ���ϼ� ����
   VectorŬ������ ����ϸ� �迭�� ũ�⸦ �ø��ų� ���ϼ� �ִ�.
   �⺻������ ArrayList�� ���������� Vector������ ����ȭ�� �����Ѵ�
   (���� ä�� ���� ����ȭ�� �ʿ��� �� ���۽� ��ü�� ������ ���δ�.)
   �׷��� List��ü�߿� ���� ������ ���� �ʴ�

(����) Vector<�ڷ���> ��ü��  = new Vector<�ڷ���>(÷��,÷��);
                                                                     �ʱⰪ,�ø�����

        ex) Vector<String> ss=new Vector<String>(3,2);

��hasMoreElements():���;ȿ��� ���� ��ü�� ������ true, ������ false
��nextElement() : ���Ϳ��� ��ü�� ������
��elements()      : ���Ϳ�ҵ鿡 ���� Enumeration��ü�� ��ȯ
��capacity()        : ���� �뷮
��size()              : ����data�� ����
��addElement()   : data�߰�
��indexOf()         : ã����ġ
��contains()        : ��
��remove()         : ����
��trimToSize()     : ���������
*/
public class ListEx1 {
	@SuppressWarnings(value="unchecked")
	public static void main(String[] args) {
		List li = new ArrayList();
		li.add(2);
		li.add(new Float(2.12));
		li.add(4.00);
//		int ==> Integer : boxing (�⺻�� ==> ��ü)
//		Integer --> int : Unboxing (��ü ==> �⺻��)
		System.out.println(li);
		
		Iterator it = li.iterator();
		while (it.hasNext()) { //� �����Ͱ� ������ ���� �ֻ��� ��ü�� Object�� ��ȯ�Ѵ�.
			System.out.println(it.next());
		}
	}
}
