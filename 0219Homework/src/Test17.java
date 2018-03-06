import java.util.HashMap;
import java.util.Hashtable;
import java.util.Scanner;

class PhoneBook{
	private String phoneNumber;
	private String address;
	public PhoneBook() {
	}
	public PhoneBook(String number, String address) {
		this.phoneNumber = number;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Phone: "+phoneNumber+"\nAddress: "+address;
	}
}

public class Test17 {
	public static void main(String[] args) {
		Hashtable<String, PhoneBook> ob = new Hashtable<>();
		Scanner sc = new Scanner(System.in);
		ob.put("홍길동", new PhoneBook("123-4567","서울"));
		ob.put("이몰용", new PhoneBook("123-4444","부산"));
		ob.put("임걱정", new PhoneBook("444-9874","대구"));
		//이름을 찾아보자!
		System.out.print("찾는사람 : ");
		String key = sc.nextLine();
		if (ob.containsKey(key)) {
			System.out.println(ob.get(key));
		}
		else {
			System.out.println("그런 사람 없다.");
		}
		sc.close();
	}
}

/*
------------------------------------------------------------------------------
[문제17] Hashtable 컬렉션을 이용하여 다음 프로그램을 작성하시오

(1)클래스명 : PhoneBook
- phoneNumber : String
- address : String
+ PhoneBook(phoneNumber:String,address:String)
+ toString():String      ==> 연락처와 주소의 출력문자열을 리턴한다

(2)사용데이터
    key             value
    ----------------------------------
    홍길동         123-4567   서울
    이몽룡         345-3345   대구
    임꺽정         123-7890   부산

(2)조건
    1) main()메서드에서 Hashtable클래스로 ob객체를 만들어 데이터를 추가한다
    2) 제네릭스를 이용한다

[출력화면]
찾는 이름: 임꺽정


찾는 이름 : 방자
그런사람 없음*/