package org.collegeServeur.dao;


import java.util.List;

import org.collegeServeur.entities.College;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;



@Repository("daoCollege")
public class DAOCollege implements IDAOCollege{
	
	@Autowired
	private SessionFactory sessionFactory;

	public void create(College t) {
		sessionFactory.getCurrentSession().merge(t);
		
	}

	public void update(College t) {
		sessionFactory.getCurrentSession().update(t);
		
	}

	public void delete(College t) {
		sessionFactory.getCurrentSession().delete(t);
		
	}

	public List<College> display() {
		
		return sessionFactory.getCurrentSession().createQuery("from College c").list();
	}

	public College getById(int id) {
		
		return (College) sessionFactory.getCurrentSession().get(College.class, id);
	}

	
}
