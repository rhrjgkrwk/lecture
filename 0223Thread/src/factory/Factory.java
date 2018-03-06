package factory;

public class Factory {
	private int product=0;
	
	public synchronized void produce(){      //����
		if(product > 4){
			try{
				System.out.println("���� �ߴ� : " + product);
				wait();
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}//end if		
		product++;
		System.out.println("���� : " + product);
		notifyAll();
	}
	//-------------------------------------------------------
	public synchronized void sell(){        //�Һ�
		if(product < 1)
		{
			try{
				System.out.println("�Һ� �ߴ� : " + product);
				wait();
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}//end if
		product--;
		System.out.println("�Һ� : " + product);
		notifyAll();
	}	
}
/*
Thread���� ����
�ΰ��� �����尡 �����͸� �ְ� �޴� ��쿡 �߻��ϴµ�
�̸� �ذ��ϱ� ���� �����忡�� wait();, notify();�� �̿��Ѵ�.

wait() : �����带 �Ͻ����� ���� ��� ���·� �����.
notify() : �����带 ���� �ٽ� �����Ų��.
notifyAll() : ��� �����带 ���� �ٽ� �����Ų��. 

���߾����带 ����� ��� nofity();�� ����ϸ� � �����尡 ����� �� �� ���� ������
�켱������ ���� �����尡 ��� wait ���·� �ӹ��� �� �ִ�.
�׷��� ������ notifyAll();�� ���� JVM�� �������� �켱������ ���� ó���ϰ� �ϴ� ���� ����.
*/
















