package es.fempa.citas.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Encuentros {
	@GeneratedValue
	@Id
	private int idEncuentro;
	
	@Column(name = "idUsuarioSolicitante")
	private int idUsuarioSolicitante;
	
	@Column(name = "idUsuarioSolicitado")
	private int idUsuarioSolicitado;
	
	@Column(name = "fecha")
	private String fecha;
	
	@Column(name = "hora")
	private String hora;
	
	@Column(name = "lugar")
	private String lugar;
	private int idPlan;
	
	@Column(name = "aceptado")
	private boolean aceptado;
	
	@Column(name = "comentarioSolicitante")
	private String comentSolicitante;
	
	@Column(name = "comentarioSolicitado")
	private String comentSolicitado;
	
	@Column(name = "valorSolicitante")
	private int valorSolicitante;
	
	@Column(name = "valorSolicitado")
	private int valorSolicitado;
	
	@Column(name = "valoracion")
	private float valoracion;
}
