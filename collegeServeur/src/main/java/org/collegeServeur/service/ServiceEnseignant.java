package org.collegeServeur.service;

import java.util.List;

import org.collegeServeur.dao.DAOEnseignant;
import org.collegeServeur.entities.Enseignant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service("serviceEnseignant")
public class ServiceEnseignant  implements IServiceEnseignant{
	
	@Autowired
	private DAOEnseignant dao;

	

	public void create(Enseignant t) {
		dao.create(t);
		
	}

	public void update(Enseignant t) {
		dao.update(t);
		
	}

	public void delete(Enseignant t) {
		dao.delete(t);
		
	}

	public List<Enseignant> display() {
		
		return dao.display();
	}

	public Enseignant GetById(int id) {
		
		return dao.GetById(id);
	}
}
