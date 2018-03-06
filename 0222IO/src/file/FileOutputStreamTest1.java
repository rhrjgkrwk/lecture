package file;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;

public class FileOutputStreamTest1 {
	public static void main(String[] args) throws IOException {
		OutputStream out = new FileOutputStream("src/file/data2.txt");
		String name = "ȫ�浿";
		int age = 25;
		double score = 99.99;
		
		out.write(name.getBytes());
		out.write(Integer.toString(age).getBytes());
		out.write(Double.toString(score).getBytes());
		
		//��� ����Ʈ ��Ʈ�� - ���͸�
		PrintStream ob1 = new PrintStream(out);
		ob1.printf("\n\n�̸� : %s, ���� : %d, ���� : %f",name, age, score);
		
		//��� ĳ���ͽ�Ʈ�� Filtering
		PrintWriter ob2 = new PrintWriter(out);
		ob1.printf("\n\nname : %s, age : %d, score : %f",name, age, score);
		
		
		out.close();
	}
}
