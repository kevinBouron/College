package org.collegeServeur.service;

import org.collegeServeur.dao.DAOEtudiant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service("serviceEtudiant")
public class ServiceEtudiant implements IService{
	
	@Autowired
	private DAOEtudiant dao;
	

}