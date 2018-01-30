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
public class Estudios {
	@Id
	@GeneratedValue
	private Integer idEstudios;
	private String estudios;

	@OneToMany(mappedBy = "estudio")
	private List<Usuario> listUsuario;
}
