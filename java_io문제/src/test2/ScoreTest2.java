package test2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ScoreTest2 {
	public static void main(String[] args) throws IOException {
		String from = "src/test2/source.txt";
		String to = "src/test2/desc.txt";
		File file = new File(from);
		BufferedReader br = new BufferedReader(new FileReader(new File(from)));
		PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(new File(to))));
		while (true) {
			String name = br.readLine();
			if (name==null) {
				break;
			}
			int sum = 0;
			for (int i = 0; i < 3; i++) {
				sum+=Integer.parseInt(br.readLine());
			}
			pw.println((String.format("�̸� : %s ���� : %d ��� : %.2f",name, sum, sum/3.0)));
		}
		br.close();
		pw.close();
	}
}

/*
[����2]

1. source.txt������ �о ������� desc.txt�� ����Ͻÿ�
2. ���ϸ� : ScoreTest2.java

test2/source.txt
�̼���
90
80
75
��ȣ��
76
45
88

test2/desc.txt
�̸� : ��ȣ��  ���� : 221  ��� : 73.7
�̸� : �̼���  ���� : 216  ��� : 72.0
�̸� : �̸���  ���� : 253  ��� : 84.3

*/




