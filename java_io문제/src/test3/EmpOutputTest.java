package test3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/* BufferedReader(new InputStreamReader(System.in)    //ǥ���Է�
 * BufferedWriter(new FileWriter(new File("���ϸ�")))   //������� 
 */

public class EmpOutputTest {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(new File("src/test3/emp.txt"))));
		System.out.println("�Է��� �����Ͻ÷��� ctrl+z�� �Ͻÿ�");
		do {
			System.out.print("�̸��� �Է��Ͻÿ� : "); 
			String name = sc.next();
			System.out.print("�μ��� �Է��Ͻÿ� : "); 
			String dept = sc.next();
			System.out.print("�޿��� �Է��Ͻÿ� : "); 
			int salary = sc.nextInt();
			pw.println(name+"\t"+dept+"\t"+salary);
			System.out.println("��� �Է��Ϸ��� EnterŰ�� �����ÿ�");	
		} while ((System.in.read()) != -1);
		sc.close();
		pw.close();
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















