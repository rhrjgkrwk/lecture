package com.example.biz;

import java.sql.Connection;
import java.util.List;

import com.example.dao.StudentDao;
import com.example.entity.StudentEntity;
import com.example.view.StudentView;
import static com.example.template.JdbcTemplate.getConnection;
import static com.example.template.JdbcTemplate.close;

public class StudentBiz {
	Connection conn=null;
	StudentDao dao=null;
	StudentView view=null;
	
	public StudentBiz(){
			dao=new StudentDao();
			view=new StudentView();
	}
	//추가하기------------------------------------------------
	public void insertStudent(StudentEntity entity){
//			conn=JdbcTemplate.getConnection();
//			JdbcTemplate.close(conn);
		
			conn = getConnection();
			String name=null;
			
			//유효성 검사 후 dao로 전송
			if(entity.getKor()<=100 && entity.getKor()>=0
					&& entity.getEng()<=100 && entity.getEng()>=0
					&& entity.getMat()<=100 && entity.getMat()>=0){
				name=dao.insertStudent(entity, conn);
			}
			close(conn);
			
			//결과 출력
			view.insertStudent(name);
	}
	//1건 데이터 보기---------------------------------------
	public void getStudent(String name){
		conn=getConnection();
		StudentEntity entity=dao.getStudent(name,conn);
		close(conn);
		
		//결과출력
		view.getStudent(entity);		
	}
	//전체보기----------------------------------------------
	public void getStudentList(){
		conn=getConnection();
		List<StudentEntity> list=dao.getStudentList(conn);
		close(conn);
		
		//결과출력
		view.getStudentList(list);		
	}
}



