package string;

public class StringEx {
	public static void main(String[] args) {
		
		
		String str1="korea";
		String str2=" fighting";
		
		//01234567890123
		//korea fighting
		String str3=str1.concat(str2);
		String str4=str3.substring(6, 11);
		String str5=str3.substring(6);
		char s=str3.charAt(4);
		
		System.out.println(str3); //koreafighting
		System.out.println(str4);
		System.out.println(str5);
		System.out.println(s);
		
	/*
		String s1="Hello";
		String s2="Hello";
//		���� ���� s2�� �ְ� �Ǹ� s1�� s2�� ���� ������ �Ҵ��Ѵ�. 
		String s3=s2;
		String s4=new String("Hello");
		String s5=new String("Hello");
//		new �� �ϰԵǸ� heap �޸𸮿� �ƿ� ���ο� ������ �Ҵ��Ѵ�.
		System.out.println(s1==s2);           // true
		System.out.println(s1==s3);           // true
		System.out.println(s1.equals(s2));   // true
		System.out.println(s1.equals(s3));   // true
		System.out.println(s4==s5);          // false
		System.out.println(s1.equals(s5));   // true
		*/
	}
}

