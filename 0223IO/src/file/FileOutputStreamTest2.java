package file;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest2 {
	public static void main(String[] args) throws IOException {
		FileOutputStream out=new FileOutputStream("src/file/data2.txt");
		int value;
		
		System.out.println("���ڿ��� �Է��ϰ� ������ �ٿ��� CTRL+Z�� ���� �ϼ���");
		while((value=System.in.read()) != -1)
		{
			out.write(value);
		}
		System.out.println("data2.txt�� ���� �Ǿ����ϴ�");
		
		out.flush(); //���� ����
		out.close();
	}
}
