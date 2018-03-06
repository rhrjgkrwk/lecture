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
			ch=(char)System.in.read();  //바이트스트림(inputStream), 한글깨짐
			System.out.print(ch);
		}*/
		//-------------------------------------------------
/*		InputStreamReader in=new InputStreamReader(System.in);
		System.out.print("Input String:");
		char ch='\0';
		while(ch != '\n'){
			ch=(char)in.read();  //캐릭터스트림(InputStreamReader), 한글O
			System.out.print(ch);
		}*/
		//------------------------------------------------------------
		InputStreamReader in=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(in);
		System.out.print("Input String:");
		String s=br.readLine();   // 속도가 빠르다
		System.out.print(s);
	}
}


