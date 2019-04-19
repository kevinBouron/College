package org.collegeServeur.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.collegeServeur.entities.Etudiant;
import org.collegeServeur.entities.Matiere;
import org.collegeServeur.entities.Noter;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;



@Repository("daoEtudiant")
public class DAOEtudiant implements IDAOEtudiant {
	
	@Autowired
	private SessionFactory sessionFactory;

	
	
	
	
	
	public void create(Etudiant t) {
		sessionFactory.getCurrentSession().merge(t);
	}

	public void update(Etudiant t) {
		sessionFactory.getCurrentSession().update(t);
	}

	public void delete(Etudiant t) {
		sessionFactory.getCurrentSession().delete(t);
	}

	public List<Etudiant> display() {

		return sessionFactory.getCurrentSession().createQuery("from Etudiant etu").list();
	}

	public Etudiant GetById(int id) {

		return (Etudiant) sessionFactory.getCurrentSession().get(Etudiant.class, id);
	}

	public double getMoyenneGenerale(int idEtudiant) {
		Query q=sessionFactory.getCurrentSession().createQuery(" select avg(note) from Noter n where n.etudiant.idPersonne =:id group by n.etudiant.idPersonne").setParameter("id", idEtudiant) ;
		return (Double) q.list().get(0);
		
	}

	public List<Matiere> getMatieresSansNote(int idEtudiant) {

		List<Noter> noters = sessionFactory.getCurrentSession().createQuery(" from Noter n").list();
		List<Matiere> matieres=new ArrayList<Matiere>();
		for(Noter n : noters) {
			if(n.getEtudiant().getIdPersonne()==idEtudiant && n.getNote()==null ) {
				
				matieres.add(n.getMatiere());
			}
			
			
			
		}
		
		return matieres;
	}
	

}
