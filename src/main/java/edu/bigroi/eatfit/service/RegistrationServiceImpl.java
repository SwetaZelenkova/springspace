package edu.bigroi.eatfit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.bigroi.eatfit.dao.RegistrationDao;
import edu.bigroi.eatfit.service.entities.User;

@Service
@Transactional
public class RegistrationServiceImpl implements RegistrationService {

	@Autowired
	private RegistrationDao registrationDao;

	@Override
	public boolean checkUser(User user) {
		return registrationDao.checkUser(user);
	}

	/*
	 * public boolean checkPassword(String password) { final Pattern pattern =
	 * Pattern.compile("[A-Za-z_0-9]{8,20}"); final Matcher matcher =
	 * pattern.matcher(password.trim());
	 * 
	 * if (!matcher.find()) { return false; } return true; }
	 * 
	 * public boolean checkLogin(String login) { final Pattern pattern =
	 * Pattern.compile("^[A-Za-z_0-9.%+\\-]+@[A-Za-z0-9.\\-]+\\.[A-Za-z]{2,4}");
	 * final Matcher matcher = pattern.matcher(login.trim()); if (!matcher.find()) {
	 * return false; } return true; }
	 */

	@Override
	public boolean isExistLogin(String login) {
		return registrationDao.isExistLogin(login);
	}

	@Override
	public void save(User user) {
		registrationDao.save(user);
	}

	@Override
	public void update(User user) {
		registrationDao.update(user);
	}

	@Override
	public void delete(User user) {
		registrationDao.delete(user);
	}

	@Override
	public List<User> getAll() {
		return registrationDao.getAll();
	}

	@Override
	public User get(Long id) {
		return registrationDao.get(id);
	}

	@Override
	public void deleteById(Long id) {
		registrationDao.deleteById(id);
	}

}
