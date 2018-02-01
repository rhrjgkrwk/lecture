import java.util.ArrayList;

/*
ǰ��, �ݾ� ������ ���� �ִ� Ŭ������ ������ �� 
ArrayList �迭�� ���� �ڷᰡ ����ִ� ��ü�� ��� ���� �� 
�ݾ��� 30000�� �̻�Ǵ� �ڷḸ �˻��� ��¸��ó�� ����غ���. 
��½� toString�� �������.abstract

"����������", 25000, "Sams"
"���ڰ���", 32000, "Sams"
"����������", 17050, "Sams"
"��ġ����", 24500, "Sams"
"�����", 75000, "KwajaGood"
"��ǳ�����", 34300, "KwajaGood"
"��ȭ������", 1400, "KwajaGood"
"��Ұ����", 17560, "Hello"
"����¡���", 57800, "Hello"
"��Ÿ�ΰ���", 63000, "Hello"

<< �˻��� ��ǰ ��� >>
���ڰ���(Sams) :32000
�����(KwajaGood) :75000
��ǳ�����(KwajaGood) :34300
����¡���(Hello) :57800
��Ÿ�ΰ���(Hello) :63000
*/

//���� Ŭ����
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
		snackList.add(new Snack("����������", 25000, "Sams"));
		snackList.add(new Snack("���ڰ���", 32000, "Sams"));
		snackList.add(new Snack("����������", 17050, "Sams"));
		snackList.add(new Snack("��ġ����", 24500, "Sams"));
		snackList.add(new Snack("�����", 75000, "KwajaGood"));
		snackList.add(new Snack("��ǳ�����", 34300, "KwajaGood"));
		snackList.add(new Snack("��ȭ������", 1400, "KwajaGood"));
		snackList.add(new Snack("��Ұ����", 17560, "Hello"));
		snackList.add(new Snack("����¡���", 57800, "Hello"));
		snackList.add(new Snack("��Ÿ�ΰ���", 63000, "Hello"));
		
		for (int i = 0; i < snackList.size(); i++) {
			if (snackList.get(i).getSprice()>30000) {
				System.out.println(snackList.get(i));
			}
		}
		
	}
}
