package org.collegeServeur.dao;


import org.collegeServeur.entities.Matiere;

public interface IDAOMatiere  extends ICRUD<Matiere>{

	public Matiere getById(int id);
}
