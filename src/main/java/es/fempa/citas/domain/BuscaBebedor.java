package es.fempa.citas.domain;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class BuscaBebedor {

	@GeneratedValue
	@Id
	private int idBebedor;

	@Column(name = "bebedor")
	private String bebedor;
}
