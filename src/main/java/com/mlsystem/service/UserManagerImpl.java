package com.mlsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mlsystem.dao.UserDAO;
import com.mlsystem.entity.Person;

@Service
public class UserManagerImpl implements UserManager {

	@Autowired
	private UserDAO userDAO;
	
	@Override
	@Transactional
	public void insertUser(Person user) {
		userDAO.insertUser(user);
	}

	@Override
	@Transactional
	public Person getUserById(int userId) {
		return userDAO.getUserById(userId);
	}
	
	@Override
	@Transactional
	public Person getUser(String username) {
		return userDAO.getUser(username);
	}

	@Override
	@Transactional
	public List<Person> getUsers() {
		return userDAO.getUsers();
	}

}
