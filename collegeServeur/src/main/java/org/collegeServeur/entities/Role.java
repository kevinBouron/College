package org.collegeServeur.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Role {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long IdRole;
	private String roleName;
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="ID_USER")
	private User user;
	
	
	public Role(String roleName, User user) {
	
		this.roleName = roleName;
		this.user = user;
	}


	public Role() {
	
	}


	public long getIdRole() {
		return IdRole;
	}


	public void setIdRole(long idRole) {
		IdRole = idRole;
	}


	public String getRoleName() {
		return roleName;
	}


	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}


	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}

	
	
	
	
}
