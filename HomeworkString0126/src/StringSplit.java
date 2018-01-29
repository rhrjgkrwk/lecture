/*
String에 "P1**samsung**5"; 라는 문자열을 넣은 후 다음과 같이 출력
제품번호 : P1, 생산자 : samsung, 수량 : 5

조건 1) 출력은 toString 오버라이드 했던 것처럼 chool이라는 메소드를 사용한다.abstract
조건 2)	 private String producyId;
			private String maker;
			private int amount;
조건 3) 게터세터

*/
class Product{
	private String producyId;
	private String maker;
	private int amount;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}
	public Product(String str) {
		// TODO Auto-generated constructor stub
		//여기서 spit으로 각각 항목을 파싱
		String temp[] = str.split("\\*\\*"); //*가 정규표현식에서 특별한 의미를 지니므로 \\처리 해야함. 안그럼 dangling meta ~~ 오류 발생
		this.producyId = temp[0];
		this.maker = temp[1];
		this.amount = Integer.parseInt(temp[2]);
	}
	
	public String chool(){
		return "제품번호 : "+this.producyId+", 생산자 : "+this.maker+", 수량 : "+this.amount;
	}
	/*@Override
	public String toString() {
		// TODO Auto-generated method stub
		return ;
	}*/
	
	//getter / setter
	public String getProducyId() {
		return producyId;
	}
	public void setProducyId(String producyId) {
		this.producyId = producyId;
	}
	public String getMaker() {
		return maker;
	}
	public void setMaker(String maker) {
		this.maker = maker;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
}

public class StringSplit {
	public static void main(String[] args) {
		String str = "P1**samsung**5";
		Product p = new Product(str);
		System.out.println(p.chool());
		System.out.println(p.getAmount()+p.getProducyId()+p.getMaker());
		/*for (String s : str.split("\\*\\*")) {
			System.out.println(s);
		}*/
	}
}
