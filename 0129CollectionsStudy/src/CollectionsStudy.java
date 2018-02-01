
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/*
- Collections 를 공부해보자.

	- Array - 고정길이 배열 - one data type
	- Collections -  가변길이 배열 - multi data type
	- Collection + generics = one data type + 가변길이 배열.
	
*/

public class CollectionsStudy extends Vector { //Vector클래스를 상속받는다.

	public CollectionsStudy(int i) {
		super(i);
	}

	public static void main(String[] args) {
		
		//Collection - Vector - 가변길이 배열.
		//Vector랑 ArrayList는 거의 비슷 . 예전에는 벡터를 주로 이용했다고 함.
		//ArrayList가 더 간단하고 사용하기 편하다. 기왕이면 ArrayList를 쓰자.
		CollectionsStudy cs = new CollectionsStudy(2);
		cs.addElement(new Integer(10));
		cs.addElement(new Double(22.22));
		cs.addElement(new String("짜바"));
		//cs.remove(1);
		if (cs.contains("짜바")) {
			System.out.println(cs.indexOf("짜바")+"번째에 있지롱~~");
		}
		else{
			System.out.println("없넹...");
		}
		
		//Vector의 길이를 알아보자.
		System.out.println("현재 element 개수 : "+cs.elementCount); //멤버변수
		System.out.println("현재 element 개수 : "+cs.size()); //메서드
		
		
		//ArrayList를 사용해보자. 파이썬의 리스트랑 비슷하다.
		ArrayList a1 = new ArrayList();
		a1.add(30);
		a1.add("나무");
		
		System.out.println(a1.get(0));
		System.out.println();
		System.out.println("제네릭스를 사용해보자");
		System.out.println();
		
		//generics를 활용해서 arraylist를 사용해보자.
		//인스턴스 생성시 <String>으로 지정해주면 String만 들어갈 수 있다.
		//제네릭스를 쓰는 것은 멀티데이터 타입의 단점을 보완하기 위해서/
		//즉, 배열의 원데이터타입이라는 장점과 콜렉션의 가변길이라는 장점을 동시에 사용하기 위해 
		//제네릭스를 쓰는 것이다.
		List a2 = new ArrayList();
		ArrayList<String> a3 = new ArrayList<String>();
		a3.add("우유");
		a3.add("김밤");
		a3.add("립밤");
		a3.add("라면");
		a3.set(3, "라멘"); //3번째 인덱스의 요소를 라멘으로 바꿔보자.
		a3.remove(3); // 3번째 인덱스의 요소를 삭제해보자.
		a3.remove("우유");
		for (int i = 0; i < a3.size(); i++) {
			System.out.println(a3.get(i)); //김밤 립밤
		}
		
		//Collection 에 객체를 담아서 처리해보자.
		
		
		
		
		
	}

}
