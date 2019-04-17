package org.collegeServeur.service;

import java.util.List;

import org.collegeServeur.dao.DAOMatiere;
import org.collegeServeur.entities.Matiere;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service("serviceMatiere")
public class ServiceMatiere  implements IServiceMatiere{
	
	@Autowired
	private DAOMatiere dao;

	public Matiere getById(int id) {
		// TODO Auto-generated method stub
		return dao.getById(id);
	}

	public void create(Matiere t) {
		// TODO Auto-generated method stub
		dao.create(t);
	}

	public void update(Matiere t) {
		// TODO Auto-generated method stub
		dao.update(t);
	}

	public void delete(Matiere t) {
		// TODO Auto-generated method stub
		dao.delete(t);
	}

	public List<Matiere> display() {
		// TODO Auto-generated method stub
		return dao.display();
	}

}
