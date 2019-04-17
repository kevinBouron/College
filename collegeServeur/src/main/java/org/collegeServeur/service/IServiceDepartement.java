package org.collegeServeur.service;


import org.collegeServeur.dao.IDAODepartement;

public interface IServiceDepartement extends IDAODepartement{

	public double getMoyenneParDepartement(int idDepartement);
}
