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
public class Ciudad {
	@GeneratedValue
	@Id
	private int idCiudad;
	private String ciudad;

	@OneToMany(mappedBy = "ciudad")
	private List<Usuario> listUsuario;
}
