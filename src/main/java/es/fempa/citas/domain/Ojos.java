package es.fempa.citas.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "ojos")
@Getter
@Setter
public class Ojos {

	@Id
	private Integer idOjo;

	@Column(name = "color")
	private String color;
}
