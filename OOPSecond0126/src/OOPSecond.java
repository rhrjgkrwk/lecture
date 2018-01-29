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
			System.out.println("�ܾ׺���");
		}
		else{
			money-=p.price;
			bPoint+=p.bPoint;
			System.out.println(p+"��/�� �����ϼ̽��ϴ�.");
		}
	}
}
/*
 toString() �޼ҵ�
��� Ŭ������ ��ü�� �� �̸��� ��¿� ����ϰ� �Ǹ� �ڵ������� ���� �޼ҵ带 ����Ѵ�. 
toString�� �������̵� �ؼ� ����ϸ� �����ϴ�..
*/
public class OOPSecond {
	public static void main(String[] args) {
		Buyer b = new Buyer();
		Computer c = new Computer();
		
		b.buy(new Tv());
		b.buy(new Computer());
		
		System.out.println("���� ���� ���� "+b.money+"��, ���� ����Ʈ�� "+b.bPoint+"�� �Դϴ�.");
	}
}
