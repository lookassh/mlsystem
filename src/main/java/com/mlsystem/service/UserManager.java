package com.mlsystem.service;

import java.util.List;

import com.mlsystem.entity.Person;

public interface UserManager {

	void insertUser(Person user);
	
	Person getUserById(int userId);
	
	Person getUser(String username);
	
	List<Person> getUsers();
}
