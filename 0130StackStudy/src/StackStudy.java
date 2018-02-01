import java.util.Iterator;
import java.util.Stack;

//Stack을 공부해보자.
//DFS할때 스택을 쓴다. (시스템 스택 - 재귀호출)..

public class StackStudy {
	public static void main(String[] args) {
		Stack<String> st = new Stack<>();
		st.push("곤드레밥");
		st.push("뚝배기불고기 ㅠㅠㅠㅠㅠ");
		st.push("오징어볶음 ㅠㅠㅠ");
		System.out.println(st.size());
		
		
		//Iterator를 사용해보자. 넣은 순서대로 나온다(Stack 형태 X)
		Iterator<String> itr = st.iterator(); //Iterator 생성
		while(itr.hasNext()){ //다음 요소가 있는지 체크
			System.out.println(itr.next()); //출력
		}
		System.out.println();
		for (Iterator iterator = st.iterator(); iterator.hasNext();) { //for문으로 돌릴때는 이렇게 하면 된다.
			System.out.println(iterator.next());
		}
		
		//Stack 형태로 출력해보자.\
		System.out.println();
		System.out.println("pop으로 출력한드아");
		/*		
		if (!st.isEmpty()) {
			System.out.println(st.pop());
		}
		*/
		while(!st.isEmpty()){ //값이 있는 동안 돈다.
			System.out.println(st.pop()); //pop은 스택에서 아예 요소를 제거.
		}
		
		
		
		System.out.println();
	}
}
