package es.fempa.citas.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "idioma")
@Getter
@Setter
public class Idioma {

	@Id
	private Integer id;

	@Column(name = "idioma")
	private String idioma;

}
