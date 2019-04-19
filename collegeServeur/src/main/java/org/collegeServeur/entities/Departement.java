package org.collegeServeur.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

@Entity
public class Departement {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idDepartement;
	private String nomDepartement;
	
	@OneToMany(mappedBy="departement", cascade=CascadeType.ALL)
	@LazyCollection(LazyCollectionOption.FALSE)
	private List<Enseignant> enseignants;
	
	@ManyToOne
	@JoinColumn(name="idCollege")
	private College college;
	
	@OneToOne(cascade=CascadeType.ALL)
	private Enseignant responsable;

	public Departement() {
		
	}

	public Departement(String nomDepartement, List<Enseignant> enseignants, College college, Enseignant responsable) {
		this.nomDepartement = nomDepartement;
		this.enseignants = enseignants;
		this.college = college;
		this.responsable = responsable;
	}

	public int getIdDepartement() {
		return idDepartement;
	}

	public void setIdDepartement(int idDepartement) {
		this.idDepartement = idDepartement;
	}

	public String getNomDepartement() {
		return nomDepartement;
	}

	public void setNomDepartement(String nomDepartement) {
		this.nomDepartement = nomDepartement;
	}

	public List<Enseignant> getEnseignants() {
		return enseignants;
	}

	public void setEnseignants(List<Enseignant> enseignants) {
		this.enseignants = enseignants;
	}

	public College getCollege() {
		return college;
	}

	public void setCollege(College college) {
		this.college = college;
	}

	public Enseignant getResponsable() {
		return responsable;
	}

	public void setResponsable(Enseignant responsable) {
		this.responsable = responsable;
	}

	@Override
	public String toString() {
		return "Departement [idDepartement=" + idDepartement + ", responsable=" + responsable + "]";
	}

	



	
	
	
	

	
	
}
