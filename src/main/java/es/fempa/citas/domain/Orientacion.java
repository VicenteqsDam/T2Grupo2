package es.fempa.citas.clases;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Orientacion {
	@GeneratedValue
	@Id
	private int idOrientacion;
	private String orientacion;

	@OneToMany(mappedBy = "orientacion")
	private List<Usuario> listUsuario;
}
