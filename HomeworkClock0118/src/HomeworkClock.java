import java.util.Scanner;

/*�ð��� �ʷ� �Է¹޾� 
 * "00�ð�00��00��"�� 
 * ����ϴ� ���α׷��� ¥����
 * �� �ð��� 0�ð��̰ų� 0���̸� ��������
*/
public class HomeworkClock {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("input : ");
		int sec = Integer.parseInt(sc.nextLine());
		//int hour, minute;
		int hour = sec/3600;
		int minute = (sec/60)%60;
		sec %= 60;
				
		if (hour!=0) {
			System.out.printf("%02d��%02d��%02d��",hour, minute, sec);//�ú���
		}
		else{
			if (minute==0) {
				System.out.printf("%02d��%02d��",minute, sec);//���ʸ�
			}
			else {
				System.out.printf("%02d��",sec);//�ʸ�				
			}
		}
		sc.close();
	}
}
