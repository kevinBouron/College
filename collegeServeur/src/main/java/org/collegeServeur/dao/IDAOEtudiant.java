package org.collegeServeur.dao;

import java.util.List;


import org.collegeServeur.entities.Etudiant;
import org.collegeServeur.entities.Matiere;



public interface IDAOEtudiant extends ICRUD<Etudiant> {

	public Etudiant GetById (int id);
	public double getMoyenneGenerale(int idEtudiant);
	public List<Matiere> getMatieresSansNote(int idEtudiant);


}
