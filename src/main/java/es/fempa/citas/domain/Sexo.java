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
public class Sexo {
	@Id
	@GeneratedValue
	private Integer idSexo;
	private String sexo;

	@OneToMany(mappedBy = "sexo")
	private List<Usuario> usuarioList;
}
