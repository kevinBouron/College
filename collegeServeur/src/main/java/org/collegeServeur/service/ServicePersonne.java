package org.collegeServeur.service;

import java.util.List;

import org.collegeServeur.dao.DAOPersonne;
import org.collegeServeur.entities.Personne;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service("servicePersonne")
public class ServicePersonne  implements IServicePersonne {
	
	@Autowired
	private DAOPersonne dao;
	
	public ServicePersonne () {
		
	}

	public void create(Personne t) {
		
		dao.create(t);
		
	}

	public void update(Personne t) {

		dao.update(t);
		
	}

	public void delete(Personne t) {

		dao.delete(t);
		
	}

	public List<Personne> display() {

		return dao.display();
	}
	

}
