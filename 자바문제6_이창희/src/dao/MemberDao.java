package dao;
/*
MemberDAO ,commit,rollback
getMemberList(conn:Connection):ArrayList<MemberVo>      ==> 전체보기
getMember(conn:Connection,irum:String):MemberVo            ==> 찾기
insertMember(conn:Connection,ob:MemberVo):int                ==> 추가
deleteMember(conn:Connection,irum:String):int                    ==> 삭제 
*/

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static common.JdbcTemplate.*;
import vo.MemberVo;

public class MemberDao {
	public int insertMember(Connection conn, MemberVo ob){ //return inserted name 
		PreparedStatement pstmt = null;
		String sql = "insert into member(idx, name, phone) values(n_sql.nextval,?,?)";
		int n=0;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, ob.getName());
			pstmt.setString(2, ob.getPhone());
			n = pstmt.executeUpdate();
			if (n>0) {
				commit(conn);
			}
		} catch (SQLException e) {
			rollback(conn);
			e.printStackTrace();
		}finally {
			close(conn);
		}
		return n;
	}
	
	public int deleteMember(Connection conn, String irum){
		PreparedStatement pstmt = null;
		String sql = "delete from member where name = ?";
		int n=0;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, irum);
			n = pstmt.executeUpdate();
			if (n>0) {
				commit(conn);
			}
		} catch (SQLException e) {
			rollback(conn);
			e.printStackTrace();
		}finally {
			close(conn);
		}
		return n;
	}
	
	public MemberVo getMember(Connection conn, String irum){
		ResultSet rs = null;
		PreparedStatement pstmt = null;
		String sql = "select * from member where name = ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, irum);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				return new MemberVo(rs.getInt(1), rs.getString(2),rs.getString(3));
			}
		} catch (SQLException e) {
			rollback(conn);
			e.printStackTrace();
		}finally {
			close(conn);
		}
		return null;
	}
	
	public List<MemberVo> getMemberList(Connection conn){
		ResultSet rs = null;
		PreparedStatement pstmt = null;
		List<MemberVo> list = new ArrayList<>();
		String sql = "select * from member";
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				list.add(new MemberVo(rs.getInt(1), rs.getString(2),rs.getString(3)));
			}
		} catch (SQLException e) {
			rollback(conn);
			e.printStackTrace();
		}finally {
			close(conn);
		}
		return list;
	}
	
}
