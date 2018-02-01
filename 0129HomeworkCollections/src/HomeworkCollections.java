import java.util.ArrayList;

/*
품면, 금액 제조사 명을 넣는 클래스를 설계한 후 
ArrayList 배열에 다음 자료가 들어있는 객체를 모두 넣은 후 
금액이 30000원 이상되는 자료만 검색해 출력모양처럼 출력해보자. 
출력시 toString을 사용하자.abstract

"좋은맛과자", 25000, "Sams"
"아자과자", 32000, "Sams"
"우유맛과자", 17050, "Sams"
"참치과자", 24500, "Sams"
"고소해", 75000, "KwajaGood"
"깐풍기과자", 34300, "KwajaGood"
"국화차과자", 1400, "KwajaGood"
"고소고소한", 17560, "Hello"
"굳오징어땅콩", 57800, "Hello"
"비타민과자", 63000, "Hello"

<< 검색된 상품 목록 >>
아자과자(Sams) :32000
고소해(KwajaGood) :75000
깐풍기과자(KwajaGood) :34300
굳오징어땅콩(Hello) :57800
비타민과자(Hello) :63000
*/

//과자 클래스
class Snack {
	private String sname;
	private int sprice;
	private String smaker;
	
	public Snack() {
		// TODO Auto-generated constructor stub
	}
	
	public Snack(String sname, int sprice, String smaker){
		this.sname = sname;
		this.sprice = sprice;
		this.smaker = smaker;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public int getSprice() {
		return sprice;
	}

	public void setSprice(int sprice) {
		this.sprice = sprice;
	}

	public String getSmaker() {
		return smaker;
	}

	public void setSmaker(String smaker) {
		this.smaker = smaker;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return sname+"("+smaker+") : "+sprice;
	}
	
}

public class HomeworkCollections {
	public static void main(String[] args) {
		ArrayList<Snack> snackList = new ArrayList<>();
		snackList.add(new Snack("좋은맛과자", 25000, "Sams"));
		snackList.add(new Snack("아자과자", 32000, "Sams"));
		snackList.add(new Snack("우유맛과자", 17050, "Sams"));
		snackList.add(new Snack("참치과자", 24500, "Sams"));
		snackList.add(new Snack("고소해", 75000, "KwajaGood"));
		snackList.add(new Snack("깐풍기과자", 34300, "KwajaGood"));
		snackList.add(new Snack("국화차과자", 1400, "KwajaGood"));
		snackList.add(new Snack("고소고소한", 17560, "Hello"));
		snackList.add(new Snack("굳오징어땅콩", 57800, "Hello"));
		snackList.add(new Snack("비타민과자", 63000, "Hello"));
		
		for (int i = 0; i < snackList.size(); i++) {
			if (snackList.get(i).getSprice()>30000) {
				System.out.println(snackList.get(i));
			}
		}
		
	}
}
