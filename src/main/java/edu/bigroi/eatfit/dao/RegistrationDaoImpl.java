package edu.bigroi.eatfit.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import edu.bigroi.eatfit.service.entities.User;

@Repository("registrationDao")
@Transactional
public class RegistrationDaoImpl extends AbstractDao<User, Long> implements RegistrationDao {

	public RegistrationDaoImpl(SessionFactory sessionFactory) {
		super(sessionFactory);
	}

	@Override
	public boolean checkUser(User user) {
		String hql = "from user as u where u.login =  ? and u.password = ?";
		Query query = createHQLQuery(hql);
		query.setParameter(0, user.getLogin());
		query.setParameter(1, user.getPassword());
		if (query.uniqueResult() != null) {
			return true;
		}
		return false;
	}

	@Override
	public boolean isExistLogin(String login) {
		String hql = "from user as u where u.login =  ?";
		Query query = createHQLQuery(hql);
		query.setParameter(0, login);
		if (query.uniqueResult() != null) {
			return true;
		}
		return false;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<User> getAll() {
		return createHQLQuery("from user").list();
	}

	@Override
	public User get(Long id) {
		return (User) createHQLQuery("from user where id = ?").setParameter(0, id).uniqueResult();
	}

	@Override
	public void deleteById(Long id) {
		delete(get(id));
	}
}
