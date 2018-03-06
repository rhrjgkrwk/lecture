import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBCon {
	Connection conn = null;
	public DBCon(){
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); //classNotFoundException �߸� ö�� Ȯ�� --> JRE Ȯ��
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","credu","credu");
			System.out.println("������~~~");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	///////////////////////////////////////////////////////////////////////////////////////////////
	public void addressList(){
		PreparedStatement pstmt=null;
		ResultSet rs=null;         // 4. ����� ��ȯ
		
		try{
			String sql="SELECT * FROM ADDRESSBOOK ORDER BY NUM ASC";
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			
			while(rs.next())
			{                    // rs.getInt("�÷���")   or  rs.getInt(����)   
				System.out.print(rs.getInt("NUM") + "\t");         //or    rs.getInt(1)
				System.out.print(rs.getString("NAME") + "\t");     //or    rs.getString(2)
				System.out.print(rs.getString("PHONE") + "\t");
				System.out.println(rs.getString("ADDR"));
			}
			
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			try{
				if(rs != null) rs.close();       //5. ���ᰴü ����
				if(pstmt != null) pstmt.close();
			}catch(SQLException e){}
		}
	}
	
	public void closeConnection(){
		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void addressInsert(String name, String phone, String addr) {
		// TODO Auto-generated method stub
		Statement stmt=null; //���Ȼ� ���� �ʴ�. ������ preparedStatement�� ����.
		try {
			String sql = "INSERT INTO ADDRESSBOOK(num, name, phone, addr) VALUES(num_seq.nextval,'"+name+"','"+phone+"','"+addr+"')";
			System.out.println("���� : "+sql);
			stmt = conn.createStatement();
			int n = stmt.executeUpdate(sql); //�߰��� ������ ����
			if (n>0) {
				conn.commit();
				System.out.println("1�� �߰�");
			}
		} catch (SQLException e) {
			try {
				conn.rollback(); 
				//�����Ͱ� ����� ������Ʈ���� ���� ��� �ѹ� ó��
			} catch (SQLException e1) {
			}
		} finally {
			try {
				if (stmt!=null) {
					stmt.close();
				}
			} catch (SQLException e2) {}
		}
		//�̷��� commit / rollback ó���� Ʈ����� ó����� �Ѵ�.
		//(update, delete, insert�� ó������ ������ �Ϻ��ϰ� �ؾߵ�)
		
	}
	public void addressUpdate(int num, String phone, String addr) {
		// TODO Auto-generated method stub
		PreparedStatement pstmt=null;
		try {
			String sql = "UPDATE ADDRESSBOOK  SET phone=?, addr=? WHERE num=?";
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, phone);
			pstmt.setString(2, addr);
			pstmt.setInt(3, num);
			
			int n = pstmt.executeUpdate(); //������ ������ ����
			if (n>0) {
				conn.commit();
				System.out.println("1�� ����");
			}
		} catch (SQLException e) {
			try {
				conn.rollback(); 
				//�����Ͱ� ����� ������Ʈ���� ���� ��� �ѹ� ó��
			} catch (SQLException e1) {
			}
		} finally {
			try {
				if (pstmt!=null) {
					pstmt.close();
				}
			} catch (SQLException e2) {}
		}
	}
	public void addressDelete(int num) {
		// TODO Auto-generated method stub
				PreparedStatement pstmt=null;
				try {
					String sql = "DELETE FROM ADDRESSBOOK WHERE num=?";
					pstmt = conn.prepareStatement(sql);
					
					pstmt.setInt(1, num);
					
					int n = pstmt.executeUpdate(); //������ ������ ����
					if (n>0) {
						conn.commit();
						System.out.println("1�� ����");
					}
				} catch (SQLException e) {
					try {
						conn.rollback(); 
						//�����Ͱ� ����� ������Ʈ���� ���� ��� �ѹ� ó��
					} catch (SQLException e1) {
					}
				} finally {
					try {
						if (pstmt!=null) {
							pstmt.close();
						}
					} catch (SQLException e2) {}
				}
	}
}
