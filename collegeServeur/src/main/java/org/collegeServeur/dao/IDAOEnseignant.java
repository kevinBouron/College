package org.collegeServeur.dao;


import org.collegeServeur.entities.Enseignant;

public interface IDAOEnseignant extends ICRUD<Enseignant> {

	public Enseignant GetById (int id);
}
