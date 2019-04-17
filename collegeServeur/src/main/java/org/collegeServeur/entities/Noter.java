package org.collegeServeur.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Noter {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
}
