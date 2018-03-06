package workshop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
제품이 생산된 공장위치가 "SEOUL"인 제품 중 판매점에 재고가 없는 상품을 출력한다.
조건:
1) 재고가 없는 조건은 재고 수량이 0이거나 null을 의미한다.
2) null인 경우 “0” 표시 한다.
2. 구현 클래스
Package명 클래스명 메소드 설명
workshop Test01 +main(String args[]):void main 함수 안에서 모든 코드 작업 진행
*/
public class Test01 {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		String sql = "select product.pdname, product.pdsubname, factory.facname, store.stoname, store.stamount"
				+ " from product inner join factory on product.factno = factory.factno inner join store on product.pdno = store.pdno"
				+ " where stamount = 0 and facloc = 'SEOUL'";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@127.0.0.1:1521:xe", "credu", "credu");
			
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			System.out.println("제품카테고리\t제품명   \t공장명  \t\t\t판매점명\t판매점재고수량");
			System.out.println("----------------------------------------------------------------------------------------------------------");
			
			while (rs.next()) {
				System.out.print(rs.getString(1)+"     \t");
				System.out.print(rs.getString(2)+"  \t");
				System.out.print(rs.getString(3)+"     \t");
				System.out.print(rs.getString(4)+"     \t");
				System.out.println(rs.getInt(5));
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
