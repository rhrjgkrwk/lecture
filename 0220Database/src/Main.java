
public class Main {
	public static void main(String[] args) {
		DBCon d = new DBCon();
		//��ü����
		d.addressList();
		
		//�߰�
		d.addressInsert("�����", "010-9999", "����");
		d.addressList();

		//����
//		d.addressUpdate(2,"000-0000","���");
//		d.addressList();
		
		//����
//		d.addressDelete(3);
//		d.addressList();
		
		d.closeConnection();
	}
}
