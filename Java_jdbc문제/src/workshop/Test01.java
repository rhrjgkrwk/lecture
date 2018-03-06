package workshop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
��ǰ�� ����� ������ġ�� "SEOUL"�� ��ǰ �� �Ǹ����� ��� ���� ��ǰ�� ����Ѵ�.
����:
1) ��� ���� ������ ��� ������ 0�̰ų� null�� �ǹ��Ѵ�.
2) null�� ��� ��0�� ǥ�� �Ѵ�.
2. ���� Ŭ����
Package�� Ŭ������ �޼ҵ� ����
workshop Test01 +main(String args[]):void main �Լ� �ȿ��� ��� �ڵ� �۾� ����
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
			System.out.println("��ǰī�װ�\t��ǰ��   \t�����  \t\t\t�Ǹ�����\t�Ǹ���������");
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
