package org.collegeServeur.service;

import java.util.List;

import org.collegeServeur.dao.DAODepartement;
import org.collegeServeur.entities.Departement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service("serviceDepartement")
public class ServiceDepartement  implements IServiceDepartement {
	@Autowired
	private DAODepartement dao;

	public Departement getById(int id) {
		
		return dao.getById(id);
	}

	public void create(Departement t) {
		dao.create(t);
		
	}

	public void update(Departement t) {
		dao.update(t);
		
	}

	public void delete(Departement t) {
		dao.delete(t);
		
	}

	public List<Departement> display() {
		
		return dao.display();
	}

}
