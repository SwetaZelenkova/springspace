package edu.bigroi.eatfit.dao;

import java.util.List;

import edu.bigroi.eatfit.service.User;

public interface RegistrationDao {

	boolean checkUser(User user);

	// boolean checkLogin(String login);

	// boolean checkPassword(String password);

	boolean isExistLogin(String login);

	void save(User user);

	void update(User user);

	List<User> getAllUsers();
}
