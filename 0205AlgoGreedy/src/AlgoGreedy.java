/*
���ι���
1,5,10,50,100,500���� ���� c1,c5,c10,c50...�� �ִ�.
������ ���� ���� �������� a���� �����Ϸ��� �� ���� ������ �־���
���� ����� ���� ���� ���
�׸��� ������� ������¿��� �ּ��� ������ �ݺ��ؼ� �ذ��غ���.
*/
public class AlgoGreedy {
	public static void main(String[] args) {
		int c[] = { 3, 2, 1, 3, 0, 2 }; // ������� 1�� 5�� 10�� 50�� 100�� 500��
		int usedC[] = new int[6];
		int change = 620; // 620���� �Ž������� �Ž�������.
		boolean done = false;
		while (done == false) {
			if (change / 500 > 0 && c[5] > 0) {
				while (change / 500 > 0 && c[5] > 0) {
					usedC[5]++;
					c[5]--;
					change = change - 500;
				}
			} else if (change / 100 > 0 && c[4] > 0) {
				while (change / 100 > 0 && c[4] > 0) {
					usedC[4]++;
					c[4]--;
					change = change - 100;
				}
			} else if (change / 50 > 0 && c[3] > 0) {
				while (change / 50 > 0 && c[3] > 0) {
					usedC[3]++;
					c[3]--;
					change = change - 50;
				}
			} else if (change / 10 > 0 && c[2] > 0) {
				while (change / 10 > 0 && c[2] > 0) {
					usedC[2]++;
					c[2]--;
					change = change - 10;
				}
			} else if (change / 5 > 0 && c[1] > 0) {
				while (change / 5 > 0 && c[1] > 0) {
					usedC[1]++;
					c[1]--;
					change = change - 5;
				}
			} else if (change / 1 > 0 && c[0] > 0) {
				while (change > 0 && c[0] > 0) {
					c[0]--;
					usedC[0]++;
					change--;
				}
				done = true;
			}

			if (change == 0) {
				done = true;
			}

		}
		if ((change > 0)) {
			System.out.println("�ܵ��� ���׿�..");
		} else {
			System.out.println("1�� 5�� 10�� 50�� 100�� 500��");
			for (int i = 0; i < usedC.length; i++) {
				System.out.print(usedC[i] + " ");
			}
		}
	}
}
