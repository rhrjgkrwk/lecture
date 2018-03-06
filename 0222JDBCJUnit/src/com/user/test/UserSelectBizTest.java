package com.user.test;

import java.util.ArrayList;

import org.junit.Test;

import com.frame.Biz;
import com.user.UserBiz;
import com.vo.User;

public class UserSelectBizTest {
	//@Test
	public void testGetString(){
		UserBiz biz = new UserBiz();
		ArrayList<User> users = null;
		try {
			users = biz.get();
			for (User u : users) {
				System.out.println(u);
				System.out.println(u.getItems());
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	@Test
	public void testGetUser(){
		UserBiz biz = new UserBiz();
		User user = null;
		try {
			user = biz.get("id01");
			System.out.println(user);
			System.out.println(user.getItems());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
