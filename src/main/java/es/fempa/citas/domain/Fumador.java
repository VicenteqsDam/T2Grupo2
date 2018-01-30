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
public class Fumador {
	@GeneratedValue
	@Id
	private int idFumador;
	
	@Column(name = "fumador")
	private String fumador;
}
