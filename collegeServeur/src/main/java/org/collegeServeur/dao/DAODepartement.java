package org.collegeServeur.dao;

import java.util.List;

import org.collegeServeur.entities.Departement;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository("daoDepartement")
public class DAODepartement implements IDAODepartement{
	
	@Autowired
	private SessionFactory sessionFactory;

	public void create(Departement t) {
		sessionFactory.getCurrentSession().merge(t);
		
	}

	public void update(Departement t) {
		sessionFactory.getCurrentSession().update(t);
		
	}

	public void delete(Departement t) {
		sessionFactory.getCurrentSession().delete(t);
		
	}

	public List<Departement> display() {
		
		return sessionFactory.getCurrentSession().createQuery("from Departement d").list();
	}

	public Departement getById(int id) {
		
		return (Departement) sessionFactory.getCurrentSession().get(Departement.class, id);
	}

}
