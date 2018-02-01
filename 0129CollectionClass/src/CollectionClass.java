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
			System.out.println(sList.get(i)); //toString 오버라이딩을 해놨기 때문에 (영화이름) 이런식으로 찍힘
		}
		
		System.out.println(sList.get(1).getName());
		
		//값을 변경할때는 
		sList.get(1).setName("메롱메롱"); //private 변수이기 때문에 get/set이용해야한다.
		System.out.println(sList.get(1).getName());
	}
}
