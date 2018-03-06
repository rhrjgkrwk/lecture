package workshop.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FactoryDao {
	public void getFactoryAll(Connection conn){
		String sql = "select * from factory";
		Statement stmt = null;
		ResultSet rs = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@127.0.0.1:1521:xe", "credu", "credu");
			
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			System.out.println("공장번호 \t 공장명 \t 공장위치");
			System.out.println("------------+------------+--------------");
			
			while (rs.next()) {
				System.out.print(rs.getString(1)+"     \t");
				System.out.print(rs.getString(2)+"  \t");
				System.out.println(rs.getString(3));
			}
			
			rs.close();
			stmt.close();
			conn.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} 
	}
}
