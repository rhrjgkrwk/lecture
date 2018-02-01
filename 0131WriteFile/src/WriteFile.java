import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
/*
Text writer : key입력 --> 파일로
	1. Open - 스케너 기능
*/

/*
	FileWriter + BufferedWriter + PrintWriter 를 사용해보자.
	- BufferedWriter 는 버퍼를 이용해서 입출력을 효율적으로..
	- PrintWriter 는 출력디자인을 효율적으로...
	- 원래 파일 쓰기를 하면 기존 파일에 저장되어있던 데이터를 다 날아가고 새로씀.
	- 안날아가게하고 뒤에 append하도록 돕는 클래스가 PrintWriter(생성시 flush를 true로 설정)
*/

public class WriteFile {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		//스캐너처럼 사용할 수 있다. 하지만 스캐너를 쓰는 것이 더 나음.
		
		//파일 저장
		FileWriter fw = new FileWriter("sample.txt", true); // true/false :  append의 기능을 함,
		BufferedWriter bw = new BufferedWriter(fw); 
		PrintWriter pw = new PrintWriter(bw, true); 
		
		System.out.println("저장할 데이터를 입력해보자!\n(exit = ctrl+z)");
		//ctrl + z 는 파일의 끝을 의미함
		
		String s = null;
		while ((s=br.readLine())!=null) {
			// br : 키보드에서
			pw.println(s);
			//pw : 파일에다 출력
		}
		br.close(); pw.close(); bw.close(); fw.close();
	}
}
