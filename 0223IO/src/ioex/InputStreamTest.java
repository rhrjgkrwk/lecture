package ioex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamTest {
	public static void main(String[] args) throws IOException 
	{
		/*System.out.print("Input String:");
		char ch='\0';
		while(ch != '\n'){
			ch=(char)System.in.read();  //����Ʈ��Ʈ��(inputStream), �ѱ۱���
			System.out.print(ch);
		}*/
		//-------------------------------------------------
/*		InputStreamReader in=new InputStreamReader(System.in);
		System.out.print("Input String:");
		char ch='\0';
		while(ch != '\n'){
			ch=(char)in.read();  //ĳ���ͽ�Ʈ��(InputStreamReader), �ѱ�O
			System.out.print(ch);
		}*/
		//------------------------------------------------------------
		InputStreamReader in=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(in);
		System.out.print("Input String:");
		String s=br.readLine();   // �ӵ��� ������
		System.out.print(s);
	}
}


