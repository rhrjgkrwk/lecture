
public class StringArray {
	public static void main(String[] args) {
		
		//String 배열을 선언하고 초기화 해보자.
		
		String str[] = new String[3];
		str[0] = "babo";
		str[1] = "ondal";
		str[2] = "changja";
		String str1[] = {"a","b","c"}; 
		
		//String과 char 배열 (char[] --> String / String --> char[])
		
			String str2 = "babo";
			char[] c = new char[3];
			c[0] = 'a';
			c[1] = 'b';
			c[2] = 'c';
			
			//1. String --> Char[] : toCharArray() 함수 이용
			String str3 = "baaabo";
			char[] c1 = str3.toCharArray();
			c1[2] = 't'; //char[]로 바꾸면 하나씩 추출/수정이 가능하다.
			for (int i = 0; i < c1.length; i++) {
				System.out.print(c1[i]);
			}
			
			//2. char[] --> String : toString()
			String str4 = new String(c1);
			//String str5 = c.toString(); //error
			System.out.println(str4);
			//System.out.println(str5);
	}
}
