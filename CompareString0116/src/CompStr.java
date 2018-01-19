
public class CompStr {
	public static void main(String[] args) {
		/*
		 * 1. 문자 크기 비교 : char 형은 primitive type으로 비교 가능.
		 	A. B 크기 비교하기.
		   65 66	
		 */
		
		char a = 'a';
		char b = 'b';
		System.out.println((a>b) ? "a가 더 크다" : "b가 더 크다.");
				
		
		/*
		 * 2. 문자열 비교 : 객체이기 때문에 equals로 비교해야함. 그냥 하면 주소를 비교하는 것. 
		 */
		
		String c = "TOM";
		String d = "TOMMY";
		System.out.println(c.compareTo(d)); 
		//this.charAt(k)-anotherString.charAt(k) 음수면 뒤에 것이 더 크고, 양수면 앞의것. 0이면 같음. 
		//The result is zero if the strings are equal; compareTo returns 0 exactly when the equals(Object) method would return true.
		System.out.println(c.equals(d));
		
		
		
	}
}
