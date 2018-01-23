package es.fempa.citas.clases;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Pais {
	@GeneratedValue
	@Id
	private int idPais;
	private String pais;

	@OneToMany(mappedBy = "origen")
	private List<Usuario> listUsuario;
}
