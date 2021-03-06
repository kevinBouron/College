package org.collegeServeur.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.Generated;

@Entity
public class Personne {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	protected int idPersonne;
	protected String nom;
	protected String prenom;
	protected String mail;
	protected int tel;
	
	
	
	
	public Personne(String nom, String prenom, String mail, int tel) {
		
		this.nom = nom;
		this.prenom = prenom;
		this.mail = mail;
		this.tel = tel;
	}
	public Personne() {
		
	}
	@Override
	public String toString() {
		return "Personne [nom=" + nom + ", prenom=" + prenom + ", mail=" + mail + ", tel=" + tel + "]";
	}
	
	public int getIdPersonne() {
		return idPersonne;
	}
	public void setIdPersonne(int idPersonne) {
		this.idPersonne = idPersonne;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public int getTel() {
		return tel;
	}
	public void setTel(int tel) {
		this.tel = tel;
	}
	
	
	
	
	
}
