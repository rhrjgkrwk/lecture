import java.util.StringTokenizer;

public class Test14 {
	public static void main(String[] args) {
		String str = "10*30*20*40*50";
		StringTokenizer st = new StringTokenizer(str, "*");
		int sum = 0;
		while (st.hasMoreTokens()) {
			int temp = Integer.parseInt(st.nextToken());
			System.out.print(temp);
			sum+=temp;
			if (st.hasMoreElements()) {
				System.out.print("+");
			}
		}
		System.out.println("="+sum);
	}
}


/*
------------------------------------------------------------------------------
[����14] ���ڿ������� "10*30*20*40*50"�� �������� StringTokenizerŬ������ 
         �̿��Ͽ� ������������Ͻÿ�
         String str="10*30*20*40*50";   Integer.parseInt()���

[���ȭ��]
10+30+20+40+50 = 150
*/
