package ioex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamTest {
	public static void main(String[] args) throws IOException{
		//INPUT STREAM : ����Ʈ ���� - �ѱ� ����.
		System.out.print("Input String:");
		char c='\0';
		while(c != '\n'){
			c=(char)System.in.read();
			System.out.print(c);
		}
		
		
/*		
		//INPUTSTREAMREADER : char ����
		InputStreamReader inr = new InputStreamReader(System.in); //char ��Ʈ��
		System.out.print("�Է� : ");
		char ch = '\0';
		while (ch != '\n') {
			ch = (char)inr.read();
			System.out.print(ch);
		}
		
		//BUFFERED READER : String����
		
		InputStreamReader inr1 = new InputStreamReader(System.in); //char ��Ʈ��
		BufferedReader br = new BufferedReader(inr1); //reader�� ���ڷ� �޾Ƽ� ���۸� �������ش�.
		System.out.print("�Է� : ");
		String s = br.readLine(); //�ӵ��� �ſ� ���� ���̴�.
		System.out.println(s);
		
		
		br.close();
		inr.close();
		inr1.close();
		*/
	}
}
