
public class Main {
	public static void main(String[] args) {
		DBCon d = new DBCon();
		//전체보기
		d.addressList();
		
		//추가
		d.addressInsert("쿠냥이", "010-9999", "전라도");
		d.addressList();

		//수정
//		d.addressUpdate(2,"000-0000","경상도");
//		d.addressList();
		
		//삭제
//		d.addressDelete(3);
//		d.addressList();
		
		d.closeConnection();
	}
}
