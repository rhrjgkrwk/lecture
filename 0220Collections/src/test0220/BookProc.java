package test0220;

import java.util.ArrayList;

//�����ͺ��̽��� ����(����Ͻ� ����ó��)
public class BookProc {
	public ArrayList<Book> getList() {
		Book bk1=new Book("java","kim",100);
		Book bk2=new Book("C++","lee",250);
		Book bk3=new Book("JSP","park",150);
		
		ArrayList<Book> list=new ArrayList<Book>();
		list.add(bk1);
		list.add(bk2);
		list.add(bk3);
		return list;
	}
}
