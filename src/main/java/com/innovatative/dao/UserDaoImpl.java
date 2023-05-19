package com.innovatative.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.innovatative.model.User;
import com.innovatative.util.Connectionutil;

public class UserDaoImpl implements UserDao {
	private static Connection connection = null;
	private static Statement statement = null;
	private static ResultSet rs = null;

	public void save() {

		String insert_sql = "insert into  student(sid,name,fee,email) values(4,'kumar',24000.00,'aac@gmail.com')";
		try {
			connection = Connectionutil.openConnection();
			statement = connection.createStatement();
			int result = statement.executeUpdate(insert_sql);
			System.out.println(result + " inserted.....");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			Connectionutil.closeConnection(connection, statement);
		}
	}

	public void update() {

		String Update_Sql = "update student set name='kumar achari' where sid=2";
		try {
			connection = Connectionutil.openConnection();
			statement = connection.createStatement();
			int result = statement.executeUpdate(Update_Sql);
			System.out.println(result + "Updated..");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			Connectionutil.closeConnection(connection, statement);
		}
	}

	public void create() {
		String Create_Table = "create table mahesh(sid int (10) primary key,name varchar(50), fee double(10,3), email varchar(50))";
		try {
			connection = Connectionutil.openConnection();
			statement = connection.createStatement();
			int result = statement.executeUpdate(Create_Table);
			System.out.println(Create_Table + "Create_Table succesfully..........");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			Connectionutil.closeConnection(connection, statement);
		}

	}

	public void delete() {
		String delete_Query = "delete from  student  where sid=102";
		try {
			connection = Connectionutil.openConnection();
			statement = connection.createStatement();
			int result = statement.executeUpdate(delete_Query);
			System.out.println(delete_Query + "user delete successfully........... ");

		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			Connectionutil.closeConnection(connection, statement);
		}

	}

	public List<User> findAll() {

		List<User> users = new ArrayList<User>();
		String selectAll = "select * from student";

		try {
			connection = Connectionutil.openConnection();
			connection = Connectionutil.openConnection();
			statement = connection.createStatement();
			statement.executeQuery(selectAll);
			rs = statement.executeQuery(selectAll);

			while (rs.next()) {
				User user = new User();
				user.setSid(rs.getInt(1));
				user.setName(rs.getString(2));
				user.setFee(rs.getDouble(3));
				user.setEmail(rs.getString(4));
				users.add(user);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			Connectionutil.closeConnection(connection, statement, rs);
		}
		return users;
	}

}
