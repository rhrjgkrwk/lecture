package test1;

public class Main {
	public static void main(String[] args) {
		DBConnect ob=new DBConnect();
//		��ü����
		ob.addressList();
		
		//�߰��ϱ�
		ob.addressInsert("��","010-222-1234","��û��");
		
		//�����ϱ�
		ob.addressUpdate(2,"1111-2222","��⵵");
		
		//�����ϱ�
		ob.addressDelete(3);
		
		ob.dbClose();
	}
}





