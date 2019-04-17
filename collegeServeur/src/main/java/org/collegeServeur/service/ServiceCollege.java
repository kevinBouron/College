package org.collegeServeur.service;

import java.util.List;

import org.collegeServeur.dao.DAOCollege;
import org.collegeServeur.entities.College;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service ("serviceCollege")

public class ServiceCollege implements IServiceCollege {
	
	@Autowired
	@Qualifier("daoCollege")
	private DAOCollege dao;

	public College getById(int id) {
		
		return dao.getById(id);
	}

	public void create(College t) {
		dao.create(t);
		
	}

	public void update(College t) {
		dao.update(t);
		
	}

	public void delete(College t) {
		dao.delete(t);
		
	}

	public List<College> display() {
		
		return dao.display();
	}

}
