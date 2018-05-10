package edu.bigroi.eatfit.service;

import java.util.List;

import edu.bigroi.eatfit.service.entities.User;

public interface RegistrationService {

	boolean checkUser(User user);

	boolean isExistLogin(String login);

	void save(User user);

	void update(User user);

	void delete(User user);

	void deleteById(Long id);

	User get(Long id);

	List<User> getAll();
}
