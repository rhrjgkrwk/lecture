package com.poly.my;
/*
<������>
- ��ü�� ����ȯ�� ���ؼ� �˾ƺ���.
	- �ڷ��� ����ȯ�� (int)���� ĳ��Ʈ �����ڷ� �����ϰ� �� �� �ֵ�
	- ��ü�� ����ȯ�� ... 

<�߻�Ŭ����>
	- abstract ��ü�� ����
	- �߻�Ŭ������ �� ���°�!!!!!!!(�߻�)
		1. �� �� �������� ���̱� ���� ����
		2. !!!
*/

class Parent{
	
}

class Child extends Parent{
	
}

public class PolyMorphism {
	public static void main(String[] args) {
		Parent p1 = new Parent();
		Child c1 = new Child();
		
		Parent p2 = new Child();
		Parent p3 = c1; //c1�� �������� p3�� �ִ´�. ��, child���� parent�� ����ȯ�� ��.
		
		Parent p4 = new Child(); //child ���� > parent �����̱� ������ ���� - up scale
		//Child c2 = new Parent(); // child ���� > parent �����̱� ������ �Ұ���.(����� �ȸ����ϱ�) - down scale
		//��� �θ� �տ� ���� �͸� �ش��� �ȴ�.
		
		
		Child c3 = (Child)p4; //��� �Դ��� Ȯ���� �غ����Ѵ�. p4 = new Child()�κ��� ������ ����
		Child c4 = (Child)p1; //p1 = new Parent()n - �����Ͻ� ����X ����ð��� ������ ��.
		
		
	}
}
