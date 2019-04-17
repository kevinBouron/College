package org.collegeServeur.dao;


import org.collegeServeur.entities.Noter;

public interface IDAONoter extends ICRUD<Noter>{

	public Noter getById(int id);
	public double getMoyenneParMatiere(int idMatiere);
}
