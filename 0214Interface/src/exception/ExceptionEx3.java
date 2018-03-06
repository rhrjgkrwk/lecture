package exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Checked Exception

//throws는 자신을 부른 메소드에게 예외를 토스하는 것.
//넘겨 받은 쪽에서는 무조건 핸들해야하기 때문에
//보통 try/catch로 자신이 처리하는 경우가 많다.
public class ExceptionEx3 {
	public ExceptionEx3() {
		input();
	}
	public static void main(String[] args) {
		output(input());
	}

	public static String input() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = null;
		try {
			System.out.print("문자열 입력 : ");
			str = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return str;
	}

	public static void output(String str) {
		System.out.println("출력 해보자 : "+str);
	}
}
