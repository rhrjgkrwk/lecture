package collection2;

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
		return "책 이름 : "+name+"\t책 이름 : "+author+"   \tpage : "+page;
	}
}