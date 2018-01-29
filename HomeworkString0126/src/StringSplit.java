/*
String�� "P1**samsung**5"; ��� ���ڿ��� ���� �� ������ ���� ���
��ǰ��ȣ : P1, ������ : samsung, ���� : 5

���� 1) ����� toString �������̵� �ߴ� ��ó�� chool�̶�� �޼ҵ带 ����Ѵ�.abstract
���� 2)	 private String producyId;
			private String maker;
			private int amount;
���� 3) ���ͼ���

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
		//���⼭ spit���� ���� �׸��� �Ľ�
		String temp[] = str.split("\\*\\*"); //*�� ����ǥ���Ŀ��� Ư���� �ǹ̸� ���ϹǷ� \\ó�� �ؾ���. �ȱ׷� dangling meta ~~ ���� �߻�
		this.producyId = temp[0];
		this.maker = temp[1];
		this.amount = Integer.parseInt(temp[2]);
	}
	
	public String chool(){
		return "��ǰ��ȣ : "+this.producyId+", ������ : "+this.maker+", ���� : "+this.amount;
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
