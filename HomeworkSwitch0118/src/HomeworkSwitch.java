import java.util.Scanner;

/*����ġ���� �̻��� ������ ���̿��Ͽ� 
 * �Ŵ��� ��¥���� ����Ͻÿ�.
 * (��, 12�� ����� ���� �����ϳ� 
 * ��°��� �۾��� 3���ؾ��Ѵ�.)
 * 1,3,5,7,8,10,12 - 31�� / ������ 30�� / 2�� - 28
 * */
public class HomeworkSwitch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("input : ");
		int month = Integer.parseInt(sc.nextLine());
		int days = 0;
		if (0 < month && month <= 12) {
			switch (month) {
			case 1:	case 3:
			case 5:	case 7:
			case 8:	case 10:
			case 12:
				days = 31;
				break;
			case 4:	case 6:
			case 9:	case 11:
				days = 30;
				break;
			case 2:
				days = 28;
				break;
			}
			System.out.println(month + "���� " + days + "�ϱ��� �ֽ��ϴ�.");
		}
		else System.out.println("1~12���� �Է����ּ���.");
		sc.close();
	}
}
