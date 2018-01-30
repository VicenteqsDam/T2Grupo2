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
public class Bebedor {
	@Id
	@GeneratedValue
	private Integer idBebedor;
	private String bebedor;

	@OneToMany(mappedBy = "bebe")
	private List<Usuario> listUsuario;
}
