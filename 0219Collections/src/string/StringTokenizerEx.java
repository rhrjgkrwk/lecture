package string;

import java.util.StringTokenizer;

public class StringTokenizerEx {
	public static void main(String[] args) {
		String str = "�б�,��,�п�,,game,����#������$��,#��";
		StringTokenizer st = new StringTokenizer(str, "#$,");
		//�������� �����ڸ� ����� �� �ִ�.
		System.out.println("�Ľ��� ���ڿ� �� "+ st.countTokens());
		while (st.hasMoreTokens()) {
			String tmp = (String) st.nextElement();
			System.out.println(tmp);
		}
	}
}
