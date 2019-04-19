package org.collegeServeur.service;

import java.util.List;

import org.collegeServeur.dao.DAONoter;
import org.collegeServeur.entities.Matiere;
import org.collegeServeur.entities.Noter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service("serviceNoter")
public class ServiceNoter  implements IServiceNoter {
	
	@Autowired
	private DAONoter dao;

	public Noter getById(int id) {
		// TODO Auto-generated method stub
		return dao.getById(id);
	}

	public void create(Noter t) {
		// TODO Auto-generated method stub
		dao.create(t);
	}

	public void update(Noter t) {
		// TODO Auto-generated method stub
		dao.update(t);
	}

	public void delete(Noter t) {
		// TODO Auto-generated method stub
		dao.delete(t);
	}

	public List<Noter> display() {
		// TODO Auto-generated method stub
		return dao.display();
	}

	public double getMoyenneParMatiere(int idMatiere) {
		// TODO Auto-generated method stub
		return dao.getMoyenneParMatiere(idMatiere);
	}

<<<<<<< HEAD
	public Noter getNote(int idMat, int idP) {
		// TODO Auto-generated method stub
		return dao.getNote(idMat, idP);
	}
=======

>>>>>>> branch 'master' of https://github.com/kevinBouron/College.git
	
	
}
