package string;

import java.util.StringTokenizer;

public class StringTokenizerEx {
	public static void main(String[] args) {
		String str = "학교,집,학원,,game,술집#도서관$아,#이";
		StringTokenizer st = new StringTokenizer(str, "#$,");
		//여러개의 구분자를 사용할 수 있다.
		System.out.println("파싱할 문자열 수 "+ st.countTokens());
		while (st.hasMoreTokens()) {
			String tmp = (String) st.nextElement();
			System.out.println(tmp);
		}
	}
}
