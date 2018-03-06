package objectEx;

/*   클래스명 : Sales
 *   -item:String
 *   -qty:int
 *   -cost:int
 *   
 *   +setItem(item String):void
 *   +setQty(qty int):void
 *   +setCost(cost int):void
 *   +getItem():String
 *   +getQty():int
 *   +getCost():int
 *   
 *   +toString():String          ==> 출력
 *   +getPrice():int             ==> 수량 * 단가를 리턴
 */
class Sales {
	private String item;
	private int qty;
	private int cost;

	// GSttrs
	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	// override
	public String toString() {
		return "품목 : " + item + "\n수량 : " + qty + "\n단가 : " + cost + "\n금액 : " + getPrice();
	}

	public int getPrice() {
		return qty * cost;
	}
}

public class ObjectEx5 {
	public static void main(String[] args) {
		Sales ss = new Sales();

		ss.setItem("apple");
		ss.setQty(5);
		ss.setCost(6000);
		ss.toString();

		System.out.println(ss);
		// System.out.println()을 1번만 써서 출력
		System.out.println(
				ss.getItem() + "  " + ss.getCost() + "원 짜리 " + ss.getQty() + "개 구입하면 " + ss.getPrice() + "원이 필요함");
	}
}
/*
 * 품목 : apple 수량 : 5 단가 : 1200원 금액 : 6000원
 *
 * apple 1200원 짜리 5개 구입하면 6000원이 필요함
 */
