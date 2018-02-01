import java.util.ArrayList;

class Screen{
	private String name;
	//private int showTime;
	public Screen(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "("+this.name+")";
	}
}


public class CollectionClass {
	public static void main(String[] args) {
		ArrayList<Screen> sList = new ArrayList<Screen>();
		sList.add(new Screen("Beomjoedosi"));
		sList.add(new Screen("Hotel Budapest"));
		sList.add(new Screen("Coco"));
		
		for (int i = 0; i < sList.size(); i++) {
			System.out.println(sList.get(i)); //toString �������̵��� �س��� ������ (��ȭ�̸�) �̷������� ����
		}
		
		System.out.println(sList.get(1).getName());
		
		//���� �����Ҷ��� 
		sList.get(1).setName("�޷ո޷�"); //private �����̱� ������ get/set�̿��ؾ��Ѵ�.
		System.out.println(sList.get(1).getName());
	}
}
