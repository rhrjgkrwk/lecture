/*while���� �Ẹ��*/
public class WhileMoon {
	public static void main(String[] args) {
		/*
		while (condition) { - head (����)
			
		}
		*/
		int zzz = 10;
		while (zzz>3) {
			zzz--;
			System.out.println("zzz�� �پ���.");
		}
		
		while (true) {break;}//���ѷ���.
		
		//while ���� ���� ���̴� switch ��� flag ���
		boolean flag = true;;
		int i=0;
		while (flag) {
			if (i==10) {
				flag = false;
			}
			i++;
			System.out.println("DD");
		}
		
		
		/*�̸����� �ݺ����� �ݺ����� break*/
		
		Loop1:for (i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if (j==5) break Loop1; //Loop1�� �ݺ�����
				if(j==9) continue; //���� �ݺ��� continue
				continue Loop1;
			}
		}
		
		
	}
}
