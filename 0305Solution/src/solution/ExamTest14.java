package solution;

import java.util.Arrays;

/* [����14]
����ó�����α׷��� �ۼ��Ͻÿ�

==================================================
��ȣ    �̸�      ����    ����    ����    ����    ���    ����    �����    ����
----------------------------------------------------------------------------------
   1      ���޷�     90       95       100
   2      ������     75       55        65
   3      �ε鷡     100     100       100
----------------------------------------------------------------------------------

ó������
����1) ����
     String []name ={"���޷�","������","�ε鷡"};
     int [][]score = {{90,95,100,0},{75,55,65,0},{100,100,100,0}};
     double []avg = {0.0, 0.0, 0.0};
     char []grade = new char[3];
     String []pass = new String[3];
     int []rank ={1,1,1};

����2) ���� = ���� + ���� + ����
       ��� = ����/3;
       ���� = 90�̻� 'A' / 80�̻� 'B' / 70�̻� 'C' / 60�̻� 'D' / �������� 'F'
               (if ~ else if�� �̿�)
       ����� = 60�̻��̸� "pass"  60�̸��̸� "fail"
               (if~else��)
       �������ϱ�    

 */
public class ExamTest14 {
	public static void main(String[] args) {
		String []name ={"���޷�","������","�ε鷡"};
	     int [][]score = {{90,95,100,0},{75,55,65,0},{100,100,100,0}};
	     double []avg = {0.0, 0.0, 0.0};
	     char []grade = new char[3];
	     String []pass = new String[3];
	     int []rank ={1,1,1};
	
		for (int i = 0; i < name.length; i++) {
			int tot = 0;
			//tot, avg
			for (int j = 0; j < score[i].length; j++) {
				if (j<3) {
					tot += score[i][j];
				}
				else if(j==3){
					score[i][j] = tot;
					avg[i] = tot/3.0;
				}
			}
			//grade & pass/fail
			if (avg[i] >= 60) {
				if (avg[i] >= 90) grade[i] = 'A';
				else if (avg[i] >= 80) grade[i] = 'B';
				else if (avg[i] >= 70) grade[i] = 'C';
				else grade[i] = 'D';
				pass[i] = "pass";
			}
			else {
				grade[i] = 'F';
				pass[i] = "fail";
			}
		}
		//����
		double []tmp = avg.clone();
		Arrays.sort(tmp);
		for (int i = 0; i < avg.length; i++) {
			for (int j = 0; j < tmp.length; j++) {
				if (avg[i]==tmp[j]) {
					rank[i] = j+1;
				}
			}
		}
		System.out.println("==================================================");
		System.out.println("��ȣ    �̸�      ����    ����    ����    ����    ���    ����    �����    ����");
		System.out.println("----------------------------------------------------------------------------------");
		for (int i = 0; i < tmp.length; i++) {
			System.out.print((i+1)+"\t"+name[i]+"\t");
			for (int j = 0; j < score[i].length; j++) {
				System.out.print(score[i][j]+"\t");
			}
			System.out.println(avg[i]+"\t"+grade[i]+"\t"+pass[i]+"\t"+rank[i]);
		}
		System.out.println("----------------------------------------------------------------------------------");
	}
}
