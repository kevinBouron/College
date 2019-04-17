package org.collegeServeur.dao;

import java.util.List;

import org.collegeServeur.entities.Matiere;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("daoMatiere")
public class DAOMatiere implements IDAOMatiere {
	
	@Autowired
	private SessionFactory sessionFactory;

	public void create(Matiere t) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().merge(t);
	}

	public void update(Matiere t) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().update(t);
	}

	public void delete(Matiere t) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().delete(t);
	}

	public List<Matiere> display() {
		return sessionFactory.getCurrentSession().createQuery("from Matiere").list();
	
	}

	public Matiere getById(int id) {
		// TODO Auto-generated method stub
		return (Matiere) sessionFactory.getCurrentSession().get(Matiere.class, id);
	}


}
