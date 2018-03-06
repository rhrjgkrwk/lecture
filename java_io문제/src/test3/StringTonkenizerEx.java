package test3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class StringTonkenizerEx {
	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new FileReader(new File("src/test3/emp.txt")));
		String str = null;
		while ((str = br.readLine())!=null) {
			StringTokenizer token=new StringTokenizer(str,"\t");
			while (token.hasMoreTokens()) {
				System.out.println("�̸�  : "+token.nextToken()+"\t�μ�  : "+token.nextToken()+"\t�޿�  : "+token.nextToken());
			}
		}
		br.close();
	}
}
/*
[����3] ����Ÿ�� �Է¹޾� ���Ͽ� ����Ͻÿ�

1) ���� �Է¹޾� ���Ϸ� ����ϴ� ���α׷�
���ϸ� : EmpOutputTest.java
ó������ : ����Ÿ�� ���̿� \t�� �߰��Ͽ� �����Ͻÿ�
           ex) name+"\t"+dept+"\t"+salary+"\n"


�Է��� �����Ͻ÷��� ctrl+z�� �Ͻÿ�
�̸��� �Է��Ͻÿ� : ��ȣ��
�μ��� �Է��Ͻÿ� : ���ߺ�
�޿��� �Է��Ͻÿ� : 1500000
��� �Է��Ϸ��� EnterŰ�� �����ÿ�

�̸��� �Է��Ͻÿ� : �̼���
�μ��� �Է��Ͻÿ� : ������
�޿��� �Է��Ͻÿ� : 2500000
��� �Է��Ϸ��� EnterŰ�� �����ÿ�
ctrl+z

emp.txt������ ���� �Ǿ����ϴ�
--------------------------------------------------------
emp.txt����
��ȣ��    ���ߺ�    1500000
�̼���    ������    2500000

==========================================
2) emp.txt������ �о ����Ͻÿ�
���ϸ� : EmpInputTest.java
ó������ : StringTokenizer�� �̿��ؼ� ����Ÿ�� �Ľ��Ͽ� 
            �Ʒ��� ��������Ͻÿ�

[��°��]
�̸� : ��ȣ��   �μ� : ���ߺ�   �޿� 150000
�̸� : �̼���   �μ� : ������   �޿� 250000
*/