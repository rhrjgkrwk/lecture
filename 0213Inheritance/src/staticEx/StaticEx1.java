package staticEx;

/*
(1) static �ʵ� :����Ÿ ���� ������ ���� �����ϴ� ����(����ʵ常 ����)
��Ŭ�����̸����� ���ٰ���
�谴ü�߻��� �޸��Ҵ�
 <����> Ŭ������.�������  or  ��ü��.�������   
(2) static �ʱ�ȭ����
 <����> static {   �ʱ�ȭ����;  }
(3) static �޼��� : static�ʵ带 ��Ʈ���� �������� ����
(4) ����ƽ�� �������̴°�!
	

static �� ��ü ���� ���� �޸𸮿� �ε�
static�� �����ʵ带 ���� static (this���� ����)
static�� this. ���� �ʱ�ȭ���� �ʴ´�.
static ��������� static ���� �ʱ�ȭ ������ static{} ������ �ʱ�ȭ�Ѵ�.
*/
class Test{
	int x;
	int y;
	static int z;
	static{
		System.out.println("static �ʱ�ȭ");
		z = 123;
	}
	public Test(int x, int y, int z1) {
		this.x = x;
		this.y = y;
		z = z1;
		System.out.println("��ü�� �ʱ�ȭ ����");
	}
	public void view(){
		System.out.println(x+" "+y+" "+z);
	}
}
public class StaticEx1 {
	public static void main(String[] args) {
		Test t1 = new Test(1,2,3);
		Test t2 = new Test(4,5,7);
		t1.view();
		t2.view();
	}
}
