package edu.bigroi.eatfit.dao;

import java.util.List;

import edu.bigroi.eatfit.service.entities.User;

public interface RegistrationDao {

	boolean checkUser(User user);

	boolean isExistLogin(String login);

	void save(User user);

	void update(User user);

	void delete(User user);

	List<User> getAll();

	User get(Long id);

	void deleteById(Long id);
}
