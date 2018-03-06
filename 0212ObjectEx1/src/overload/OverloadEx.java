package overload;

/*
�Լ��̸��� �ߺ����� ���� ������
�Լ��� �̸� ����!!!!!
�ϳ��� �̸��� ���� �Լ��� ������ ���� ���ڿ� ��ó

Overload Method
- ���� �̸��� �Լ��� ������ �����ϴ� ��.
- �ݵ�� �޼��� �̸��� ����.
- �����Ϸ��� �Լ��� ã�ư� ���� ���ڰ��� �߿�, ����Ÿ���� �������ʴ´�.
- ���� ����Ÿ���� �������
- �Ķ������ ������ Ÿ���� �޶�� �����ε��� �����Ѵ�.
- �޼����� �̸��� ����
*/

public class OverloadEx {
	int x = 10;
	int y = 20;
	
	public int max() {
		return x > y ? x : y;
	}
	
	public int max(int x, int y) {
		return x > y ? x : y;
	}

	public float max(float x, float y) {
		return x > y ? x : y;
	}

	public double max(double x, double y) {
		return x > y ? x : y;
	}

	public static void main(String[] args) {
		OverloadEx ob = new OverloadEx();
		System.out.println(ob.max());
		System.out.println(ob.max(50,20));
		System.out.println(ob.max(5645.12,123.123));
	}
}

//