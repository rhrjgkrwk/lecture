
public class StringArray {
	public static void main(String[] args) {
		
		//String �迭�� �����ϰ� �ʱ�ȭ �غ���.
		
		String str[] = new String[3];
		str[0] = "babo";
		str[1] = "ondal";
		str[2] = "changja";
		String str1[] = {"a","b","c"}; 
		
		//String�� char �迭 (char[] --> String / String --> char[])
		
			String str2 = "babo";
			char[] c = new char[3];
			c[0] = 'a';
			c[1] = 'b';
			c[2] = 'c';
			
			//1. String --> Char[] : toCharArray() �Լ� �̿�
			String str3 = "baaabo";
			char[] c1 = str3.toCharArray();
			c1[2] = 't'; //char[]�� �ٲٸ� �ϳ��� ����/������ �����ϴ�.
			for (int i = 0; i < c1.length; i++) {
				System.out.print(c1[i]);
			}
			
			//2. char[] --> String : toString()
			String str4 = new String(c1);
			//String str5 = c.toString(); //error
			System.out.println(str4);
			//System.out.println(str5);
	}
}
