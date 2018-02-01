import java.io.*;
/*
Text File 복사본을 만들어보자!
*/
public class CopyFile {
	public static void main(String[] args) throws IOException, InterruptedException {
		/*
		FileReader fr = new FileReader("c:/sample.txt");
		BufferedReader br = new BufferedReader(fr);

		FileWriter fw = new FileWriter("c:/sample(복사본).txt", false); //append할지 새로 쓸지를 정한다. 기본 값은 false
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter pw = new PrintWriter(bw, true); 
		
		이걸 좀 줄여서 써보자.
		*/
		
		//Reader
		BufferedReader br = new BufferedReader(new FileReader("c:/sample.txt"));
		//Writer
		PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("c:/sample(복사본).txt", false)), true);
		//이렇게 할 때 pw.close()하면 BufferedWriter와 FileWriter도 같이 closing 되는 건가.
		
		
		String s = new String();
		System.out.print("복사중");
		while ((s = br.readLine()) != null) {
			pw.println(s);
			Thread.sleep(100);
			System.out.print(".");
		}
		
		br.close(); pw.close();
	}
}

/*
	- Reader/Writer를 활용한 파일 입력 순서
		- Reader
			1. FileReader(file path)
			2. BufferedReader(fr)
				= BufferedReader(new FileReader(file path))
			3. while ((String s = br.readline) != null)
			4. close all
		- Writer
			1. FileWriter(file path, T/F) T/F는 append or new
			2. BufferedWriter(fw) 
			3. PrintWriter(br, T/F)
			4. pw.println(str);
			5. close all
			*/
			