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
	private int id;
	
}
