package constructor;

public class ConstructorEx6 {
	public static void main(String[] args) {
		Student st = new Student();
		//setter�� �������� toStrin()���� ���
		st.setName("��ȫ��");
		st.setEng(99);
		st.setKor(97);
		st.setMat(99);
		
		System.out.println(st);

	    //���� 4���� �޴� �����ڸ� ���� ��ü�� �������� �ε鷡,90,75,88�� 
	    //�������� getter�� �̿��Ͽ� ���
		Student ss=new Student("�ε鷹", 90,75,88);
		System.out.println("�̸� : "+ss.getName());
		System.out.println("���� : "+ss.getKor());
		System.out.println("���� : "+ss.getMat());
		System.out.println("���� : "+ss.getEng());
		System.out.println("���� : "+ss.getTotal());
		System.out.printf("��� : %.2f\n", ss.getAvg());
		System.out.println("���� : "+ss.getGrade());
	}
}
/*
[���]
ȫ�浿�� ������ 258 �̸�, ����� 86.00�̰� ������ B�Դϴ�

�̸�:�ε鷡
����:90
����:75
����:88
����:253
���:84.33
����:B
*/




