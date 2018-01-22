import java.util.Random;

/*
 * ���������� 0122
1. �ζǸ� �������� ������ �� �� ������������ ��Ʈ���� ����Ͻÿ�. ��, ��Ʈ �κ��� �޼ҵ� 2��������ٰ�
2. ���� �ε� ����� 10�������� ����ϵ� �ߺ��� �����Ͽ� ����غ���.
*/


public class Lotto {
	public static void main(String[] args) {
		int arr[] = new int[6];
		Random r = new Random();
		
		for (int i = 0; i < arr.length; i++) {
			int rn = r.nextInt(45)+1; //random # ����
			for (int j = 0; j <= i; j++) { //�̹� ���Դ� ������ chk'
				if (arr[j]!=rn) { //������ �ȳ��Դ� ���� 
					arr[i] = rn; //�迭�� ��´�.
				}
			}
		}
		//���� ��
		System.out.println("���� ��");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+"\t");
		}
		System.out.println();
		
		SelectionSort(arr); // ������ �غ���.
		//���� ��
		System.out.println("���� ��");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+"\t");
		}
		System.out.println();
		
		
	}
	public static void SelectionSort(int arr[]) {
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
}
