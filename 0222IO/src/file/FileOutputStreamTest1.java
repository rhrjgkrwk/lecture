package file;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;

public class FileOutputStreamTest1 {
	public static void main(String[] args) throws IOException {
		OutputStream out = new FileOutputStream("src/file/data2.txt");
		String name = "홍길동";
		int age = 25;
		double score = 99.99;
		
		out.write(name.getBytes());
		out.write(Integer.toString(age).getBytes());
		out.write(Double.toString(score).getBytes());
		
		//출력 바이트 스트림 - 필터링
		PrintStream ob1 = new PrintStream(out);
		ob1.printf("\n\n이름 : %s, 나이 : %d, 성적 : %f",name, age, score);
		
		//출력 캐릭터스트림 Filtering
		PrintWriter ob2 = new PrintWriter(out);
		ob1.printf("\n\nname : %s, age : %d, score : %f",name, age, score);
		
		
		out.close();
	}
}
