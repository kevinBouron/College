package org.collegeServeur.dao;

import org.collegeServeur.entities.Salle;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("daoSalle")
public class DAOSalle implements IDAOSalle{
	
	@Autowired
	private SessionFactory sessionFactory;


}
