import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileIO {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		/*
		throws�� try/catch�� �Ȱ���. 
		��������..... 
		try/catch�� ��� : ���� ��ġ���� ���� ó��
		throws�� ��� : ���� ó���� �ٸ� ������ ������ ��.
		(main�� ��쿡�� main�� ȣ���� �ý��۷����� ���������� ��.)
		
		
		���� ����½� ����ó���� �ݵ�� ������Ѵ�.
		 * �����ڿ��� throws ó��
		 * 
		public FileReader(String fileName)
           throws FileNotFoundException 
		
		���� �ٿ� ���� �����ڿ��� throwsó���� �Ǿ��ִ�.
		*/
		
		FileReader fr = new FileReader("c:/aa.txt");
		
		/* 
		Multiple markers at this line
		- Unhandled exception type 
		 FileNotFoundException
		- Resource leak: 'fr' is never closed
		*/
		
	}
}
