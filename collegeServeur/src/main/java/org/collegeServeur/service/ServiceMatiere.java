package org.collegeServeur.service;

import org.collegeServeur.dao.DAOMatiere;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service("serviceMatiere")
public class ServiceMatiere  implements IServiceMatiere{
	
	@Autowired
	private DAOMatiere dao;

}
