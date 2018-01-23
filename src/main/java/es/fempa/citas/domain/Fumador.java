package es.fempa.citas.domain;

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
public class Fumador {
	@GeneratedValue
	@Id
	private int idFumador;
	private String fumador;

	@OneToMany(mappedBy = "fumador")
	private List<Usuario> listUsuario;
}
