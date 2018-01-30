package es.fempa.citas.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "orientacion")
@Getter
@Setter
public class Orientacion {

	@Id
	private int idOrientacion;
	
	@Column(name = "orientacion")
	private String orientacion;

}

}