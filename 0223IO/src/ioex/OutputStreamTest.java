package ioex;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class OutputStreamTest {
	public static void main(String[] args) throws IOException {
		OutputStreamWriter out=new OutputStreamWriter(System.out);
		BufferedWriter bw=new BufferedWriter(out);
		bw.write("Java IO test...");
		bw.flush();           // 버퍼비우기
		
		bw.close();
		out.close();
	}
}






