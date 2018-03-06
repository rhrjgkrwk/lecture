package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.model.Member;

public class MemberDao {
	private Connection con1;
	private Statement stmt;
	private ResultSet rs;
	private PreparedStatement pst;
	
	public boolean conn ()  {
		boolean result =false;
		
		try {
			Class.forName
			("oracle.jdbc.driver.OracleDriver");
			con1= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe",
					"hr","hr");   
			result =true;
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}   catch (Exception e) {
		
		}
				
		return result;
		
	}    
	
	public void close() {
		try {
			con1.close(); 
			stmt.close();
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public Member getMemberById(String id) throws SQLException {  //
		
		String sql1 = "select * from membership"
				+ " where id = ? " ;
		
		PreparedStatement pst 
		= con1.prepareStatement(sql1); 
		
		pst.setString(1, id);
		rs= pst.executeQuery();
		rs.next();
		return new Member(rs.getString(1),rs.getString(2),rs.getString(3),rs.getInt(4),rs.getString(5),rs.getString(6));
		
	}
	public boolean isDuplicate(String id) throws SQLException { //�ߺ�üũ
		String sql1 = "select count(*) from membership"
				+ " where id = ? " ;
		
		PreparedStatement pst 
		= con1.prepareStatement(sql1); 
		
		pst.setString(1, id);
		rs= pst.executeQuery();
		rs.next();
		int check = rs.getInt(1);
		if (check == 0) {
			return false;
			}
		else return true; 
	}
	
	public boolean loginCheck(String id, String pw) throws SQLException{   //�α���üũ. ���.
		if (isDuplicate(id)) { //id�� �ֳ�? ������ �ؿ�����!
			String sql1 = "select pw from membership"   //���� ������ ���̵�� ���� �Է��� pw �� ��ġ�ؾ����Ǵµ� �н����尡���´�. �ؿ� if ����
					+ " where id = ? " ;
			
			PreparedStatement pst 
			= con1.prepareStatement(sql1); 
			
			pst.setString(1, id);
			rs= pst.executeQuery();
			rs.next();
			
			if (rs.getString("pw").equals(pw)) { //�����. �׷��� �Է��� �н������ �ԷµǾ��ִ� ���������� ��? ���� Ʈ��!
				return true;
			}			//or ��not
			
		} return false;    //or not!
	}
	
	public boolean insertMember(Member member) throws SQLException{
		String sql1 = "insert into membership"
				+ " values (?,?,?,?,?,? ) ";
		
		PreparedStatement pst 
		= con1.prepareStatement(sql1); 
		
		pst.setString(1, member.getId());
		pst.setString(2, member.getPw());
		pst.setString(3, member.getnName());
		pst.setInt (4,  member.getAge());
		pst.setString(5, member.getRegid());
		pst.setString(6, member.getEmail());
		
		int check= pst.executeUpdate();
		if (check >0) { 			
			return true;	
		} else return false;
		
	}
	
}
