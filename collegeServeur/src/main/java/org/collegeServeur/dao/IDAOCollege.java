package org.collegeServeur.dao;

import org.collegeServeur.entities.College;

public interface IDAOCollege extends ICRUD<College> {
	
	public College getById(int id);

}
