
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
		Connection con = null; //���� ��ü ����!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		Class.forName	("oracle.jdbc.driver.OracleDriver"); 
		//����Ŭ ����̹��� �޸𸮷� �ε��ϰڴ�.
		//mssql, mysql �� �̿� ���� ������� �ε��ؾߵȴ�.
		
		con = DriverManager.getConnection("jdbc:oracle:thin:@70.12.109.102:1521:xe", "hr", "hr");
		System.out.println("�������� ���Դϴ�.");
		String sql2 = "select * from membership1"; //where�տ� �������!!!!!
		//select * from employeeswhere departments_id=90 �ȶ������ �̷��� ��.

		Statement st2 = con.createStatement(); //
		ResultSet rs2 = st2.executeQuery(sql2);
		
		while (rs2.next()) {
			String id = rs2.getString("id");
			//int id = rs2.getInt(1); 
			// �̷������� �÷� �ѹ��� �о�͵� �ȴ�. 
			//�򰥸��� ���� �÷����� ���ش�.
			String pw = rs2.getString("pw");
			int age = rs2.getInt("age");
			String nname = rs2.getString("nname");
		//	Timestamp h_date = rs2.getTimestamp("hire_date"); //sql�� date�� util 
		//	SimpleDateFormat s = new SimpleDateFormat("yyyy��MM��dd��");
		//	System.out.println(s.format((h_date)));
			System.out.println(id + pw+nname + age);
			
		}
	}
}
