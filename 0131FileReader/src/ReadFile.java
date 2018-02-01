import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
���ڱ�� ��Ʈ���� �̿��Ͽ� ���� ������� �غ���.
���� ������� open --> read/write --> close
\(��������) �Է½� \\�� ����Ѵ�.
*/


/*
������Ʈ�� BufferedReader�� ����غ���.
	- �Ϲ� ��Ʈ������ �����͸� �о�ö� �ϳ��� �о���� �������� ����
	- ���۸� �ΰ� ����� �ҷ��� �� �ֵ��� ��.(�ӽ� �߰����� ����)
	- ���۸� �̿��ϱ� ������ ���δ����� ���� �� ����.
	- FileReader�� ���ڷ� ����
*/





public class ReadFile {
														//try/catch ��� ����ó���� �ý��۷� �������ȴ�.
	public static void main(String[] args) throws IOException {

		FileReader fr = new FileReader("C:\\sample.txt");
		
		/*
		���ڱ�� ��Ʈ������ read�� �� ����
		int data;
		while ((data = fr.read())!=-1) {//�� ���� �� ���ھ� �о�;��Ѵ�.
			System.out.print((char)data);
		}
		*/
				
		BufferedReader br = new BufferedReader(fr); //fileReader�� ���ڷ� �޴´�.
		String s = null;
		while ((s=br.readLine()) != null) { //���۸� �̿��Ͽ� ���� ������ �о�� �� �ִ�.��
			//�� �� ������ ���� �� : null
			//�� ���� ������ ���� �� : -1, eof(���������� -1 ��)
			System.out.println(s);
		}
		
		//���� ���� ��������
		br.close();
		fr.close();	
		
		
	}
}
