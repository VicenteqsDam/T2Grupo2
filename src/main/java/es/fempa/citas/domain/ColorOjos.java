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
public class ColorOjos {
	@Id
	@GeneratedValue
	private Integer idOjos;
	private String colorOjos;

	@OneToMany(mappedBy = "cOjos")
	private List<Usuario> listUsuarios;
}
