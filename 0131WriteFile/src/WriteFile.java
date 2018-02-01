import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
/*
Text writer : key�Է� --> ���Ϸ�
	1. Open - ���ɳ� ���
*/

/*
	FileWriter + BufferedWriter + PrintWriter �� ����غ���.
	- BufferedWriter �� ���۸� �̿��ؼ� ������� ȿ��������..
	- PrintWriter �� ��µ������� ȿ��������...
	- ���� ���� ���⸦ �ϸ� ���� ���Ͽ� ����Ǿ��ִ� �����͸� �� ���ư��� ���ξ�.
	- �ȳ��ư����ϰ� �ڿ� append�ϵ��� ���� Ŭ������ PrintWriter(������ flush�� true�� ����)
*/

public class WriteFile {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		//��ĳ��ó�� ����� �� �ִ�. ������ ��ĳ�ʸ� ���� ���� �� ����.
		
		//���� ����
		FileWriter fw = new FileWriter("sample.txt", true); // true/false :  append�� ����� ��,
		BufferedWriter bw = new BufferedWriter(fw); 
		PrintWriter pw = new PrintWriter(bw, true); 
		
		System.out.println("������ �����͸� �Է��غ���!\n(exit = ctrl+z)");
		//ctrl + z �� ������ ���� �ǹ���
		
		String s = null;
		while ((s=br.readLine())!=null) {
			// br : Ű���忡��
			pw.println(s);
			//pw : ���Ͽ��� ���
		}
		br.close(); pw.close(); bw.close(); fw.close();
	}
}
