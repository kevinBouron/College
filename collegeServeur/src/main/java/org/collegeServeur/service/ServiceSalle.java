package org.collegeServeur.service;

import java.util.List;

import org.collegeServeur.dao.DAOSalle;
import org.collegeServeur.entities.Salle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service("serviceSalle")
public class ServiceSalle  implements IServiceSalle {
	
	@Autowired
	private DAOSalle dao;

	public ServiceSalle() {
		
	}

	public void create(Salle t) {

		dao.create(t);
		
	}

	public void update(Salle t) {

		dao.update(t);
		
	}

	public void delete(Salle t) {

		dao.delete(t);
		
	}

	public List<Salle> display() {
	
		return dao.display();
	}

	public Salle getById(int id) {
		// TODO Auto-generated method stub
		return dao.getById(id);
	}
	
	
	
}
