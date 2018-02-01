import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/*

ť�� ���� �˾ƺ���!
- FIFO / LILO
- front / rear
- Collections interface --> Queue interface --> LinkedList class���� ��ӹ޾� ����

�켱���� ť!
-  �켱������ ���� �� ���� ������ ��
-  Collections interface --> Queue interface --> PriorityQueue class���� ��ӹ޾� ����



*/
public class QueueStudy {
	public static void main(String[] args) {
		/*
		collection �������̽�
			--> ť �������̽�
			--> ��ӹ޾� ���� LinkedList Ŭ����.
		*/
		Queue<String> q = new LinkedList<>(); 
		//LinkedList�� �������̽� Queue�� ������ Ŭ����, new Queue() �� �� ����.
		//Queue<String> q1 = new Queue<>();
		
		//ť�� ��ü�� �־��.
		q.offer("�ٺ�");
		q.offer("�پƺ�");
		q.offer("�پƾƺ�");
		q.offer("�پƾƾƺ�");
		
		//���ͷ����͸� �Ẹ��.
		Iterator<String> iterator = q.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		//ť���� ��Ҹ� ��������.
		System.out.println(q.poll()); //poll : front�� ��Ҹ� �������.
		System.out.println(q.peek()); // peek : front�� ��Ҹ� �������� �ʰ� ���� �ҷ��´�.
		
		
		
		
		//PriorityQueue�� ����غ���
		//�켱������ �°� ��Ҹ� ����.
		Queue<Integer> pq = new PriorityQueue<Integer>();
		pq.offer(5);
		pq.offer(1);
		pq.offer(2);
		pq.offer(4);
		pq.offer(3);
		System.out.println(pq);
		while (!pq.isEmpty()) {
			System.out.println(pq.poll());
		}
		
	}
}
