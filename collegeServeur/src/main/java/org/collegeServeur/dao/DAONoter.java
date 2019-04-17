package org.collegeServeur.dao;

import org.collegeServeur.entities.Noter;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("daoNoter")
public class DAONoter implements IDAONoter {
	
	@Autowired
	private SessionFactory sessionFactory;


}
