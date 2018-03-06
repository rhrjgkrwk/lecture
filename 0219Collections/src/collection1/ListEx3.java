package collection1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListEx3 {
	public static void main(String[] args) {
		Book b1 = new Book("java","kim",1098);
		Book b2 = new Book("c++","lee",255);
		Book b3 = new Book("oracle","park",456);
		List<Book> bookList = new ArrayList<>();
		bookList.add(b1);
		bookList.add(b2);
		bookList.add(b3);
		
		//foreach�� �غ���.
		for (Book book : bookList) {
			System.out.println(book);
		}
		//iterator�� �غ���.
		Iterator<Book> it = bookList.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
	}
}

class Book{
	private String name;
	private String author;
	private int page;
	public Book() {
	}
	public Book(String name, String author, int page) {
		this.name = name;
		this.author = author;
		this.page = page;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "å �̸� : "+name+"\tå �̸� : "+author+"   \tpage : "+page;
	}
}