package arrayObject;
//ob arr 2

public class UserMain3 {
	public static void main(String[] args) {
		User ob[] = new User[] { 
				new User("김김김", "010-123-1234"), new User("mike", "010-1223-1234"),
				new User("john", "010-1278-1234"), new User("kelly", "010-6723-1234"),
				new User("아무개", "010-1823-1234") };
		for (User u: ob) { //ob배열에서 하나씩 가져와서 u 에다 넣어보자.@!
			System.out.println(u.getName() + "\t  " + u.getPhone());
		}
	}
}