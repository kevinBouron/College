package org.collegeServeur.dao;

import org.collegeServeur.entities.College;
import org.collegeServeur.entities.Departement;
import org.collegeServeur.entities.Salle;

public interface IDAOSalle extends ICRUD<Salle>{

	public Salle getById(int id);
}
