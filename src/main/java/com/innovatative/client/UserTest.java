package com.innovatative.client;

import java.util.List;

import com.innovatative.dao.UserDao;
import com.innovatative.dao.UserDaoImpl;
import com.innovatative.model.User;

public class UserTest {
	public static void main(String[] args) {
		UserDao dao = new UserDaoImpl();
//		dao.save();
//		dao.update();
//		dao.create();
//		dao.delete();
//		fn+alt+down(or)up arrow button: to move the line up or down
		System.out.print(dao.findAll());
//		
		
		
	}	

}
