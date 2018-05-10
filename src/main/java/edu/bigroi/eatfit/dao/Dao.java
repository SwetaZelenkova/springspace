package edu.bigroi.eatfit.dao;

import java.util.List;

import edu.bigroi.eatfit.service.entities.Entity;

public interface Dao<E extends Entity, ID extends Number> {

	void save(E entity);

	void update(E entity);

	void delete(E entity);

	E get(ID id);

	List<E> getAll();

}
