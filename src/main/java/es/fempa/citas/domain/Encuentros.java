package es.fempa.citas.clases;

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
	private int idUsuarioSolicitante;
	private int idUsuarioSolicitado;
	private String fecha;
	private String hora;
	private String lugar;
	private int idPlan;
	private boolean aceptado;
	private String comentSolicitante;
	private String comentSolicitado;
	private int valorSolicitante;
	private int valorSolicitado;
	private float valoracion;
}
