package biz;

import java.sql.Connection;
import java.util.List;

import dao.MemberDao;
import view.MemberView;
import vo.MemberVo;

import static common.JdbcTemplate.*;

/*
MemberBiz : connection, close처리를 한다

getMemberList():ArrayList<MemberVo>      
getMember(irum:String):MemberVo            
insertMember(ob:MemberVo):int                
deleteMember(irum:String):int 
*/
public class MemberBiz {
	Connection conn = null;
	MemberDao dao = null;
	MemberView view = null;
	public MemberBiz() {
		dao = new MemberDao();
		view = new MemberView();
	}
	
	public int insertMember(MemberVo ob){ //return inserted name 
		conn = getConnection();
		int n = dao.insertMember(conn, ob); 
		view.insertMember(n);
		close(conn);
		return n;
	}
	
	public int deleteMember(String irum){
		conn = getConnection();
		int n = dao.deleteMember(conn, irum); 
		view.deleteMember(n);
		close(conn);
		return 0;
	}
	
	public MemberVo getMember(String irum){
		conn = getConnection();
		view.getMember(dao.getMember(conn, irum));
		close(conn);
		return null;
	}
	
	public List<MemberVo> getMemberList(){
		conn = getConnection();
		List<MemberVo> list = dao.getMemberList(conn); 
		view.getMemberList(list);
		close(conn);
		return null;
	}
	
}
