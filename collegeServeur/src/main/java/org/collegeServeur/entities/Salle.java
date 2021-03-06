package org.collegeServeur.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;



@Entity
public class Salle {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idSalle;
	private String nom;
	
	private int nbrPlace;
	
	@OneToMany(mappedBy="salle",cascade=CascadeType.ALL)
	List<Matiere> matieres;


	
	
	public Salle(String nom, int nbrPlace, List<Matiere> matieres) {
		this.nom=nom;
		this.nbrPlace = nbrPlace;
		this.matieres = matieres;
	}

	public Salle() {
		
	}



	@Override
	public String toString() {
		return "Salle [idSalle=" + idSalle + ", nom=" + nom + ", nbrPlace=" + nbrPlace + "]";
	}

	public int getIdSalle() {
		return idSalle;
	}

	public void setIdSalle(int idSalle) {
		this.idSalle = idSalle;
	}

	public int getNbrPlace() {
		return nbrPlace;
	}

	public void setNbrPlace(int nbrPlace) {
		this.nbrPlace = nbrPlace;
	}

	public List<Matiere> getMatieres() {
		return matieres;
	}

	public void setMatieres(List<Matiere> matieres) {
		this.matieres = matieres;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}


	
	
	
	
}
