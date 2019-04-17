package org.collegeServeur.dto;

public class FicheSemantique {
	
	private String nom;
	private String prenom;
	private String mail;
	private int tel;
	
	
	
	public FicheSemantique() {
		
	}
	
	
	public FicheSemantique(String nom, String prenom, String mail, int tel) {
		
		this.nom = nom;
		this.prenom = prenom;
		this.mail = mail;
		this.tel = tel;
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


	@Override
	public String toString() {
		return "FicheSemantique [nom=" + nom + ", prenom=" + prenom + ", mail=" + mail + ", tel=" + tel + "]";
	}
	
	
	

}


