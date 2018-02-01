import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
- Byte 기반의 File IO를 해보자!
	- Read 
		- available()를 이용해 스트림으로부터 읽어올 수 있는 데이터 크기를 반환받아
		- 필요한 만틈의 바이트 배열을 잡아야한다.
		- read(byte[]) 읽어와서 byte 배열에 저장하고, 길이를 리턴한다. 
		
	- Write
*/

///////////////////////////파일을 읽어와보자//////////////////////////////
public class ReadFile { 
	public static void main(String[] args) throws IOException{
		
		int n;
		FileInputStream fis = new FileInputStream(args[0]); //실행시 파일 명을 입력받는다.
		while ((n=fis.available())>0) { 
			//읽어올 수 있는 바이트 수가 0바이트 이상이면
			//available = 스트림으로부터 읽어 올 수 있는 데이터의 크기를 반환.
			
			byte []b = new byte[n];
			int result = fis.read(b); 
			//read() - b 크기만큼 읽고 읽어온 데이터 수를 반환.
			//읽어온 데이터가 없는 경우에 -1을 리턴한다.
			
			//몇 바이트를 불러오는가!
			System.out.println(result);
			if (result == -1) { 
				break;
			}
			String s = new String(b);
			System.out.println(s);
		}
		new WriteFile(args[0]);
	}
}	
///////////////////////////파일을 써보자//////////////////////////////
class WriteFile{
	public WriteFile(String args) throws IOException{
		// TODO Auto-generated constructor stub
		FileOutputStream fos = new FileOutputStream(args, true);
		System.out.println("글자를 입력해보자!");
		while (true) {
			int n = System.in.available();
			if (n>0) {
				byte []b = new byte[n];
				int result = System.in.read(b);
				if (result == -1) {
					break;
				}
				fos.write(b, 0, n);
				System.out.println("오해하지마 수록 중이야.");
			}
		}
	}
}













