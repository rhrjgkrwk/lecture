import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
문자기반 스트림을 이용하여 파일 입출력을 해보자.
파일 입출력은 open --> read/write --> close
\(역슬래시) 입력시 \\로 써야한다.
*/


/*
보조스트림 BufferedReader를 사용해보자.
	- 일반 스트림으로 데이터를 읽어올때 하나씩 읽어오는 불편함을 보조
	- 버퍼를 두고 덩어리로 불러올 수 있도록 함.(임시 중간방의 역할)
	- 버퍼를 이용하기 때문에 라인단위로 읽을 수 있음.
	- FileReader를 인자로 받음
*/





public class ReadFile {
														//try/catch 대신 에러처리를 시스템로 던져버렸다.
	public static void main(String[] args) throws IOException {

		FileReader fr = new FileReader("C:\\sample.txt");
		
		/*
		문자기반 스트림으로 read를 할 때에
		int data;
		while ((data = fr.read())!=-1) {//한 글자 한 글자씩 읽어와야한다.
			System.out.print((char)data);
		}
		*/
				
		BufferedReader br = new BufferedReader(fr); //fileReader를 인자로 받는다.
		String s = null;
		while ((s=br.readLine()) != null) { //버퍼를 이용하여 라인 단위로 읽어올 숭 있다.ㅇ
			//한 줄 단위일 때의 끝 : null
			//한 글자 단위일 때의 끝 : -1, eof(내부적으로 -1 임)
			System.out.println(s);
		}
		
		//닫을 때는 역순으로
		br.close();
		fr.close();	
		
		
	}
}
