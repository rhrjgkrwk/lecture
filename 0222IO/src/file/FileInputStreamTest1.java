package file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileInputStreamTest1 {
	public static void main(String[] args) throws IOException, InterruptedException {
		InputStreamReader is=new FileReader("src/file/data1.txt");
		BufferedReader br=new BufferedReader(is);
		
		String str;
		while((str=br.readLine()) != null) //read line by line	
		{
			System.out.println(str);
			Thread.sleep(100);
		}
		br.close();
		is.close();
		
		//--------------------------------------------------------------------------
		/*InputStreamReader is= new FileReader("src/file/data1.txt");
		
		int readData;
		while(true){
			readData=is.read();    //byte�� �д´�, �ѱ� �� ����
			if(readData == -1)     // -1 : ����Ÿ�� ��
				break;   
			System.out.print((char)readData);
			Thread.sleep(100);
		}
		is.close();*/
		//-------------------------------------------------------------------------
		/*InputStream is=new FileInputStream("src/file/data1.txt");
		
		int readData;
		while(true){
			readData=is.read();    //byte�� �д´�, �ѱ۱���
			if(readData == -1)     // -1 : ����Ÿ�� �� eof
				break;   
			System.out.print((char)readData);
			Thread.sleep(100);
		}
		is.close();*/
	}
}
