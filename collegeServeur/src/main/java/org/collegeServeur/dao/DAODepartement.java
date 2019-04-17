package org.collegeServeur.dao;

import org.collegeServeur.entities.Departement;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository("daoDepartement")
public class DAODepartement implements IDAODepartement{
	
	@Autowired
	private SessionFactory sessionFactory;

}
