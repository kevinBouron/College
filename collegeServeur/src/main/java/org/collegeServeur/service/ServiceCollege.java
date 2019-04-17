package org.collegeServeur.service;

import org.collegeServeur.dao.DAOCollege;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service ("serviceCollege")

public class ServiceCollege implements IService {
	
	@Autowired
	@Qualifier("daoCollege")
	private DAOCollege dao;

}
