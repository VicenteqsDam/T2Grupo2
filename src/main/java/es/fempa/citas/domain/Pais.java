package es.fempa.citas.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Pais {
	@GeneratedValue
	@Id
	private int idPais;
	
	@Column(name = "pais")
	private String pais;


}
