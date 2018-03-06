package test1;

public class Main {
	public static void main(String[] args) {
		DBConnect ob=new DBConnect();
//		전체보기
		ob.addressList();
		
		//추가하기
		ob.addressInsert("냥","010-222-1234","충청도");
		
		//수정하기
		ob.addressUpdate(2,"1111-2222","경기도");
		
		//삭제하기
		ob.addressDelete(3);
		
		ob.dbClose();
	}
}





