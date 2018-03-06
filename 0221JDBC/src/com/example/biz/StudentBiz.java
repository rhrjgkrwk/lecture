package com.example.biz;

import static com.example.template.JdbcTemplate.*;
import java.sql.Connection;
import java.sql.SQLException;
import com.example.dao.StudentDao;
import com.example.entity.StudentEntity;
import com.example.view.StudentView;

/*
+insertStudent(entity:StudentEntity):void
+getStudent(name:String):void
+getStudentList():void
*/
public class StudentBiz {
	//여기서 커넥션
	//들어온 kor,eng,mat값중 0~100사이의 점수가 아니면 오류리턴
	Connection conn=null;
	StudentDao dao=null;
	StudentView view=null;
	public StudentBiz() {
		// TODO Auto-generated constructor stub
		dao = new StudentDao();
		view = new StudentView();
	}
	public void insertStudent(StudentEntity entity){
		int kor = entity.getKor();
		int eng = entity.getEng();
		int mat = entity.getMat();
		if (kor>=0&&kor<=100&&eng>=0&&eng<=100&&mat>=0&&mat<=100) {
			conn = getConnection();
			if (isConnection(conn)) {
				try {
					view.insertStudent(dao.insertStudent(conn, entity));
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					System.out.println("추가실패");
					e.printStackTrace();
				}
			}
			else {
				System.out.println("DB 연결실패");
			}
			close(conn);
		}
		else {
			System.out.println("잘못된 점수이다.(0-100)");
		}
	}
	public void getStudent(String name){
		conn = getConnection();
		if (isConnection(conn)) {
			try {
				view.getStudent(dao.getStudent(conn, name));
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else {
			System.out.println("DB 연결실패");
		}
		close(conn);
	}
	public void getStudentList(){
		conn = getConnection();
		if (isConnection(conn)) {
			try {
				view.getStudentList(dao.getStudentList(conn));
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println("가져오기 실패");
				e.printStackTrace();
			}
		}
		else {
			System.out.println("DB 연결실패");
		}
		close(conn);
	}
}
