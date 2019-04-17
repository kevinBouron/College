package org.collegeServeur.dao;

import java.util.List;

import org.collegeServeur.entities.Personne;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("daoPersonne")
public class DAOPersonne implements IDAOPersonne {

	
	@Autowired
	private SessionFactory sessionFactory;

	public void create(Personne t) {

		sessionFactory.getCurrentSession().merge(t);
		
	}

	public void update(Personne t) {
				
		
		sessionFactory.getCurrentSession().update(t);
	}

	public void delete(Personne t) {

		sessionFactory.getCurrentSession().delete(t);
		
	}

	public List<Personne> display() {

		return sessionFactory.getCurrentSession().createQuery("from Personne p").list();
	}

}
