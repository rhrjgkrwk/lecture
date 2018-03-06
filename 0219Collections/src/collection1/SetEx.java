package collection1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
(1)Set인터페이스  : 중복 X, 순서 X(LinkedHashSet 제외)
1)HashSet
    - Set에 객체를 저장하는데 Hash를 사용하여 처리속도가 빠르다
2) LinkedHashSet
    - HashSet과 거의 같다.차이점은 Set에 추가되는 순서를 유지한다는것
3)TreeSet
   - 객체의 Hash값에 의한 오름차순의 정렬을 유지한다
*/
public class SetEx {
	@SuppressWarnings(value="unchecked")
	public static void main(String[] args) {
		//위의 문장을 사용하게되면 형이 맞지 않는 것에 대한 오류를 지워준다.
		
		Set set = new HashSet();
		set.add(2);
		set.add(new Float(2.12));
		set.add(4.00);
//		int ==> Integer : boxing (기본형 ==> 객체)
//		Integer --> int : Unboxing (객체 ==> 기본형)
		
		
		Iterator it = set.iterator();
		while (it.hasNext()) { //어떤 데이터가 나올지 모르지 최상위 객체인 Object로 반환한다.
			System.out.println(it.next());
		}
		
	}
}
