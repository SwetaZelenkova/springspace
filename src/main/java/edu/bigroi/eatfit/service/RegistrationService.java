package edu.bigroi.eatfit.service;

import java.util.List;

public interface RegistrationService {

	public boolean checkUser(User user);

	public boolean checkLogin(String login);

	public boolean checkPassword(String password);

	public boolean isExistLogin(String login);

	public void save(User user);

	public void update(User user);

	public List<User> getAllUsers();
}
