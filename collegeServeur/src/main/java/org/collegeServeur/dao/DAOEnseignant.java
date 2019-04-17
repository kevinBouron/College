package org.collegeServeur.dao;

import org.collegeServeur.entities.Enseignant;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;



@Repository("daoEnseignant")
public class DAOEnseignant implements ICRUD <Enseignant>{
	
	@Autowired
	private SessionFactory sessionFactory;

}
