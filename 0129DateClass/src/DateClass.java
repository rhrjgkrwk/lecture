import java.text.SimpleDateFormat;
import java.util.*;

/*
���� ��ü : 
		1. Ŭ������ �ȸ���� ��. ex. Date
		2. Ŭ����, new �ȸ���� ��. 
			ex. ������ window.location = "https://www.naver.com"
*/
public class DateClass {
	public static void main(String[] args) {
		Date d = new Date();
		System.out.println(d.toLocaleString());
		Date d1 = new Date(1249015992215L);
		// date - the milliseconds since January 1, 1970, 00:00:00 GMT.
		// 1970���� �������� 1249015915L �и������� ��ŭ ������ ���� �������� �� �� �ֵ�.
		System.out.println(d1.toLocaleString());

		Date d2 = new Date();
		int year = d2.getYear() + 1900; // ������ ���������� 1900�� ��������Ѵ�.
		int month = d2.getMonth() + 1; // C�� ���� ���Ͻ� ��ġ�� 1-12���� 0-11���� ��������
										// �׷���.
		int day = d2.getDate(); //
		System.out.println("");
		System.out.println(year + "�� " + month + "�� " + day + "�� �Դϴ�.");

		// ������ 100���� ���غ���.
		d2.setDate(d2.getDate() + 100 - 1);
		int year1 = d2.getYear() + 1900; //
		int month1 = d2.getMonth() + 1; //
		int day1 = d2.getDate(); //
		System.out.println("������ 100�� �Ǵ� ����");
		System.out.println(year1 + "�� " + month1 + "�� " + day1 + "�� �Դϴ�.");

		// ������ �Է��ϸ� ��ƿ� ���� �˷��ִ� ���α׷��� ������.

		Date birth = new Date(1992 - 1900, 12 - 1, 25); // �����ÿ��� -1900, -1��
														// �ؾ��Ѵ�.
		Date today = new Date();
		long gap = today.getTime() - birth.getTime();
		System.out.println((birth.getYear() + 1900) + "�� " + (birth.getMonth() + 1) + "�� " + birth.getDate()
				+ "�� ���� ��ƿ� ���� " + gap / 1000 / 3600 / 24 + "�� �Դϴ�.");

		// SimpleDateFormat sd = new SimpleDateFormat();

		/*
		 * Ķ���� Ŭ�󽺸� ����غ���! Ķ���� Ŭ������ Date Ŭ������
		 */

		Calendar c = Calendar.getInstance(); // new�� ������� �ʴ´�.
		int year2 = c.get(Calendar.YEAR);
		int month2 = c.get(Calendar.MONTH) + 1; // 0-11 : 1�� ��������Ѵ�.
		int date2 = c.get(Calendar.DATE);
		int hour = c.get(Calendar.HOUR);
		int minute = c.get(Calendar.MINUTE);
		int second = c.get(Calendar.SECOND);

		System.out.println("���� �ð�");
		System.out.println(year2 + "��" + month2 + "��" + date2 + "��" + hour + "��" + minute + "��" + second + "��");

		// Calendar�� ����Ͽ� ������ �Է��ϸ� ��ƿ� ���� �˷��ִ� ���α׷��� ������.

		Calendar birth1 = Calendar.getInstance();
		birth1.set(1992, Calendar.DECEMBER, 25,0,0,0);
		long gap1 = today.getTime()-birth.getTime();
		System.out.println("��ƿ� ���� " + gap1 / 1000 / 3600 / 24 + "�� �Դϴ�.");
	
		//SimpleDateFormat�� �Ẹ��/!
		
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM�� dd�� kk�� mm�� ss��"); //������ �����Ͽ�
		System.out.println(sdf.format(birth1.getTime())); 	//���˿� �°� ��´�. 
		//format �޼ҵ��� ���ڴ� Date��ü �Ǵ� long(ms)�̴�. Calendar�� �Ϸ��� getTime���� �Ѱ�����.
		System.out.println(sdf.format(today));
		
		
		
		
		
		
		
		
		
		
	
	}
}
