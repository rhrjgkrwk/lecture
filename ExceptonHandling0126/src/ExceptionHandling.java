import java.util.InputMismatchException;
import java.util.Scanner;
/*
- 예외처리를 해보자!
	- 에러가 날 가능성이 있는 부분을 
	- try 보따리로 싸는 것 - 시도해보자 
	- catch 블럭은 에러가 났을때의 처리를 담은 부분.
	- finally 블럭은 무조건 해야할 부분을 적어놓은 것!
*/

public class ExceptionHandling {
	public static void main(String[] args) {
		try { // try 블럭을 시도해보고
			Scanner sc = new Scanner(System.in);
			System.out.println("숫자를 입력해보자.");
			int i = sc.nextInt();
			System.out.println("숫자를 입력해보자.");
			int j = sc.nextInt();
			int k = i / j;
			System.out.println();
			System.out.println(i + " / " + j + " = " + k);
			sc.close();
		} catch (Exception e) { // 에러가 발생하면 여기서 처리
			// TODO: handle exception
			System.out.println();
			System.out.println("에러 났다능..... 킁");
			e.printStackTrace();
			System.out.println(e.getMessage());
		} finally { 
			// 에러가 나던 말던 여긴 무조건 실행. 
			//보통 소멸자를 사용할때 finally를 이용한다. 
			//ex. 네트워크를 끊을 때
			System.out.println();
			System.out.println("굳----드");	
		}
	}
}
