package org.collegeServeur.dao;

import java.util.List;

public interface ICRUD <T> {

	public void create(T t);
	public void update(T t);
	public void delete(T t);
	public List<T> display();
}
