package com.example.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.example.entity.StudentEntity;
import static com.example.template.JdbcTemplate.close;
import static com.example.template.JdbcTemplate.commit;
import static com.example.template.JdbcTemplate.rollback;

public class StudentDao {
	public String insertStudent(StudentEntity entity, Connection conn){
		PreparedStatement pstmt=null;
		String name=null;
		
		String sql="INSERT INTO STUDENT(NUM,NAME,KOR,ENG,MAT) VALUES(N_SQL.NEXTVAL,?,?,?,?)";                           
		int n=0;
		try{
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, entity.getName());
			pstmt.setInt(2, entity.getKor());
			pstmt.setInt(3, entity.getEng());
			pstmt.setInt(4, entity.getMat());
			n=pstmt.executeUpdate();
			if(n > 0){
				name=entity.getName();
				commit(conn);
			}
		}catch(SQLException e){
			e.printStackTrace();
			rollback(conn);
		}finally{
			close(pstmt);
		}
		return name;
	}
	//---------------------------------------------------
	public StudentEntity getStudent(String name, Connection conn){
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		
		StudentEntity entity=null;
		String sql="SELECT * FROM STUDENT WHERE NAME=?";
		try{
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, name);
			rs=pstmt.executeQuery();
			
			while(rs.next()){
				entity=new StudentEntity();
				entity.setNum(rs.getInt("NUM"));
				entity.setName(rs.getString("NAME"));
				entity.setKor(rs.getInt("KOR"));
				entity.setEng(rs.getInt("ENG"));
				entity.setMat(rs.getInt("MAT"));
				entity.setTot(entity.getKor()+entity.getEng()+entity.getMat());
				entity.setAvg(entity.getTot()/3);
			}
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			close(rs);
			close(pstmt);
		}
		return entity;
	}
	//---------------------------------------------------
	public List<StudentEntity> getStudentList(Connection conn){
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		
		List<StudentEntity> list=new ArrayList<>();
		StudentEntity entity=null;
		String sql="SELECT * FROM STUDENT";
		try{
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			
			while(rs.next()){
				entity=new StudentEntity();
				entity.setNum(rs.getInt("NUM"));
				entity.setName(rs.getString("NAME"));
				entity.setKor(rs.getInt("KOR"));
				entity.setEng(rs.getInt("ENG"));
				entity.setMat(rs.getInt("MAT"));
				entity.setTot(entity.getKor()+entity.getEng()+entity.getMat());
				entity.setAvg(entity.getTot()/3);
				list.add(entity);
			}
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			close(rs);
			close(pstmt);
		}
		return list;
	}
}







