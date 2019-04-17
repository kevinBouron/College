package org.collegeServeur.dao;

import org.collegeServeur.entities.Etudiant;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;



@Repository("daoEtudiant")
public class DAOEtudiant implements ICRUD<Etudiant> {
	@Autowired
	private SessionFactory sessionFactory;

}
