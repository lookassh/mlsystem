package com.mlsystem.dao;

import java.util.List;

import com.mlsystem.entity.Person;

public interface UserDAO {

	void insertUser(Person user);
	
	Person getUserById(int userId);
	
	Person getUser(String username);
	
	List<Person> getUsers();
}
