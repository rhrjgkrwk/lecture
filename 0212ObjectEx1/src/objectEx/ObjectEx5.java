package objectEx;

/*   Ŭ������ : Sales
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
 *   +toString():String          ==> ���
 *   +getPrice():int             ==> ���� * �ܰ��� ����
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
		return "ǰ�� : " + item + "\n���� : " + qty + "\n�ܰ� : " + cost + "\n�ݾ� : " + getPrice();
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
		// System.out.println()�� 1���� �Ἥ ���
		System.out.println(
				ss.getItem() + "  " + ss.getCost() + "�� ¥�� " + ss.getQty() + "�� �����ϸ� " + ss.getPrice() + "���� �ʿ���");
	}
}
/*
 * ǰ�� : apple ���� : 5 �ܰ� : 1200�� �ݾ� : 6000��
 *
 * apple 1200�� ¥�� 5�� �����ϸ� 6000���� �ʿ���
 */
