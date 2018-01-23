package es.fempa.citas.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Usuario")
@Getter
@Setter
public class Usuario {
	
	@Id
	private Integer idUsuario;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "apellidos")
	private String apellidos;
	
	@Column(name = "fechaNacimiento")
	private Date fechaNacimiento;
	
	@OneToMany
    @JoinColumn(name = "idCiudad")
	private Integer idCiudad;
	
	@Column(name = "pass")
	private String pass;
	
	@Column(name = "cp")
	private Integer cp;
	
	@OneToMany
	@JoinColumn(name = "idSexo")
	private Integer idSexo;
	
	@OneToMany
	@JoinColumn(name = "idOrientacion")
	private Integer idOrientacion;
	
	@OneToMany
	@JoinColumn(name = "idFoto")
	private Integer idFoto;
	
	@Column(name = "altura")
	private float altura;
	
	@Column(name = "peso")
	private float peso;
	
	@OneToMany
	@JoinColumn(name = "idPelo")
	private Integer idPelo;
	
	@OneToMany
	@JoinColumn(name = "idOjos")
	private Integer idOjos;
	
	@Column(name="descripcion")
	private String descripcion;
	
	@OneToMany
	@JoinColumn(name = "idPais")
	private Integer idPais;
	
	@OneToMany
	@JoinColumn(name = "idPaisOrigen")
	private Integer idPaisOrigen;
	
	@OneToMany
	@JoinColumn(name = "idEstudios")
	private Integer idEstudios;
	
	@ManyToMany
	@JoinColumn(name = "idIdiomas")
	private Integer idIdiomas;
	
	@OneToMany
	@JoinColumn(name = "idFumador")
	private Integer idFumador;
	
	@OneToMany
	@JoinColumn(name = "idBebedor")
	private Integer idBebedor;
	
	@OneToMany
	@JoinColumn(name = "idEstudios")
	private Integer idOcupacion;
	
	@OneToMany
	@JoinColumn(name = "idBuscaFumador")
	private Integer idBuscaFumador;
	
	@OneToMany
	@JoinColumn(name = "idBuscaBebedor")
	private Integer idBuscaBebedor;
	
	@Column(name="perfilPublico")
	private boolean perfilPublico;
	
	@Column(name="edadMinima")
	private Integer edadMinima;
	
	@Column(name="edadMaxima")
	private Integer edadMaxima;
}
