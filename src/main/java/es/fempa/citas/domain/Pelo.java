package es.fempa.citas.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "pelo")
@Getter
@Setter
public class Pelo {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idPelo;
	
	@Column(name = "color")
	private String color;
}
