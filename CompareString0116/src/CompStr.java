
public class CompStr {
	public static void main(String[] args) {
		/*
		 * 1. ���� ũ�� �� : char ���� primitive type���� �� ����.
		 	A. B ũ�� ���ϱ�.
		   65 66	
		 */
		
		char a = 'a';
		char b = 'b';
		System.out.println((a>b) ? "a�� �� ũ��" : "b�� �� ũ��.");
				
		
		/*
		 * 2. ���ڿ� �� : ��ü�̱� ������ equals�� ���ؾ���. �׳� �ϸ� �ּҸ� ���ϴ� ��. 
		 */
		
		String c = "TOM";
		String d = "TOMMY";
		System.out.println(c.compareTo(d)); 
		//this.charAt(k)-anotherString.charAt(k) ������ �ڿ� ���� �� ũ��, ����� ���ǰ�. 0�̸� ����. 
		//The result is zero if the strings are equal; compareTo returns 0 exactly when the equals(Object) method would return true.
		System.out.println(c.equals(d));
		
		
		
	}
}
