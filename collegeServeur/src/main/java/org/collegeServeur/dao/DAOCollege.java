package org.collegeServeur.dao;


import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;



@Repository("daoCollege")
public class DAOCollege implements IDAOCollege{
	
	@Autowired
	private SessionFactory sessionFactory;

}
