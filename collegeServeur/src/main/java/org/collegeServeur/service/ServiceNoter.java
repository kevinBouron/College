package org.collegeServeur.service;

import org.collegeServeur.dao.DAONoter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service("serviceNoter")
public class ServiceNoter  implements IServiceNoter {
	
	@Autowired
	private DAONoter dao;
	

}
