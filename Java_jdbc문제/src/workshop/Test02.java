package workshop;
/*
��ǰī�װ��� ��TV���� ��ǰ �� ���� �� �ͺ��� ��� ��� ��ǰ��,
��ǰī�װ��� ��CELLPHONE���� ��ǰ �� ���� ��� ��ǰ���� �� ��� ��ǰ�� ����Ѵ�.
����:
1) UNION�� ������� �ʰ� �ϳ��� ���� �������� �ۼ� �Ѵ�.
2) ��ǰ������ �������� �Ѵ�.
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
			System.out.println("��ǰ�� \t ��ǰ���� \t ��ǰ����");
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
