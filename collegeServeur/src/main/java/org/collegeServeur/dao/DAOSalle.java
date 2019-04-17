package org.collegeServeur.dao;

import java.util.List;

import org.collegeServeur.entities.Salle;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("daoSalle")
public class DAOSalle implements IDAOSalle{
	
	@Autowired
	private SessionFactory sessionFactory;

	public void create(Salle t) {

		sessionFactory.getCurrentSession().merge(t);
		
	}

	public void update(Salle t) {

		sessionFactory.getCurrentSession().update(t);
		
	}

	public void delete(Salle t) {

		sessionFactory.getCurrentSession().delete(t);
		
	}

	public List<Salle> display() {

		return sessionFactory.getCurrentSession().createQuery("from Salle s").list();
	}


}
