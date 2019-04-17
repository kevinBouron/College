package org.collegeServeur.service;

import org.collegeServeur.dao.DAOEnseignant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service("serviceEnseignant")
public class ServiceEnseignant  implements IServiceEnseignant{
	
	@Autowired
	private DAOEnseignant dao;

}
