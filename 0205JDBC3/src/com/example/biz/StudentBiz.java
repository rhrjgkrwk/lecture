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
	//�߰��ϱ�------------------------------------------------
	public void insertStudent(StudentEntity entity){
//			conn=JdbcTemplate.getConnection();
//			JdbcTemplate.close(conn);
		
			conn = getConnection();
			String name=null;
			
			//��ȿ�� �˻� �� dao�� ����
			if(entity.getKor()<=100 && entity.getKor()>=0
					&& entity.getEng()<=100 && entity.getEng()>=0
					&& entity.getMat()<=100 && entity.getMat()>=0){
				name=dao.insertStudent(entity, conn);
			}
			close(conn);
			
			//��� ���
			view.insertStudent(name);
	}
	//1�� ������ ����---------------------------------------
	public void getStudent(String name){
		conn=getConnection();
		StudentEntity entity=dao.getStudent(name,conn);
		close(conn);
		
		//������
		view.getStudent(entity);		
	}
	//��ü����----------------------------------------------
	public void getStudentList(){
		conn=getConnection();
		List<StudentEntity> list=dao.getStudentList(conn);
		close(conn);
		
		//������
		view.getStudentList(list);		
	}
}



