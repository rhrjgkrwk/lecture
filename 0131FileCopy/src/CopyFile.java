import java.io.*;
/*
Text File ���纻�� ������!
*/
public class CopyFile {
	public static void main(String[] args) throws IOException, InterruptedException {
		/*
		FileReader fr = new FileReader("c:/sample.txt");
		BufferedReader br = new BufferedReader(fr);

		FileWriter fw = new FileWriter("c:/sample(���纻).txt", false); //append���� ���� ������ ���Ѵ�. �⺻ ���� false
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter pw = new PrintWriter(bw, true); 
		
		�̰� �� �ٿ��� �Ẹ��.
		*/
		
		//Reader
		BufferedReader br = new BufferedReader(new FileReader("c:/sample.txt"));
		//Writer
		PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("c:/sample(���纻).txt", false)), true);
		//�̷��� �� �� pw.close()�ϸ� BufferedWriter�� FileWriter�� ���� closing �Ǵ� �ǰ�.
		
		
		String s = new String();
		System.out.print("������");
		while ((s = br.readLine()) != null) {
			pw.println(s);
			Thread.sleep(100);
			System.out.print(".");
		}
		
		br.close(); pw.close();
	}
}

/*
	- Reader/Writer�� Ȱ���� ���� �Է� ����
		- Reader
			1. FileReader(file path)
			2. BufferedReader(fr)
				= BufferedReader(new FileReader(file path))
			3. while ((String s = br.readline) != null)
			4. close all
		- Writer
			1. FileWriter(file path, T/F) T/F�� append or new
			2. BufferedWriter(fw) 
			3. PrintWriter(br, T/F)
			4. pw.println(str);
			5. close all
			*/
			