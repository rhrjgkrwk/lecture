/*
	�����带 �������.(������ ����� ����� �� ������ �ִ�. 
	�ϳ��� Thread ���, �ϳ��� Runnable Interface�� �����ϴ� ��.
		- Thread Ŭ���� ����� �̿��� ������ ����.
		1. ������� ���� Ŭ����
		2. �����带 ����� ������ Thread Ŭ������ ��ӹ޵��� ����.
		3. Ŭ������ ����� ��ü�� �����Ѵ�.(������ ���� �ƴϴ�.)
		4. start() �޼ҵ带 ����ϸ� ���������� run() - (Thread ���� �޼���) �̶�� �޼ҵ带 �����Ѵ�.
*/
public class ThreadClass {
	public static void main(String[] args) {
		ThreadExam aa, bb; 
		aa = new ThreadExam(); //������ ��ü�� �����Ǿ���.
		bb = new ThreadExam(); //������ ��ü�� �����Ǿ���.
		
		aa.start(); //������ ���� ��� - ��ü ���� �� start�� ����� ������ �ȴ�.
		bb.start(); //������ ���� ��� - start()�ϰԵǸ� Thread ��ü ���������� run()�� ȣ���Ѵ�.
		
	}
}	

class ThreadExam extends Thread{ //������ Ŭ������ ��ӹ����� �����带 ������ �� �ֵ�.
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(getName()+" ��� ���ض�~~");
		//getName�� ������ ��ü�� �̸��� �����Ѵ�.(���� ������� ��ȣ�� �ٴ´�.)
	}
}
