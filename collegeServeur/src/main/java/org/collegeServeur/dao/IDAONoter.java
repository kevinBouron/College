package org.collegeServeur.dao;


import org.collegeServeur.entities.Matiere;
import org.collegeServeur.entities.Noter;

public interface IDAONoter extends ICRUD<Noter>{

	public Noter getById(int id);
	public double getMoyenneParMatiere(int idMatiere);
<<<<<<< HEAD
	public Noter getNote(int idMat, int idP);
=======

	
	
>>>>>>> branch 'master' of https://github.com/kevinBouron/College.git
}
