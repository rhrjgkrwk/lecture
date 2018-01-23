import java.util.Random;

/*
 * ���������� 0122
1. �ζǸ� �������� ������ �� �� ������������ ��Ʈ���� ����Ͻÿ�. ��, ��Ʈ �κ��� �޼ҵ� 2��������ٰ�
2. ���� �ε� ����� 10�������� ����ϵ� �ߺ��� �����Ͽ� ����غ���.
*/

public class LottoTen {
	public static void main(String[] args) {
		int arr[] = new int[6];
		Random r = new Random();
		System.out.println("<���� �ζ� �����>");
		for (int t = 0; t < 10; t++) { // �ζǸ� 10�� �����غ���.
			System.out.printf("%-3d��° �ζ� : ", t + 1);
			for (int i = 0; i < arr.length; i++) {
				while (true) {
					int rn = r.nextInt(45) + 1; // random # ����
					boolean chk = false; // �ߺ��� �ִ��� chk 
					
					for (int j = 0; j < i; j++) { // �����ϰ� �ߺ��� ������ ���� �ݺ�
						if (rn == arr[j]) {
							chk = true; //�ߺ��� ������ true
							break;
						}
					}
					if (chk==false) { // �ߺ��� ������ rn�� arr[i]�� ����
						arr[i] = rn;
						break;
					}
				}
			}
			SelectionSort(arr); // ������ �غ���.
			for (int i = 0; i < arr.length; i++)
				System.out.print(arr[i] + "\t"); // ��� ������ �ζǸ� ����غ���.
			System.out.println();
		}
	}

	public static void SelectionSort(int arr[]) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
}
