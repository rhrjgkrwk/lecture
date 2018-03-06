package solution;

/*[문제13]
클래스명 : Date
필  드 : year, month, day          (제조 년,월,일)
메서드 : Date(int,int,int); 
         void printDate();         <--- 년,월,일출력


클래스명 : Product                 <---- Date를 상속받음
필  드 : item,company,price        (상품명,제조사,가격)
메서드 : Product(String, String, int,int,int,int)
         void printPro();          <----- 상품명,제조사,가격출력

파일명/클래스명 : ExamTest13           <--- main()포함      

[조건]
Test1클래스의 main()함수에서 Product클래스로 
객체 ob("새우깡", "농심",1200, 2012, 3, 10)을 생성한후 
각각의 메서드를 호출하여 아래와 같이 출력하시오
   
[결과 화면]
상품명 : 새우깡
제조사 : 농심
가  격 : 1200원
제조일 : 2012/3/10
*/
class Date{
	private int year;
	private int month;
	private int day;
	public Date() {
		// TODO Auto-generated constructor stub
	}
	public Date(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public void printDate(){
		System.out.println("제조일 : "+year+"/"+month+"/"+day);
	}
}

class Product extends Date{
	private String item;
	private String company;
	private int price;
	public Product() {
		// TODO Auto-generated constructor stub
	}
	public Product(int year, int month, int day, String item, String company, int price) {
		super(year, month, day);
		this.item = item;
		this.company = company;
		this.price = price;
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void printPro(){
		System.out.println("제품명 : "+item);
		System.out.println("제조사 : "+company);
		System.out.println("가아격 : "+price);
		printDate();
	}
}

public class ExamTest13 {
	public static void main(String[] args) {
		Product ob = new Product(2012, 3, 10, "새우깡", "농심", 1200);
		ob.printPro();
	}
}
