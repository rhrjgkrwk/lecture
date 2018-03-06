package test4;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Scanner;

public class UserInputTest
{
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Scanner sc = new Scanner(System.in);
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src/test4/UserOutputTest.txt"));
		
		boolean check=true;
		while (check) {
		   try{
		       System.out.println((User)ois.readObject());
		   } catch(EOFException e){
		       check=false;
		   }
		}
		sc.close();
		ois.close();
	}
}
