package com.user;

import java.sql.Connection;
import java.util.ArrayList;


import com.frame.Biz;
import com.vo.Item;
import com.vo.User;

public class UserBiz extends Biz<User, String> {
	UserDao dao;
	
	public UserBiz() {
		dao = new UserDao();
	}
	//�����Է�------------------------------------------------------
	@Override
	public void register(User o) throws Exception {
		Connection conn = getConnection();
		try {
			// User ������ �Է�
			dao.insert(o, conn);
			// Item ���� �Է�
			dao.insertItem(o.getItems(), conn);
			// User �� ���� �ϰ� �ִ� Item ���� �Է�
			dao.insertUserItem(o, conn);
			conn.commit();
		}catch(Exception e) {
			conn.rollback();
			throw e;
		}finally {
			close(conn);
		}
	}
	//�����Է�------------------------------------------------------
	@Override
	public void remove(String i) throws Exception {
		// TODO Auto-generated method stub
		
	}
	//�����Է�------------------------------------------------------
	@Override
	public void modify(User o) throws Exception {
		// TODO Auto-generated method stub
		
	}
	//�����Է�------------------------------------------------------
	@Override
	public User get(String i) throws Exception {
		// �Է� �� ID�� User���� ��ȸ
		// �Է� �� ID�� UserItem�� ��ȸ �Ѵ�.
		// Item�� ������ User���� setting �Ѵ�.
		// User ������ ���� �Ѵ�.
		Connection conn = getConnection();
		User user = null;
		ArrayList<Item> items = null;
		try {
			user = dao.select(i, conn);
			items = dao.getItems(i, conn);
			user.setItems(items);
		}catch(Exception e) {
			throw e;
		}finally {
			close(conn);
		}
		return user;
	}
	//�����Է�------------------------------------------------------
	@Override
	public ArrayList<User> get() throws Exception {
		// ��� User ������ ��ȸ �Ѵ�.
		// ������ User�� ID�� �̿��Ͽ� User Item ������
		// ��ȸ �Ѵ�.
		// ������ User���� Item ������ Setting �Ѵ�.
		// ArrayList ������ ���� �Ѵ�.
		Connection conn = getConnection();
		ArrayList<User> users = null;
		ArrayList<Item> items = null;
		try {
			users = dao.select(conn);
			for(User user: users) {
				items = dao.getItems(user.getId(), conn);
				user.setItems(items);
			}
		}catch(Exception e) {
			throw e;
		}finally {
			close(conn);
		}
		return users;
	}

}





