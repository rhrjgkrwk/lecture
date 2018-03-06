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
			Class.forName("oracle.jdbc.driver.OracleDriver"); //classNotFoundException 뜨면 철자 확인 --> JRE 확인
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","credu","credu");
			System.out.println("옦꼐이~~~");
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
		ResultSet rs=null;         // 4. 결과값 반환
		
		try{
			String sql="SELECT * FROM ADDRESSBOOK ORDER BY NUM ASC";
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			
			while(rs.next())
			{                    // rs.getInt("컬럼명")   or  rs.getInt(순번)   
				System.out.print(rs.getInt("NUM") + "\t");         //or    rs.getInt(1)
				System.out.print(rs.getString("NAME") + "\t");     //or    rs.getString(2)
				System.out.print(rs.getString("PHONE") + "\t");
				System.out.println(rs.getString("ADDR"));
			}
			
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			try{
				if(rs != null) rs.close();       //5. 연결객체 해제
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
		Statement stmt=null; //보안상 좋지 않다. 가급적 preparedStatement를 쓰자.
		try {
			String sql = "INSERT INTO ADDRESSBOOK(num, name, phone, addr) VALUES(num_seq.nextval,'"+name+"','"+phone+"','"+addr+"')";
			System.out.println("쿼리 : "+sql);
			stmt = conn.createStatement();
			int n = stmt.executeUpdate(sql); //추가된 개수를 리턴
			if (n>0) {
				conn.commit();
				System.out.println("1개 추가");
			}
		} catch (SQLException e) {
			try {
				conn.rollback(); 
				//데이터가 제대로 업데이트되지 않은 경우 롤백 처리
			} catch (SQLException e1) {
			}
		} finally {
			try {
				if (stmt!=null) {
					stmt.close();
				}
			} catch (SQLException e2) {}
		}
		//이러한 commit / rollback 처리를 트랜잭션 처리라고 한다.
		//(update, delete, insert는 처음부터 끝까지 완벽하게 해야됨)
		
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
			
			int n = pstmt.executeUpdate(); //수정된 개수를 리턴
			if (n>0) {
				conn.commit();
				System.out.println("1개 수정");
			}
		} catch (SQLException e) {
			try {
				conn.rollback(); 
				//데이터가 제대로 업데이트되지 않은 경우 롤백 처리
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
					
					int n = pstmt.executeUpdate(); //수정된 개수를 리턴
					if (n>0) {
						conn.commit();
						System.out.println("1개 삭제");
					}
				} catch (SQLException e) {
					try {
						conn.rollback(); 
						//데이터가 제대로 업데이트되지 않은 경우 롤백 처리
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
