package com.example.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.example.entity.StudentEntity;
import static com.example.template.JdbcTemplate.*;

/*
+insertStudent(entity:StudentEntity):String
+getStudent(name:String):StudentEntity
+getStudentList():List<StudentEntity>
*/
public class StudentDao {
	public String insertStudent(Connection conn, StudentEntity entity) throws SQLException{
		PreparedStatement pstmt = null;
		String name = null;
		String sql = "INSERT INTO STUDENT(NUM,NAME,KOR,ENG,MAT) VALUES(N_SQL.NEXTVAL,?,?,?,?)";
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, entity.getName());
		pstmt.setInt(2, entity.getKor());
		pstmt.setInt(3, entity.getEng());
		pstmt.setInt(4, entity.getMat());
		int n = pstmt.executeUpdate();
		if (n>0) {
			name = entity.getName();
			commit(conn);
		}
		else {
			rollback(conn);
		}
		close(pstmt);
		return name;
	}
	public StudentEntity getStudent(Connection conn, String name) throws SQLException{
		StudentEntity entity = null;
		ResultSet rs = null;
		PreparedStatement pstmt = null;
		String sql = "select * from student where name=?";
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, name);
		rs = pstmt.executeQuery();
		if (rs.next()) {
			entity = new StudentEntity(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getInt(4),rs.getInt(5));
		}
		close(rs);
		close(pstmt);
		return entity;
	}
	public List<StudentEntity> getStudentList(Connection conn) throws SQLException{
		 List<StudentEntity> list = new ArrayList<>();
		ResultSet rs = null;
		PreparedStatement pstmt = null;
		String sql = "select * from student";
		pstmt = conn.prepareStatement(sql);
		rs = pstmt.executeQuery();
		while (rs.next()) {
			list.add(new StudentEntity(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getInt(4),rs.getInt(5)));
		}
		close(rs);
		close(pstmt);
		return list;
	}
}
