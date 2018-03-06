import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
-. 테이블용어
   필드, 컬럼명, pk, fk,등에 대해 정리하시오

-. 테이블 만들기

    제품테이블

  제품번호 숫자 5, 제품명 문자 20, 
 제작일자  날짜, 제품가격 숫자 


  1) 테이블만드시오
  2)  자료를 5개 입력하시오
  3) 가격을 모두 20% 인상하시오
  4) 제품 중 하나를 지우시오

-. 입사일이 2005년 이전에 입사하고 급여가 
   5000이상인 사원의 id, 이름, 입사일 ,급여
   를 출력하는 jdbc 프로그램을 작성하시오   
*/  


public class HomeworkJDBC {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		
		String sql = "SELECT employee_id, first_name, last_name, hire_date, salary"
				+ " FROM employees"
				+ " WHERE hire_date < \'20050101\' and salary >= 5000";
		Connection con = null;
		Class.forName	("oracle.jdbc.driver.OracleDriver"); 
		con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
		
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(sql);
		
		while (rs.next()) {
			int id = rs.getInt("employee_id");
			String fname = rs.getString("first_name");
			String lname = rs.getString("last_name");
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy년M월d일");
			String hdate = sdf.format(rs.getTimestamp("hire_date"));
			int sal = rs.getInt("salary");
			System.out.println(id+"\t"+fname+" "+lname+"\t"+hdate+"\t"+sal+"$");
		}
		con.close();
	}
}
