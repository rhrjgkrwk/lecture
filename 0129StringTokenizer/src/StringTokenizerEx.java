import java.util.StringTokenizer;

//��Ʈ����ũ�������� �Ẹ��
public class StringTokenizerEx {
	public static void main(String[] args) {
		String str = "100 100 200 200 300 4004 050060606 6 6 060 6 606 06 06 06 06 0";
		StringTokenizer st = new StringTokenizer(str, " ");

		System.out.println(st.countTokens());
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		System.out.println(st.countTokens());
	}
}
