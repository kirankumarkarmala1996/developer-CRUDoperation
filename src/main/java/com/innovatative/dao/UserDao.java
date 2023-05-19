package com.innovatative.dao;

import java.util.List;

import com.innovatative.model.User;

public interface UserDao {

	public void save();

	public void update();

	public void create();

	public void delete();

	// Genarics
	List<User> findAll();

}
