package workshop.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
- driver:String
- url:String
- user:String
- pass:String
*/
public class FactoryBiz {
	private String driver;
	private String url;
	private String user;
	private String pass;
	public FactoryBiz() {
		// TODO Auto-generated constructor stub
	}
	public FactoryBiz(String driver, String url, String user, String pass) {
		this.driver = driver;
		this.url = url;
		this.user = user;
		this.pass = pass;
	}
	public void getFactoryAll(){
		Connection conn = null;
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, pass);
			new FactoryDao().getFactoryAll(conn);
			conn.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} 
	}
}
