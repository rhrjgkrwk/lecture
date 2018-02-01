import java.util.InputMismatchException;
import java.util.Scanner;
/*
File I/O 하기 전에 예외처리를 좀 더 다루어보자.
*/

public class ExceptionClass1 {
	public static void main(String[] args) {
		try { // try 블럭을 시도해보고
			Scanner sc = new Scanner(System.in);
			System.out.println("숫자를 입력해보자.");
			int i = Integer.parseInt(sc.nextLine());
			System.out.println("숫자를 입력해보자.");
			int j = Integer.parseInt(sc.nextLine());
			if (j==0) {
				System.out.println("0으로 나눌 수 없다고 전해라~~");
				throw new ArithmeticException("오이잉!"); //던져라 
			}
			int k = i / j;
			System.out.println();
			System.out.println(i + " / " + j + " = " + k);
			sc.close();
			
			/*} catch (InputMismatchException e1) {
			System.out.println("숫자로 입력하세요.");
		} catch (NumberFormatException e1) {
			System.out.println("숫자로 입력하세요.1");
		} catch (ArithmeticException e2) {
			System.out.println("분모에 0 넣지 마세여");
		} catch (Exception e) { // 에러가 발생하면 여기서 처리
			// TODO: handle exception
			System.out.println();
			System.out.println("에러 났다능..... ");
			e.printStackTrace();
			System.out.println(e.getMessage());*/
		} finally {
			// 에러가 나던 말던 여긴 무조건 실행.
			// 보통 소멸자를 사용할때 finally를 이용한다.
			// ex. 네트워크를 끊을 때
			System.out.println();
			System.out.println("굳----드");
		}
	}
}
