package org.collegeServeur.service;

import java.util.List;

import org.collegeServeur.dao.DAOEtudiant;
import org.collegeServeur.entities.Etudiant;
import org.collegeServeur.entities.Matiere;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service("serviceEtudiant")
public class ServiceEtudiant  implements IServiceEtudiant{
	
	@Autowired
	private DAOEtudiant dao;

	

	public void create(Etudiant t) {
		dao.create(t);
		
	}

	public void update(Etudiant t) {
		dao.update(t);
		
	}

	public void delete(Etudiant t) {
		dao.delete(t);
	}

	public List<Etudiant> display() {
	
		return dao.display();
	}

	public Etudiant GetById(int id) {
		
		return dao.GetById(id);
	}
	
	public double getMoyenneGenerale(int idEtudiant) {
		
		return dao.getMoyenneGenerale(idEtudiant);
	}

	public List<Matiere> getMatieresSansNote(int idEtudiant) {
		
		return dao.getMatieresSansNote(idEtudiant);
	}
	

}
