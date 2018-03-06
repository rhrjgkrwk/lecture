import java.util.HashMap;

class Heripoter{
	private int no;
	private String firstName;
	private String lastName;
	public Heripoter() {
	}
	public Heripoter(int no, String firstName, String lastName) {
		this.no = no;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	@Override
	public String toString() {
		return String.format("%-15s", firstName) + "\t"+lastName;
	}
}

public class Test16 {
	public static void main(String[] args) {
		HashMap<Integer, Heripoter> hm = new HashMap<>();
		hm.put(101, new Heripoter(101, "해리", "포터"));
		hm.put(102, new Heripoter(102, "론", "위즐리"));
		hm.put(103, new Heripoter(103, "헤르미온느", "그레인져"));
		
		System.out.println("성                     이름\n------------------------------------");
		for (Integer i : hm.keySet()) {
			System.out.println(hm.get(i));
		}
	}
}

/*
[문제16] HashMap컬렉션을 이용하여 다음 자료를 추가하시오
(1)클래스명 : Heripoter
   -no:int
   -firstname:String
   -lastname:String
   +Heripoter(no:int,firstname:String,lastname:String)
   +toString():String

(2) 사용데이터
     key        value
    ------------------------------------- 
     101        해리           포터
     102        론              위즐리
     103        헤르미온느  그레인져

(2)조건
   1) main()함수에서 HashMap클래스로 hm객체를  만들어 데이터를 추가한다
   2) 제네릭스를 이용한다

[출력화면]
성              이름
----------------------
해리           포터
론              위즐리
헤르미온느  그레인져
*/