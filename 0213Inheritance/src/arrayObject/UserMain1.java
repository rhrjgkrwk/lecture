package arrayObject;

public class UserMain1 {
	public static void main(String[] args) {
		User ob1 = new User("±è±è±è", "010-123-1234");
		User ob2 = new User("¹Ú¹Ú¹Ú", "010-123-1234");
		User ob3 = new User("ÃÖÃÖÃÖ", "010-123-1234");
		System.out.println(ob1.getName()+" "+ob1.getPhone()); 
		System.out.println(ob2.getName()+" "+ob2.getPhone()); 
		System.out.println(ob2.getName()+" "+ob2.getPhone()); 
		
		
	}
}
