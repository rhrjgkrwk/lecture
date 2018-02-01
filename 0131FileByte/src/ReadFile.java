import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
- Byte ����� File IO�� �غ���!
	- Read 
		- available()�� �̿��� ��Ʈ�����κ��� �о�� �� �ִ� ������ ũ�⸦ ��ȯ�޾�
		- �ʿ��� ��ƴ�� ����Ʈ �迭�� ��ƾ��Ѵ�.
		- read(byte[]) �о�ͼ� byte �迭�� �����ϰ�, ���̸� �����Ѵ�. 
		
	- Write
*/

///////////////////////////������ �о�ͺ���//////////////////////////////
public class ReadFile { 
	public static void main(String[] args) throws IOException{
		
		int n;
		FileInputStream fis = new FileInputStream(args[0]); //����� ���� ���� �Է¹޴´�.
		while ((n=fis.available())>0) { 
			//�о�� �� �ִ� ����Ʈ ���� 0����Ʈ �̻��̸�
			//available = ��Ʈ�����κ��� �о� �� �� �ִ� �������� ũ�⸦ ��ȯ.
			
			byte []b = new byte[n];
			int result = fis.read(b); 
			//read() - b ũ�⸸ŭ �а� �о�� ������ ���� ��ȯ.
			//�о�� �����Ͱ� ���� ��쿡 -1�� �����Ѵ�.
			
			//�� ����Ʈ�� �ҷ����°�!
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
///////////////////////////������ �Ẹ��//////////////////////////////
class WriteFile{
	public WriteFile(String args) throws IOException{
		// TODO Auto-generated constructor stub
		FileOutputStream fos = new FileOutputStream(args, true);
		System.out.println("���ڸ� �Է��غ���!");
		while (true) {
			int n = System.in.available();
			if (n>0) {
				byte []b = new byte[n];
				int result = System.in.read(b);
				if (result == -1) {
					break;
				}
				fos.write(b, 0, n);
				System.out.println("���������� ���� ���̾�.");
			}
		}
	}
}













