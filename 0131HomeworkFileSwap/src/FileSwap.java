import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/*
 두 파일의 내용을 서로 교체해보자.
*/
public class FileSwap {
	public static void main(String[] args) throws IOException{
		//a --> temp
		BufferedReader br = new BufferedReader(new FileReader("a.txt"));
		PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("temp.txt")));
		String s;
		while ((s=br.readLine())!=null) {
			pw.println(s);
		}
		br.close();
		pw.close();
		
		//b --> a
		br = new BufferedReader(new FileReader("b.txt"));
		pw = new PrintWriter(new BufferedWriter(new FileWriter("a.txt")));
		
		while ((s=br.readLine())!=null) {
			pw.println(s);
		}
		br.close();
		pw.close();
		
		
		//temp --> b
		br = new BufferedReader(new FileReader("temp.txt"));
		pw = new PrintWriter(new BufferedWriter(new FileWriter("b.txt")));
		
		while ((s=br.readLine())!=null) {
			pw.println(s);
		}
		
		br.close();
		pw.close();
		
		FileWriter fw1 = new FileWriter("temp.txt");
		fw1.close();
		
	}
}
