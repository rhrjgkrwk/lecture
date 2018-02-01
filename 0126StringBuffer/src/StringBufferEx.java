
/*스트링 버퍼를 사용해보자*/

public class StringBufferEx {
	public static void main(String[] args) {
		String aa= "babo";
		String bb= "ondal";
		String cc = aa+bb;
		//String은 고정길이 개념. 변경 불가능(내용이 변할때 공간을 새로 잡음)
		System.out.println(cc);
		
		//String Buffer : 공간을 재할당하지 않고 변경이 가능. 
		//수정이 많은 데이터인 경우 String 보다 StringBuffer를 사용하는 것이 좋다.
		StringBuffer sb1 = new StringBuffer("java"); 
		StringBuffer sb2 = new StringBuffer(10);  // capacity를 설정해보자.
		System.out.println(sb1.length());
		System.out.println(sb2.length());
		
		//StringBuffer를 이용해서 문자열을 변경해보자.
		System.out.println(sb2.append("java"));
		System.out.println(sb1.append("java"));
		
		System.out.println(sb1.reverse());
		System.out.println(sb1.delete(1,4)); // 1<=ㅇ<4 까지 지운다.
		System.out.println(sb2.toString()); 
		System.out.println(sb2.replace(1, 3, "python")); //1~2까지의 문자열을 "python"으로 바꾼다.
		
		if (sb1.equals(sb2)) { //역시 equals로 비교하여야한다.
			System.out.println("같아요");
		}
		else {
			System.out.println("달라여");
		}
		
		//수정 후의 문자열 길이.
		System.out.println(sb1.length());
		System.out.println(sb2.length());
	}
}
