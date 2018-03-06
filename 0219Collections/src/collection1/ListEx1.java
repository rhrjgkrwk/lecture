package collection1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/*
 * 
 * 4) 제네릭스
        Heterogeneous의특징을 갖는 Collection을 Compile-time type에 안전함과 cating에 대한
        불편함을 없애기 위해 Homegeneous한 형태로 바꾸는 새로운 타입이다
        자바에서 타입에 관련된 것은 제네릭스와 연관을 갖는다
        (도입배경)
            - Collection클래스에 서로 다른 객체를 저장하는 것에 대한 제한불가
            - 컴파일 하는 도중 타입 확인이 불가능하다
            - 저장된 객체를 사용시에는 반드시 캐스팅해야한다
              (ClassCastException과 같은 런타임 오류를 발생)
         (제네릭스의 특징)
             1. Collection 선언시에< >안에 매개변수타입을선언, 컴파일러에게 사용타입을 전달
             2. 캐스팅이 필요없고, 보다 안전한 코드를 작성할수 있다
             3. 메소드가 받아들일수 있는 타입을 제한 함으로써 에러검사, 타입검사를 생략할수 있다
             4. java.util패키지의 컬렉션클래스 들은 기본적으로 제네릭스를 지원한다
             5. 매개변수 타입에는 primitive타입(기본형)을 사용할수 없다

 * 
(2)List인터페이스 
List인터페이스로 구현된 클래스로 ArrayList, Vector, Stack, LinkedList가 있다
1) List
  - List의 요소에는 순서를 가진다
2) ArrayList
  -자바에서는 배열을 생성할때 배열의길이를 늘리거나 줄일수없다.
  -ArrayList클래스는 원소가 가득차게되면 자동적으로 저장영역을 늘려준다 
  - List에서 객체를 얻어내는데 효율적이다
  - 동기화(synchroniztion)을 제공하지 않는다
3) LinkedList
  - List에서 앞뒤에 데이터를 삽입하거나 삭제하는데 효율적이다
   -동기화를 제공하지 않는다  - 벡터와의 차이점
   
4) Vecter
  : 가변배열을 처리하는 클래스   
   배열(Array)은 고정길이를 사용하기 때문에 길이를 늘리거나 줄일수 없다
   Vector클래스를 사용하면 배열의 크기를 늘리거나 줄일수 있다.
   기본적으로 ArrayList와 동등하지만 Vector에서는 동기화를 제공한다
   (따라서 채팅 등의 동기화가 필요한 앱 제작시 객체를 담을때 쓰인다.)
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
public class ListEx1 {
	@SuppressWarnings(value="unchecked")
	public static void main(String[] args) {
		List li = new ArrayList();
		li.add(2);
		li.add(new Float(2.12));
		li.add(4.00);
//		int ==> Integer : boxing (기본형 ==> 객체)
//		Integer --> int : Unboxing (객체 ==> 기본형)
		System.out.println(li);
		
		Iterator it = li.iterator();
		while (it.hasNext()) { //어떤 데이터가 나올지 모르지 최상위 객체인 Object로 반환한다.
			System.out.println(it.next());
		}
	}
}
