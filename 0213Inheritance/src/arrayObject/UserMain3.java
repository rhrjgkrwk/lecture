package arrayObject;
//ob arr 2

public class UserMain3 {
	public static void main(String[] args) {
		User ob[] = new User[] { 
				new User("����", "010-123-1234"), new User("mike", "010-1223-1234"),
				new User("john", "010-1278-1234"), new User("kelly", "010-6723-1234"),
				new User("�ƹ���", "010-1823-1234") };
		for (User u: ob) { //ob�迭���� �ϳ��� �����ͼ� u ���� �־��.@!
			System.out.println(u.getName() + "\t  " + u.getPhone());
		}
	}
}