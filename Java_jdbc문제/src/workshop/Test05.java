package workshop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Test05 {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		String sql = "DELETE FROM PRODUCT WHERE PDNO IN (SELECT PDNO FROM DISCARDED_PRODUCT)";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@127.0.0.1:1521:xe", "credu", "credu");
			stmt = conn.createStatement();
			int n = stmt.executeUpdate(sql);
			System.out.println(n+"열이 삭제되었다.");
			conn.commit();
			stmt.close();
			conn.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			if (conn != null) {
				try {
					conn.rollback(); // 에러발생시 rollback 처리
				} catch (SQLException sqle) {
				}
			}
			e.printStackTrace();
		} 
	}
}
