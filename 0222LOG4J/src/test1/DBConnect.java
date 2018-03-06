package test1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.log4j.Logger;

public class DBConnect {
	Connection conn=null;
	Logger logger = Logger.getLogger(getClass());
	public DBConnect(){
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");   // 1. ����̹� �ε�
			conn=DriverManager.getConnection(
					              "jdbc:oracle:thin:@127.0.0.1:1521:xe", 
					              "credu", "credu");
			System.out.println("ok");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} 
	}
	//---------------------------------------------------------
	public void dbClose(){
		try{
			if(conn != null) conn.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
	//---------------------------------------------------------
	public void addressList(){
		PreparedStatement pstmt=null;
		ResultSet rs=null;         // 4. ����� ��ȯ
		
		try{
			String sql="SELECT * FROM ADDRESSBOOK ORDER BY NUM DESC";
			
			pstmt=conn.prepareStatement(sql);
			logger.info(sql);
			
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
	//--------------------------------------------------------------
	public void addressInsert(String name, String phone, String addr) {
		Statement pstmt=null;  // 3. SQL�� ����
		try{
			String sql="INSERT INTO ADDRESSBOOK(NUM,NAME,PHONE,ADDR) VALUES(NUM_SEQ.NEXTVAL,'" 
		              + name + "','" + phone + "','" + addr +"')";
			//System.out.println("����:" + sql);
			logger.info("INSERT QUERY : "+sql);
			pstmt=conn.createStatement();  //conn�� pstmt�� ����
			int n=pstmt.executeUpdate(sql);
			
			if(n > 0){
				conn.commit();
				System.out.println("1�� �߰���");
			}
		}catch(SQLException e){
			try{
				conn.rollback();
			}catch(SQLException e1){}
		}finally{
			try{
				if(pstmt != null) pstmt.close();
			}catch(SQLException e){}
		}
	}
	
	/*public void addressInsert(String name, String phone, String addr) {
		PreparedStatement pstmt=null;  // 3. SQL�� ����
		try{
			String sql="INSERT INTO ADDRESSBOOK(NUM,NAME,PHONE,ADDR) VALUES(NUM_SEQ.NEXTVAL,?,?,?)";
			pstmt=conn.prepareStatement(sql);  //conn�� pstmt�� ����
			pstmt.setString(1, name);
			pstmt.setString(2, phone);
			pstmt.setString(3,addr);
			int n=pstmt.executeUpdate();
			if(n > 0){
				conn.commit();
				System.out.println("1�� �߰���");
			}
		}catch(SQLException e){
			try{
				conn.rollback();
			}catch(SQLException e1){}
		}finally{
			try{
				if(pstmt != null) pstmt.close();
			}catch(SQLException e){}
		}
	}*/
	//----------------------------------------------------------------
	public void addressUpdate(int num, String phone, String addr) {
		PreparedStatement pstmt=null;  // 3. SQL�� ����
		try{
			String sql="UPDATE ADDRESSBOOK SET PHONE=?,ADDR=?  WHERE NUM=?";
			logger.info("UPDATE QUERY : "+sql);
			pstmt=conn.prepareStatement(sql);  //conn�� pstmt�� ����
			pstmt.setString(1, phone);
			pstmt.setString(2, addr);
			pstmt.setInt(3,num);
			int n=pstmt.executeUpdate();
			if(n > 0){
				conn.commit();
				System.out.println("1�� ������");
			}
		}catch(SQLException e){
			try{
				conn.rollback();
			}catch(SQLException e1){}
		}finally{
			try{
				if(pstmt != null) pstmt.close();  // 5.���ᰴü����
			}catch(SQLException e){}
		}
	}
	//------------------------------------------------------------
	public void addressDelete(int num) {
		PreparedStatement pstmt=null;  // 3. SQL�� ����
		try{
			String sql="DELETE FROM ADDRESSBOOK  WHERE NUM=?";
			logger.info("DELETE QUERY : "+sql);
			pstmt=conn.prepareStatement(sql);  //conn�� pstmt�� ����
			pstmt.setInt(1,num);
			int n=pstmt.executeUpdate();
			if(n > 0){
				conn.commit();
				System.out.println("������");
			}
		}catch(SQLException e){
			try{
				conn.rollback();
			}catch(SQLException e1){}
		}finally{
			try{
				if(pstmt != null) pstmt.close();  // 5.���ᰴü����
			}catch(SQLException e){}
		}		
	}
}





