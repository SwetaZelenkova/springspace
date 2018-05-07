package edu.bigroi.eatfit.dao;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import edu.bigroi.eatfit.service.User;

@Repository("registrationDao")
@Transactional
public class RegistrationDaoImpl implements RegistrationDao {

	// @Autowired
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	@Resource(name = "sessionFactory")
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public boolean checkUser(User user) {
		String hql = "from user as u where u.login =  ? and u.password = ?";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
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
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		query.setParameter(0, login);
		if (query.uniqueResult() != null) {
			return true;
		}
		return false;
	}

	@Override
	public void save(User user) {
		sessionFactory.getCurrentSession().save(user);
	}

	@Override
	public void update(User user) {
		sessionFactory.getCurrentSession().update(user);
	}

	@SuppressWarnings("unchecked")
	@Transactional(readOnly = true)
	@Override
	public List<User> getAllUsers() {
		return sessionFactory.getCurrentSession().createQuery("from user").list();
	}

}
