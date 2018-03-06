package workshop;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//PRODUCT 테이블에서 폐기 되는 제품정보들을 모두 조회 하여 
//DISCARDED_PRODUCT 테이블로 INSERT
//한다. 단, 트랜잭션 처리를 반드시 한다.
//조건:
//1) 폐기 날짜는 현재 시스템 날짜로 한다.
public class Test04 {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String selectSql = "SELECT PRODUCT.* FROM PRODUCT INNER JOIN FACTORY ON PRODUCT.FACTNO = FACTORY.FACTNO WHERE FACTORY.FACLOC = 'CHANGWON'";
		String insertSql = "INSERT INTO DISCARDED_PRODUCT VALUES(?,?,?,?,?,?,?,?,?)";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@127.0.0.1:1521:xe", "credu", "credu");
			stmt = conn.createStatement();
			rs = stmt.executeQuery(selectSql);
			pstmt = conn.prepareStatement(insertSql);
			int n = 0;
			while (rs.next()) {
				pstmt.setString(1, rs.getString(1));
				pstmt.setString(2, rs.getString(2));
				pstmt.setString(3, rs.getString(3));
				pstmt.setString(4, rs.getString(4));
				pstmt.setDate(5, rs.getDate(5));
				pstmt.setInt(6, rs.getInt(6));
				pstmt.setInt(7, rs.getInt(7));
				pstmt.setInt(8, rs.getInt(8));
				pstmt.setDate(9, new Date(new java.util.Date().getTime()));
				n+=pstmt.executeUpdate();
			}
			System.out.println(n+"열이 추가되었다.");
			conn.commit();
			rs.close();
			stmt.close();
			pstmt.close();
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
///2개의 데이터가 정상적으로 INSERT 되었습니다.