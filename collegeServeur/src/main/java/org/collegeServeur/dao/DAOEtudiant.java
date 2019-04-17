package org.collegeServeur.dao;

import org.collegeServeur.entities.Etudiant;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;



@Repository("daoEtudiant")
public class DAOEtudiant implements IDAOEtudiant {
	@Autowired
	private SessionFactory sessionFactory;

}
