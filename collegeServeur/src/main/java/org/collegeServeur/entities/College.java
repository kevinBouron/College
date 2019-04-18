package org.collegeServeur.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class College {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idCollege;
	private int nom;
	private String siteInternet;
	
	@OneToMany(mappedBy="college",fetch=FetchType.EAGER)
	List<Departement> departements;

	
	public College() {
		
	}

	
	public College(String siteInternet, List<Departement> departements) {
		this.siteInternet = siteInternet;
		this.departements = departements;
	}



	public int getIdCollege() {
		return idCollege;
	}

	public void setIdCollege(int idCollege) {
		this.idCollege = idCollege;
	}

	public String getSiteInternet() {
		return siteInternet;
	}

	public void setSiteInternet(String siteInternet) {
		this.siteInternet = siteInternet;
	}

	public List<Departement> getDepartements() {
		return departements;
	}

	public void setDepartements(List<Departement> departements) {
		this.departements = departements;
	}



	@Override
	public String toString() {
		return "College [idCollege=" + idCollege + ", siteInternet=" + siteInternet + ", departements=" + departements
				+ "]";
	}


	public int getNom() {
		return nom;
	}


	public void setNom(int nom) {
		this.nom = nom;
	}
	
	

}
