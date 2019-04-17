package org.collegeServeur.dao;

import org.collegeServeur.entities.College;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;



@Repository("daoCollege")
public class DAOCollege implements ICRUD<College>{
	
	@Autowired
	private SessionFactory sessionFactory;

}
