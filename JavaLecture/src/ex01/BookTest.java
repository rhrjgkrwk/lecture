package ex01;

public class BookTest {
	public static void main(String[] args) {
		Book[] book = new Book[3];
		book[0] = new Book("SQL Plus", 50000, 5.0);
		book[1] = new Book("JAVA 2.0", 40000, 3.0);
		book[2] = new Book("JSP Servlet", 60000, 6.0);
		System.out.println("책이름\t\t가격\t\t할인율\t\t할인 후 가격");
		System.out.println("=====================================");
		for (Book b : book) {
			System.out.println(b.getBookName()+"\t"+b.getBookPrice()+"원\t"+b.getBookDiscountRate()+"%\t"+b.getDiscountBookPrice()+"원");
		}
	}
}
