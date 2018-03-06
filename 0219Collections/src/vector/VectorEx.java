package vector;
/*
4) Vecter
: �����迭�� ó���ϴ� Ŭ����   
 �迭(Array)�� �������̸� ����ϱ� ������ ���̸� �ø��ų� ���ϼ� ����
 VectorŬ������ ����ϸ� �迭�� ũ�⸦ �ø��ų� ���ϼ� �ִ�.
 �⺻������ ArrayList�� ���������� Vector������ ����ȭ�� �����Ѵ�
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

import java.util.Vector;

public class VectorEx {
	public static void main(String[] args) {
		Vector<Double> v = new Vector<>(); //��ü ������ 10���� ��´�.
		v.add(100.3);
		v.add(23.3);
		v.add(3.3);
		v.add(1.3);
		
		double s = 1.3;
		int index = v.indexOf(s);
		if (index != -1) {
			System.out.println(s+"�� ��ġ�� "+(index+1));
		}
		else {
			System.out.println(s+"�� �������� �ʴ´�.");
		}
		System.out.println(v);
		if (v.contains(s)) {
			v.remove(s);
		}
		System.out.println(v);
		System.out.println(v.capacity()+" "+v.size());
		v.trimToSize(); //���ʿ��� �뷮 ���̱�. ������ �ʴ� ������ release
		System.out.println(v.capacity()+" "+v.size());
	}
	
	
}
