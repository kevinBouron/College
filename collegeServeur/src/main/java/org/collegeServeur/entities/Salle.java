package org.collegeServeur.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Salle {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	

}
