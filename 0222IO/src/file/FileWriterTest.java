package file;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/* [���]
 * 
 * ������ : ��Ʈ(root)�� �������� ������ ã�´�
 * 
 * ����� : ������ġ�� �������� ã�´�
 *            ./   ==> ������ġ(��������)
 *            ../  ==> ����(�Ѵܰ�����)
 *            /    ==> ��Ʈ(�ֻ���:root)
 */
public class FileWriterTest {

	public static void main(String[] args) throws IOException {
		//FileWriter writer=new FileWriter("D:/IT_2015/1.JAVA/javawork/day16_IO/storage/data3.txt");
		File file=new File("storage/data3.txt");
		Writer writer=new FileWriter(file);
		
		StringBuilder str=new StringBuilder();
		//StringBuilder�� �߰��� �޸𸮸� ���� �Ҵ��ϴ� ���� �ƴ϶� �߰����� 
		str.append("���ع��� ��λ��� ������ �⵵��\n");
		str.append("�ϴ����� �����ϻ� �츮���� ����\n");
		str.append("����ȭ ��õ�� ȭ������\n");
		str.append("���ѻ�� �������� ���� �����ϼ�......\n");
		
		writer.write(str.toString());
		writer.close();
		System.out.println("data3.txt�� ���� �Ǿ����ϴ�");
	}

}















