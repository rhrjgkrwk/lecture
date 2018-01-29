class Product{
	int price;
	int bPoint;
	
	public Product(int price) {
		// TODO Auto-generated constructor stub
		this.price = price;
		bPoint = (int)(price/10.0);
	}
}

class Tv extends Product{
	public Tv() {
		super(100);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Tv";
	}
}

class Computer extends Product{
	public Computer() {
		super(100);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Computer";
	}
}

class Buyer{
	int money = 1000;
	int bPoint = 0;
	void buy(Product p){
		if (p.price>money) {
			System.out.println("잔액부족");
		}
		else{
			money-=p.price;
			bPoint+=p.bPoint;
			System.out.println(p+"을/를 구입하셨습니다.");
		}
	}
}
/*
 toString() 메소드
모든 클래스의 객체는 그 이름을 출력에 사용하게 되면 자동적으로 위의 메소드를 사용한다. 
toString을 오버라이딩 해서 사용하면 유용하다..
*/
public class OOPSecond {
	public static void main(String[] args) {
		Buyer b = new Buyer();
		Computer c = new Computer();
		
		b.buy(new Tv());
		b.buy(new Computer());
		
		System.out.println("현재 남은 돈은 "+b.money+"원, 남은 포인트는 "+b.bPoint+"점 입니다.");
	}
}
