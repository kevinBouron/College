package org.collegeServeur.dao;

import java.util.List;

import org.collegeServeur.entities.Matiere;
import org.collegeServeur.entities.Noter;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("daoNoter")
public class DAONoter implements IDAONoter {

	@Autowired
	private SessionFactory sessionFactory;

	public void create(Noter t) {
		// TODO Auto-generated method stub
		List<Noter> notes =display();
		Boolean test=true;
		for(Noter n : notes) {
			if(t.getEtudiant().getIdPersonne()== n.getEtudiant().getIdPersonne() && t.getMatiere().getIdMatiere()== n.getMatiere().getIdMatiere()) {
				update(t);
				test=false;
			}
		}
		if(test=true) {
		sessionFactory.getCurrentSession().persist(t);
		}
	}

	public void update(Noter t) {
		List<Noter> notes =display();
		
		for(Noter n : notes) {
			if(t.getEtudiant().getIdPersonne()== n.getEtudiant().getIdPersonne() && t.getMatiere().getIdMatiere()== n.getMatiere().getIdMatiere()) {
				sessionFactory.getCurrentSession().delete(n);
				sessionFactory.getCurrentSession().persist(t);
				
			}
		}

		
	}

	public void delete(Noter t) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().delete(t);
	}

	public List<Noter> display() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("from Noter").list();
	}

	public Noter getById(int id) {
		// TODO Auto-generated method stub
		return (Noter) sessionFactory.getCurrentSession().get(Noter.class, id);
	}

	public double getMoyenneParMatiere(int idMatiere) {
//		Query q = session.createQuery(" select n from Noter n where n.matiere.idMatiere =:id ").setParameter("id",
//				idMatiere);
//		float sommeNote = 0;
//		int nbEtudiants = 0;
//
//		for (Noter n : (List<Noter>) q.list()) {
//
//			if (n.getMatiere().getIdMatiere() == idMatiere) {
//
//				sommeNote += n.getNote();
//				nbEtudiants++;
//			}
//
//		}
//
//		float moyenne = sommeNote / nbEtudiants;

		Query q = sessionFactory.getCurrentSession()
				.createQuery(
						" select avg(note) from Noter n where n.matiere.idMatiere =:id group by n.matiere.idMatiere")
				.setParameter("id", idMatiere);
		return (Double) q.list().get(0);
		// return moyenne;
	}

	public Noter getNote(int idMat, int idP) {

	
//	public String admissionEtud() {
//		
//		Query q = sessionFactory.getCurrentSession().createQuery("select avg(note) from Noter n where n.etudiant.idPersonne =:id group by n.etudiant.idPersonne");
//	
//		
//		if() {
//			
//			
//		}
//		
//		return "Vous êtes admis";
//		
//	}
	



		List<Noter> notes = sessionFactory.getCurrentSession()
				.createQuery("select n from Noter n where n.matiere.idMatiere=:idm and n.etudiant.idPersonne=:idp")
				.setParameter("idm", idMat).setParameter("idp", idP).list();
		if (!notes.isEmpty()) {

			return notes.get(0);
		}
		return null;
	}
}
