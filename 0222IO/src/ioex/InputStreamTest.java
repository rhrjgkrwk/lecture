package ioex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamTest {
	public static void main(String[] args) throws IOException{
		//INPUT STREAM : 바이트 단위 - 한글 깨짐.
		System.out.print("Input String:");
		char c='\0';
		while(c != '\n'){
			c=(char)System.in.read();
			System.out.print(c);
		}
		
		
/*		
		//INPUTSTREAMREADER : char 단위
		InputStreamReader inr = new InputStreamReader(System.in); //char 스트림
		System.out.print("입력 : ");
		char ch = '\0';
		while (ch != '\n') {
			ch = (char)inr.read();
			System.out.print(ch);
		}
		
		//BUFFERED READER : String단위
		
		InputStreamReader inr1 = new InputStreamReader(System.in); //char 스트림
		BufferedReader br = new BufferedReader(inr1); //reader을 인자로 받아서 버퍼를 제공해준다.
		System.out.print("입력 : ");
		String s = br.readLine(); //속도가 매우 빠른 편이다.
		System.out.println(s);
		
		
		br.close();
		inr.close();
		inr1.close();
		*/
	}
}
