/*
�븮����!
��� ��ü��	�ο���	 ����� �ѿ��
��, 1�� �������� ���� ���� �������� 5000��
*/
class Noridongsan{
	private String danche;
	private int num;
	
	public Noridongsan(){}
	
	public Noridongsan(String danche, int num) {
		this.danche = danche;
		this.num = num;
	}
	
	public String getDanche() {
		return danche;
	}
	public void setDanche(String danche) {
		this.danche = danche;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	//�� ����� 
	public int totalEntranceFee(){
		return num*5000;
	}
}


public class AmusementPark {
	public static void main(String[] args) {
		Noridongsan a = new Noridongsan("ABC",30);
		Noridongsan b = new Noridongsan("QWE",60);
		Noridongsan c = new Noridongsan();
		c.setDanche("TDG");
		c.setNum(23);
		Noridongsan d = new Noridongsan("BMN",100);
		
		
		System.out.println("��ü��\t\t�ο���\t\t�����\t\t�ѿ��");
		System.out.printf("%4s\t\t%4d\t\t%4d\t\t\\%d\n",a.getDanche(),a.getNum(),5000,a.totalEntranceFee());
		System.out.printf("%4s\t\t%4d\t\t%4d\t\t\\%d\n",b.getDanche(),b.getNum(),5000,b.totalEntranceFee());
		System.out.printf("%4s\t\t%4d\t\t%4d\t\t\\%d\n",c.getDanche(),c.getNum(),5000,c.totalEntranceFee());
		System.out.printf("%4s\t\t%4d\t\t%4d\t\t\\%d\n",d.getDanche(),d.getNum(),5000,d.totalEntranceFee());
	}
}
