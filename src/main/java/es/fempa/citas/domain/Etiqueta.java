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
public class Etiqueta {

	@GeneratedValue
	@Id
	private int idEtiqueta;

	@Column(name = "etiqueta")
	private String etiqueta;

	@Column(name = "icono")
	private String icono;
}
