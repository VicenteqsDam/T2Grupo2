package es.fempa.citas.domain;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class BuscaFumador {

	@GeneratedValue
	@Id
	private int idFumador;

	@Column(name = "fumador")
	private String fumador;
}
