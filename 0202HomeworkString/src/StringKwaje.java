import java.util.StringTokenizer;

/*문제1
아래와 같은 문자열을 인자로 보내면 다음처럼 출력하도록 하시오(3번 호출)
단 메소드 2,3 형식 사용 문자열길이는 모름 숫자도 몇개인지 모름
맨마지막 숫자를 ++하자
USER-00007    --->>      USER-00008

입력예제
USER-00007
ORDER-00008
PRODUCT-00003


*/

public class StringKwaje {
	public static void main(String[] args) {
		String[] str = { "USER-00001", "ORDER-00008", "PRODUCT-0009" };
		for (int j = 0; j < str.length; j++) {
			System.out.println(kwaje(str[j]));
			System.out.println(kaja(str[j]));
		}

	}

	static public String kwaje(String str) {
		String[] tokens = str.split("-");
		String temp = String.valueOf(Integer.parseInt(tokens[1]) + 1);
		int numlen = tokens[1].length();
		int num0 = temp.length();
		for (int i = 0; i < numlen - num0; i++) {
			temp = "0" + temp;
		}
		return tokens[0] + "-" + temp;
	}

	public static String kaja(String id) {
		// 구현하시오
		String str1 = // (9,10)
				id.substring(id.length() - 1, id.length());// 7
		int v1 = Integer.parseInt(str1);
		String str2 = Integer.toString(v1 + 1);// 7+1=>"8"
		String str3 = id.substring(0, id.length() - 1);
		// USER-0000
		return str3 + str2; // "USER-0000" + "8"
	}

}
