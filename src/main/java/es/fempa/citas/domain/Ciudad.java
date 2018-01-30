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
public class Ciudad {
	@GeneratedValue
	@Id
	private int idCiudad;
	
	@Column(name = "ciudad")
	private String ciudad;

}
