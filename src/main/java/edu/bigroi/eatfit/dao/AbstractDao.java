package edu.bigroi.eatfit.dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class AbstractDao<Object, ID extends Number> {

	private SessionFactory sessionFactory;

	@Autowired
	public AbstractDao(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	public Query createSQLQuery(String sql) {
		return getSession().createSQLQuery(sql);
	}

	public Query createHQLQuery(String hql) {
		return getSession().createQuery(hql);
	}

	public void save(Object entity) {
		getSession().save(entity);
	}

	public void update(Object entity) {
		getSession().update(entity);
	}

	public void delete(Object entity) {
		getSession().delete(entity);
	}
}
