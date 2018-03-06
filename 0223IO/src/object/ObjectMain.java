package object;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectMain {
	public static void main(String[] args) {
//		User p1 = new User("coonyang",5,23.4);
//		User p2 = new User("nyangcoo",4,66.4);
		
		//객체 직렬화
//		try {
//			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("storage/data1.txt"));
//			oos.writeObject(p1);
//			oos.writeObject(p2);
//			oos.close();
//			System.out.println("생성 완료");
//		} catch (FileNotFoundException e) {
//			// TODO: handle exception
//		} catch (IOException e) {
//			// TODO: handle exception
//		}
		
		//역직렬화를 해보자
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("storage/data1.txt"));
			User p3 = (User)ois.readObject();
			User p4 = (User)ois.readObject();
			p3.display();
			p4.display();
			ois.close();
			System.out.println("역직렬화 완료");
		} catch (FileNotFoundException e) {
			// TODO: handle exception
		} catch (IOException e) {
			// TODO: handle exception
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
		}
		
		
	}
}	
