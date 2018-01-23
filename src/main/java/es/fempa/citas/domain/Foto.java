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
public class Foto {
	@GeneratedValue
	@Id
	private int idFoto;
	private String foto;

	@OneToMany(mappedBy = "foto")
	private List<Usuario> listUsuario;
}
