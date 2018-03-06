package solution;

/*[����13]
Ŭ������ : Date
��  �� : year, month, day          (���� ��,��,��)
�޼��� : Date(int,int,int); 
         void printDate();         <--- ��,��,�����


Ŭ������ : Product                 <---- Date�� ��ӹ���
��  �� : item,company,price        (��ǰ��,������,����)
�޼��� : Product(String, String, int,int,int,int)
         void printPro();          <----- ��ǰ��,������,�������

���ϸ�/Ŭ������ : ExamTest13           <--- main()����      

[����]
Test1Ŭ������ main()�Լ����� ProductŬ������ 
��ü ob("�����", "���",1200, 2012, 3, 10)�� �������� 
������ �޼��带 ȣ���Ͽ� �Ʒ��� ���� ����Ͻÿ�
   
[��� ȭ��]
��ǰ�� : �����
������ : ���
��  �� : 1200��
������ : 2012/3/10
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
		System.out.println("������ : "+year+"/"+month+"/"+day);
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
		System.out.println("��ǰ�� : "+item);
		System.out.println("������ : "+company);
		System.out.println("���ư� : "+price);
		printDate();
	}
}

public class ExamTest13 {
	public static void main(String[] args) {
		Product ob = new Product(2012, 3, 10, "�����", "���", 1200);
		ob.printPro();
	}
}
