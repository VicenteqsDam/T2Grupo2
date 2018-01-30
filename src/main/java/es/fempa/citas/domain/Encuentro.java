package es.fempa.citas.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Encuentro implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4917751180609737743L;
	@GeneratedValue
	@Id
	private Integer idEncuentro;

	@ManyToOne
	private Usuario usuarioSolicitante;

	@ManyToOne
	private Usuario usuarioSolicitado;

	private String fecha;
	private String hora;
	private String lugar;

	@OneToMany
	private List<Plan> plan;

	private boolean aceptado;
	private String comentSolicitante;
	private String comentSolicitado;
	private Integer valorSolicitante;
	private Integer valorSolicitado;
	private float valoracion;
}
