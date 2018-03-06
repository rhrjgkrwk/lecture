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
		System.out.println("입력을 종료하시려면 ctrl+z를 하시오");
		do {
			User user = new User();
			System.out.print("이름을 입력하시오 : "); 
			user.setName(sc.next());
			System.out.print("나이 입력하시오 : "); 
			user.setAge(sc.nextInt());
			System.out.print("키 입력하시오 : "); 
			user.setTall(sc.nextDouble());
			oos.writeObject(user);
			System.out.println("계속 입력하려면 Enter키를 누르시오");	
		} while ((System.in.read()) != -1);
		sc.close();
		oos.close();
	}
}
