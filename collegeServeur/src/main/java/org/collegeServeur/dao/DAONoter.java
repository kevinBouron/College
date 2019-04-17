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
		sessionFactory.getCurrentSession().merge(t);
	}

	public void update(Noter t) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().update(t);
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
		
		Query q=sessionFactory.getCurrentSession().createQuery(" select avg(note) from Noter n where n.matiere.idMatiere =:id group by n.matiere.idMatiere").setParameter("id", idMatiere);
		return (Double) q.list().get(0);
		// return moyenne;
	}


}
