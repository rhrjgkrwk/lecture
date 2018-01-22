import java.io.StreamCorruptedException;
import java.util.Random;

//�迭�� ����� ����. 
/* ���⼭ �ٷ�� �迭��...
 * �������� �迭 : �÷ȴ� �ٿ��� �� �� ����.
 * one data type array : �Ѱ��� �ڷ����� ���� �ִ� �迭�̴�.
 * */
public class Array0122 {
	public static void main(String[] args) {
		// int arr[];
		// arr = new int[5];

		int arr[] = new int[5];
		int[] arr1 = new int[5]; // C#�� �̷��� �����.
		// []�� ������ �տ� �־ �ȴ�.

		arr[0] = 2;
		// arr[15]=3; //out of range�� ����� ������ üũ�ȴ�.

		double[] dd = new double[5];
		dd[0] = 12.214;
		dd[1] = 21.215;
		dd[2] = 12.21;
		dd[3] = 12.21;
		dd[4] = 12.21;
		System.out.println(dd[0] + " " + dd[1]);

		// for���� ����ؼ� �迭�� �ٷﺸ��!!
		for (int i = 0; i < dd.length; i++) { // �迭�� ���̸� �ƴ� �Ӽ� - length�� �̿��ϸ� �迭
												// for���� ���� ����
			System.out.println(dd[i]);
		}
		System.out.println();

		// �迭�� �̿��Ͽ� ���� ������ ����� ���ϴ� ���α׷��� ������.
		// �ڹ�, sql, jsp ������ �ִ�.

		int javaJum = 31;
		int sqlJum = 100;
		int jspJum = 87;

		System.out.printf("���� : %5d ��� : %5.2f", javaJum + sqlJum + jspJum, (javaJum + sqlJum + jspJum) / 3.0);
		System.out.println();
		// ���� �ڵ带 �迭�� �̿��ؼ� ���� �ٲ㺸��.

		int jum[] = new int[5];
		Random r = new Random();
		for (int i = 0; i < jum.length; i++) {
			jum[i] = r.nextInt(100) + 1;
			System.out.print(jum[i] + " ");
		}
		System.out.println("\n");
		int sum = 0;
		for (int i = 0; i < jum.length; i++) {
			sum += jum[i];
		}
		System.out.printf("���� : %d ��� : %.2f", sum, sum / (double) jum.length);
		System.out.println("\n");

		// for�� array�� ����Ͽ� �ζ� ��ȣ�� ���� �����غ���.
		System.out.println("Lotto ��ȣ ����");
		int lotto[] = new int[6];
		lotto(lotto);
		for (int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}

		String str[] = new String[2];
		str[1] = "DSAFADSFAD";

		// �迭�� �ʱ�ȭ �غ���!

		int arr2[] = { 12, 13, 14, 151, 6 };
		int arr3[] = new int[] { 12, 13, 14, 151, 6, 77 };

		// a�� c�� �¹ٲپ� ����. zigzag : ��ȣȭ�Ҷ� ���� ���� ����̶�� �Ѵ�.(�ڸ� �ٲٱ�)
		System.out.println();
		char c[] = { 'a', 'b', 'c' };
		for (int i = 0; i < c.length; i++) { // ��
			System.out.print(c[i] + "\t");
		}

		char temp = c[0];
		c[0] = c[2];
		c[2] = temp;

		System.out.println();
		for (int i = 0; i < c.length; i++) { // ��
			System.out.print(c[i] + "\t");
		}

		// �迭�� �����غ��� ah --> ah1
		// ���� ��Ƽ� �ű�� �ȴ�.
		// �����ذ� �迭�� ũ��� �����Ϸ��� �迭���ٴ� Ŀ�ߵ�.

		int ah[] = { 30, 70 };
		int ah1[] = new int[5];
		ah1 = ah;
		// ���ø޸��� �ּҰ��� �̵���.
		System.out.println(ah1[0]);
		System.out.println(ah1[1]);

		// �迭�� sorting�� �غ���.
		//���� ���� : memory sort - �޸� ���ο���
			/*- raddix sort : 10���� 20���� 30���� �з� �� �������� 1�� �ڸ� ����.
			- bubble sort : �յ� ��� �ٲ�.
			- insertion : ��������
			- shell : 
			- selection sort : �������� ���� ū�� ���� �ǵڷ�, �� �۾��� �ݺ�.
			===��������� O(n^2)===
		
			- quick sort : O(nlogn) : ������(�߰���)��� ū�� �ڷ� ������ ������ --> �ݺ� & ���������� �����̳� �������ķ� ������. 
			
			*/
		//�ܺ� ���� : ���������ġ sort - �ϵ��ũ�� ���׳�ƽ ���ٿ���.
		
		
		
		
	}

	public static void lotto(int[] lotto) {
		Random rd = new Random(); // �� �� ������ ����ص� �������.
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = rd.nextInt(45) + 1; // random class�̿�� bound�� �����ϰ� �ȴ�.
											// �ٿ�带 10���� �����ϸ� 0~9������ ���� ��������
											// ����ȴ�.
			// System.out.print(lotto[i]+" ");
			/*
			 * lotto[i]=(int)Math.ceil(Math.random()*45); //math�� �̿��Ҷ�. math�Լ���
			 * ��� 0~1 ������ �Ҽ��� �������� �����ϰ� �ȴ�. System.out.print(lotto[i]+" ");
			 */
		}
	}
}
