import java.util.Scanner;

/*
0122 ����
���ڿ� 5���� �غ��� �� �⵵�� �Է¹޾�
�����̸� �������� ���, ����̸� ������������ ����Ѵ�. 
�޼ҵ� ������ �������
*/

public class Leapyear {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s[] = {"sajdkf","qwe","pippi","zddd","pippi2"};
			//{"str","str1","str2","str3","str"};
			//{ "lee", "chang", "hee", "boab", "zac" };
		
		System.out.print("�⵵�� �Է��غ��� : ");
		int year = Integer.parseInt(sc.nextLine());
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {// �����̸� ��������
			System.out.println("�����Դϴ�. ���ڿ��� ������������ ���ĵ˴ϴ�.");
			ascendingSort(s);
		} else { // ����̸� ��������
			System.out.println("����Դϴ�. ���ڿ��� ������������ ���ĵ˴ϴ�.");
			dscendingSort(s);
		}

		// ����� �غ���

		for (int i = 0; i < s.length; i++) {
			System.out.printf("%5s\t", s[i]);
		}
	}

	public static void ascendingSort(String s[]) {// �������� ������ �غ���.
		for (int i = 0; i < s.length - 1; i++) {
			
			for (int j = i + 1; j < s.length; j++) {
				int i1 = 0, j1 = 0; // string compare�� �غ���.
				boolean flag = true;
				while (flag) {
					if (i1 == s[i].length() - 1 || j1 == s[j].length() - 1) { 
						//��� �����̶� ������ �񱳸� ���� �� ����� ������ �ʾҴٸ�
						if (s[i].length() <= s[j].length()) { //�ƿ� ���ų� j�� �� ��� �׳� ���д�.
							flag = false;
						} else { //i�� �� ũ�� Swap
							String temp = s[i];
							s[i] = s[j];
							s[j] = temp;
							flag = false;
						}
					}

					if (s[i].charAt(i1) > s[j].charAt(j1)) { // s[i]�� ���ĺ� �� ����
																// �����̸� s[j]��
																// �ٲ���.
						String temp = s[i];
						s[i] = s[j];
						s[j] = temp;
						flag = false; // �� ����� ������ out
					} 
					else if (s[i].charAt(i1) == s[j].charAt(j1)) { // �ش� ���ڰ� ������ �������� ��
						if (i1 < s[i].length() - 1) {
							i1++;
						}
						if (j1 < s[j].length() - 1) {
							j1++;
						}
					} 
					else { // s[j]�� �չٺ��� �����Ƿ� �� �ΰ� while loop�� �������´�.
						flag = false;
					}

				}
			}
		}
	}

	public static void dscendingSort(String s[]) {// ����
		for (int i = 0; i < s.length - 1; i++) {
			for (int j = i + 1; j < s.length; j++) {
				boolean flag = true;
				int i1 = 0, j1 = 0; // string compare�� �غ���.
				while (flag) {					
					//��� �����̶� ������ �񱳸� ���� �� ����� ������ ������ 
					if (i1 == s[i].length() - 1 || j1 == s[j].length() - 1) {
						if (s[i].length() >= s[j].length()) { //i,j�� ���̰� ���ų� i�� �� �涧 �׳� ���д�.
							flag = false; 
						} else { // j�� �� ��� swap
							String temp = s[i];
							s[i] = s[j];
							s[j] = temp;
							flag = false; 
						}
					}

					if (s[i].charAt(i1) < s[j].charAt(j1)) { // s[i]�� ���ĺ� �� ����
																// �����̸� s[j]��
																// �ٲ���.
						String temp = s[i];
						s[i] = s[j];
						s[j] = temp;
						flag = false; // �� ����� ������ out
					} else if (s[i].charAt(i1) == s[j].charAt(j1)) { // �ش� ���ڰ�
																		// ������
																		// ����
																		// ���ڸ�
																		// ��.
						if (i1 < s[i].length() - 1) {
							i1++;
						}
						if (j1 < s[j].length() - 1) {
							j1++;
						}
					} else { // s[j]�� �չٺ��� �����Ƿ� �� �ΰ� while loop�� �������´�.
						flag = false;
					}

				}
			}
		}
	}

}
