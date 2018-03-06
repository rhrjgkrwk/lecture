package arrayObject;

public class UserMain2 {
	public static void main(String[] args) {
		User ob[] = new User[5];
		ob[0] = new User("±è±è±è", "010-123-1234");
		ob[1] = new User("mike", "010-1223-1234");
		ob[2] = new User("john", "010-1278-1234");
		ob[3] = new User("kelly", "010-6723-1234");
		ob[4] = new User("¾Æ¹«°³", "010-1823-1234");
		for (int i = 0; i < ob.length; i++) {
			System.out.println(ob[i].getName()+"\t  "+ob[i].getPhone()); 
		}
	}
}
