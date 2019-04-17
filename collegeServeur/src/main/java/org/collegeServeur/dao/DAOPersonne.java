package org.collegeServeur.dao;

import org.collegeServeur.entities.Personne;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("daoPersonne")
public class DAOPersonne implements IDAOPersonne {

	
	@Autowired
	private SessionFactory sessionFactory;

}
