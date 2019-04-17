package org.collegeServeur.dao;

import org.collegeServeur.entities.Matiere;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("daoMatiere")
public class DAOMatiere implements IDAOMatiere {
	
	@Autowired
	private SessionFactory sessionFactory;


}
