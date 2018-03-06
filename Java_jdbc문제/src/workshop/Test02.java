package workshop;
/*
제품카테고리가 “TV”인 제품 중 가장 싼 것보다 비싼 모든 제품과,
제품카테고리가 “CELLPHONE”인 제품 중 가장 비싼 제품보다 싼 모든 제품을 출력한다.
조건:
1) UNION을 사용하지 않고 하나의 쿼리 문장으로 작성 한다.
2) 제품원가를 기준으로 한다.
*/

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Test02 {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		String sql = "select pdsubname, pdcost, pdprice from product where pdcost > (SELECT MIN(pdcost) FROM product where pdname = 'TV') and pdcost < (SELECT MAX(pdcost) FROM product where pdname = 'CELLPHONE') order by pdcost asc";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@127.0.0.1:1521:xe", "credu", "credu");
			
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			System.out.println("제품명 \t 제품원가 \t 제품가격");
			System.out.println("------------+------------+--------------");
			
			while (rs.next()) {
				System.out.print(rs.getString(1)+"     \t");
				System.out.print(rs.getInt(2)+"  \t");
				System.out.println(rs.getInt(3));
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
