package test4;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class UserOutputTest
{
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/test4/UserOutputTest.txt"));
		System.out.println("�Է��� �����Ͻ÷��� ctrl+z�� �Ͻÿ�");
		do {
			User user = new User();
			System.out.print("�̸��� �Է��Ͻÿ� : "); 
			user.setName(sc.next());
			System.out.print("���� �Է��Ͻÿ� : "); 
			user.setAge(sc.nextInt());
			System.out.print("Ű �Է��Ͻÿ� : "); 
			user.setTall(sc.nextDouble());
			oos.writeObject(user);
			System.out.println("��� �Է��Ϸ��� EnterŰ�� �����ÿ�");	
		} while ((System.in.read()) != -1);
		sc.close();
		oos.close();
	}
}
