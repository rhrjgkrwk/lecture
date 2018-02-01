import java.util.Iterator;
import java.util.Stack;

//Stack�� �����غ���.
//DFS�Ҷ� ������ ����. (�ý��� ���� - ���ȣ��)..

public class StackStudy {
	public static void main(String[] args) {
		Stack<String> st = new Stack<>();
		st.push("��巹��");
		st.push("�ҹ��Ұ�� �ФФФФ�");
		st.push("��¡��� �ФФ�");
		System.out.println(st.size());
		
		
		//Iterator�� ����غ���. ���� ������� ���´�(Stack ���� X)
		Iterator<String> itr = st.iterator(); //Iterator ����
		while(itr.hasNext()){ //���� ��Ұ� �ִ��� üũ
			System.out.println(itr.next()); //���
		}
		System.out.println();
		for (Iterator iterator = st.iterator(); iterator.hasNext();) { //for������ �������� �̷��� �ϸ� �ȴ�.
			System.out.println(iterator.next());
		}
		
		//Stack ���·� ����غ���.\
		System.out.println();
		System.out.println("pop���� ����ѵ��");
		/*		
		if (!st.isEmpty()) {
			System.out.println(st.pop());
		}
		*/
		while(!st.isEmpty()){ //���� �ִ� ���� ����.
			System.out.println(st.pop()); //pop�� ���ÿ��� �ƿ� ��Ҹ� ����.
		}
		
		
		
		System.out.println();
	}
}
