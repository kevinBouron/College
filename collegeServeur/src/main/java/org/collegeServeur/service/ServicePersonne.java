package org.collegeServeur.service;

import org.collegeServeur.dao.DAOPersonne;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service("servicePersonne")
public class ServicePersonne implements IService {
	
	@Autowired
	private DAOPersonne dao;

}
