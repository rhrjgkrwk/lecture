package exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Checked Exception

//throws�� �ڽ��� �θ� �޼ҵ忡�� ���ܸ� �佺�ϴ� ��.
//�Ѱ� ���� �ʿ����� ������ �ڵ��ؾ��ϱ� ������
//���� try/catch�� �ڽ��� ó���ϴ� ��찡 ����.
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
			System.out.print("���ڿ� �Է� : ");
			str = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return str;
	}

	public static void output(String str) {
		System.out.println("��� �غ��� : "+str);
	}
}
