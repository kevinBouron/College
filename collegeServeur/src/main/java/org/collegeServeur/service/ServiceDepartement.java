package org.collegeServeur.service;

import org.collegeServeur.dao.DAODepartement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service("serviceDepartement")
public class ServiceDepartement implements IService {
	@Autowired
	private DAODepartement dao;

}
