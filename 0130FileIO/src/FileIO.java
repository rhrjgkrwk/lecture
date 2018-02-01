import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileIO {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		/*
		throws가 try/catch와 똑같다. 
		차이점은..... 
		try/catch의 경우 : 현재 위치에서 예외 처리
		throws의 경우 : 예외 처리를 다른 곳으로 던지는 것.
		(main의 경우에는 main을 호출한 시스템레벨로 던져버리는 것.)
		
		
		파일 입출력시 예외처리를 반드시 해줘야한다.
		 * 생성자에서 throws 처리
		 * 
		public FileReader(String fileName)
           throws FileNotFoundException 
		
		보는 바와 같이 생성자에서 throws처리가 되어있다.
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
