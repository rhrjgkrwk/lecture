package vector;
/*
4) Vecter
: 가변배열을 처리하는 클래스   
 배열(Array)은 고정길이를 사용하기 때문에 길이를 늘리거나 줄일수 없다
 Vector클래스를 사용하면 배열의 크기를 늘리거나 줄일수 있다.
 기본적으로 ArrayList와 동등하지만 Vector에서는 동기화를 제공한다
 그래서 List객체중에 가장 성능이 좋지 않다

(형식) Vector<자료형> 객체명  = new Vector<자료형>(첨자,첨자);
                                                                   초기값,늘릴갯수

      ex) Vector<String> ss=new Vector<String>(3,2);

①hasMoreElements():백터안에서 꺼낼 객체가 있으면 true, 없으면 false
②nextElement() : 백터에서 객체를 가져옴
③elements()      : 백터요소들에 대한 Enumeration객체를 반환
④capacity()        : 현재 용량
⑤size()              : 현재data의 갯수
⑥addElement()   : data추가
⑦indexOf()         : 찾는위치
⑧contains()        : 비교
⑨remove()         : 삭제
⑨trimToSize()     : 빈공간제거
*/

import java.util.Vector;

public class VectorEx {
	public static void main(String[] args) {
		Vector<Double> v = new Vector<>(); //객체 생성시 10개를 잡는다.
		v.add(100.3);
		v.add(23.3);
		v.add(3.3);
		v.add(1.3);
		
		double s = 1.3;
		int index = v.indexOf(s);
		if (index != -1) {
			System.out.println(s+"의 위치는 "+(index+1));
		}
		else {
			System.out.println(s+"는 존재하지 않는다.");
		}
		System.out.println(v);
		if (v.contains(s)) {
			v.remove(s);
		}
		System.out.println(v);
		System.out.println(v.capacity()+" "+v.size());
		v.trimToSize(); //불필요한 용량 줄이기. 사용되지 않는 공간을 release
		System.out.println(v.capacity()+" "+v.size());
	}
	
	
}
