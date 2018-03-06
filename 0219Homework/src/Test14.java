import java.util.StringTokenizer;

public class Test14 {
	public static void main(String[] args) {
		String str = "10*30*20*40*50";
		StringTokenizer st = new StringTokenizer(str, "*");
		int sum = 0;
		while (st.hasMoreTokens()) {
			int temp = Integer.parseInt(st.nextToken());
			System.out.print(temp);
			sum+=temp;
			if (st.hasMoreElements()) {
				System.out.print("+");
			}
		}
		System.out.println("="+sum);
	}
}


/*
------------------------------------------------------------------------------
[문제14] 문자열변수에 "10*30*20*40*50"를 대입한후 StringTokenizer클래스를 
         이용하여 다음결과를구하시오
         String str="10*30*20*40*50";   Integer.parseInt()사용

[출력화면]
10+30+20+40+50 = 150
*/
