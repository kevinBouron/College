package org.collegeServeur.dao;

import org.collegeServeur.entities.Departement;

public interface IDAODepartement extends ICRUD<Departement>{
	
	public Departement getById(int id);
	

}
