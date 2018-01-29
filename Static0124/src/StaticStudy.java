class Emp{
	String name; //instance ����
	static int num = 0; //static ����
	/*
	static ������ ���� �˾ƺ���
	- static ������ ������ ������ ����ȴ�.
	- ����ƽ�� ����� �ʱ�ġ�� �־�����Ѵ�.
	- instance ���� ���� ��밡��.
	- ����ƽ�� ��ü�� ������ ����. - �ν��Ͻ� �������� ����� �����ϴ�.
	- ���� class��.����ƽ������ ���� �Ѵ�.
	- ����ƽ�� ����� �ʱ�ġ�� �־�����Ѵ�.
	- 
	*/
	public Emp(){ //������
		System.out.println("��ü ������ : "+ ++num);
	}
	/*
	static �޼��忡 ���ؼ� �˾ƺ���.
	- static method �ȿ��� static ������ ��.
	*/
	public static int getEmpNum(){ //static method �ȿ��� static ������ ��.
		return num;
	}
}

public class StaticStudy {
	public static void main(String[] args) {
		Emp e1 = new Emp();
		Emp e2 = new Emp();
		Emp e3 = new Emp();
		System.out.println("��ü ������ : "+ Emp.getEmpNum());
		Emp.num = 12; //Class��.staticVar������ ���.
		System.out.println(Emp.num);
	}
}
