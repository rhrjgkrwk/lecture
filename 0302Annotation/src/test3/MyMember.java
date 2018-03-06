package test3;

public class MyMember {
	@Member(name="admin")
	public void view1(){
		System.out.println("관리자 화념");
	}
	
	@Member(name="all")
	public void view2(){
		System.out.println("사요자 화념");
	}
}
