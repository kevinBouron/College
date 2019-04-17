package org.collegeServeur.service;

import java.util.List;


import org.collegeServeur.dao.IDAOEtudiant;
import org.collegeServeur.entities.Matiere;


public interface IServiceEtudiant extends IDAOEtudiant {

	public double getMoyenneGenerale(int idEtudiant);
	public List<Matiere> getMatieresSansNote(int idEtudiant);
}
