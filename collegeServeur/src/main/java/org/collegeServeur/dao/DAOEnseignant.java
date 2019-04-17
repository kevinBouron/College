package org.collegeServeur.dao;

import java.util.List;

import org.collegeServeur.entities.Enseignant;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;



@Repository("daoEnseignant")
public class DAOEnseignant implements IDAOEnseignant{
	
	@Autowired
	private SessionFactory sessionFactory;

	
	
	
	public void create(Enseignant t) {
		sessionFactory.getCurrentSession().merge(t);
		
	}

	public void update(Enseignant t) {
		sessionFactory.getCurrentSession().update(t);
		
	}

	public void delete(Enseignant t) {
		sessionFactory.getCurrentSession().delete(t);
		
	}

	public List<Enseignant> display() {
		
		return sessionFactory.getCurrentSession().createQuery("from Enseignant ens").list();
	}

	public Enseignant GetById(int id) {
		
		return (Enseignant) sessionFactory.getCurrentSession().get(Enseignant.class, id);
	}

}
