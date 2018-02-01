import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/*

큐에 대해 알아보자!
- FIFO / LILO
- front / rear
- Collections interface --> Queue interface --> LinkedList class에서 상속받아 구현

우선순위 큐!
-  우선순위가 높은 것 부터 꺼내는 뀨
-  Collections interface --> Queue interface --> PriorityQueue class에서 상속받아 구현



*/
public class QueueStudy {
	public static void main(String[] args) {
		/*
		collection 인터페이스
			--> 큐 인터페이스
			--> 상속받아 만든 LinkedList 클래스.
		*/
		Queue<String> q = new LinkedList<>(); 
		//LinkedList는 인터페이스 Queue를 구현한 클래스, new Queue() 할 수 없다.
		//Queue<String> q1 = new Queue<>();
		
		//큐에 객체를 넣어보자.
		q.offer("바보");
		q.offer("바아보");
		q.offer("바아아보");
		q.offer("바아아아보");
		
		//이터레이터를 써보자.
		Iterator<String> iterator = q.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		//큐에서 요소를 꺼내보자.
		System.out.println(q.poll()); //poll : front의 요소를 끄집어낸다.
		System.out.println(q.peek()); // peek : front의 요소를 제거하지 않고 값만 불러온다.
		
		
		
		
		//PriorityQueue를 사용해보자
		//우선순위에 맞게 요소를 추출.
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
