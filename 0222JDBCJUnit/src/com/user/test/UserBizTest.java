package com.user.test;

import java.util.ArrayList;

import org.junit.Test;

import com.frame.Biz;
import com.user.UserBiz;
import com.vo.Item;
import com.vo.User;

public class UserBizTest {
	@Test
	public final void testRegisterUser(){ 
		Biz<User, String>biz = new UserBiz();
		ArrayList<Item> list  = new ArrayList<>();
		//list.add(new Item(100,"Į",1500));
		//list.add(new Item(200,"��",2000));
		list.add(new Item(300,"â",1700));
		User user = new User("id03","pwd03","�̼���");
		user.setItems(list);
		
		try {
			biz.register(user);
			System.out.println("�Է¼���");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
