
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

public class JDBCClass {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection con = null; //접속 객체 선언!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		Class.forName	("oracle.jdbc.driver.OracleDriver"); 
		//오라클 드라이버를 메모리로 로드하겠다.
		//mssql, mysql 도 이와 같은 방식으로 로드해야된다.
		
		con = DriverManager.getConnection("jdbc:oracle:thin:@70.12.109.102:1521:xe", "hr", "hr");
		System.out.println("접속했지 말입니다.");
		String sql2 = "select * from membership1"; //where앞에 띄워쓰기!!!!!
		//select * from employeeswhere departments_id=90 안띄워쓰면 이렇게 뜸.

		Statement st2 = con.createStatement(); //
		ResultSet rs2 = st2.executeQuery(sql2);
		
		while (rs2.next()) {
			String id = rs2.getString("id");
			//int id = rs2.getInt(1); 
			// 이런식으로 컬럼 넘버로 읽어와도 된다. 
			//헷갈리면 직접 컬럼명을 써준다.
			String pw = rs2.getString("pw");
			int age = rs2.getInt("age");
			String nname = rs2.getString("nname");
		//	Timestamp h_date = rs2.getTimestamp("hire_date"); //sql의 date를 util 
		//	SimpleDateFormat s = new SimpleDateFormat("yyyy년MM월dd일");
		//	System.out.println(s.format((h_date)));
			System.out.println(id + pw+nname + age);
			
		}
	}
}
