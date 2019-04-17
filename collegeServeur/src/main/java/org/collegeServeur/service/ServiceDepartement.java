package org.collegeServeur.service;

import java.util.ArrayList;
import java.util.List;

import org.collegeServeur.dao.DAODepartement;
import org.collegeServeur.entities.Departement;
import org.collegeServeur.entities.Enseignant;
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

	public double getMoyenneParDepartement(int idDepartement) {

		Departement dep =dao.getById(idDepartement);
		
		
		List<Integer> idMatieres=new ArrayList<Integer>();
		double sommeMoyenne=0;
		
		for(Enseignant e : dep.getEnseignants()) {
			
			if(e.getMatiere().getIdMatiere()!=0) {
			idMatieres.add(e.getMatiere().getIdMatiere());
			sommeMoyenne+=dao.getMoyenneParMatiere(e.getMatiere().getIdMatiere());
			}
		}
		
		double moyenneDep=sommeMoyenne/idMatieres.size();
		System.out.println("somme final "+sommeMoyenne+" nbfinal "+idMatieres.size());
		
		return moyenneDep;
	}

}
