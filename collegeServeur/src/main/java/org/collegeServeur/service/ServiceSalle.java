package org.collegeServeur.service;

import org.collegeServeur.dao.DAOSalle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service("serviceSalle")
public class ServiceSalle implements IService {
	
	@Autowired
	private DAOSalle dao;

}
