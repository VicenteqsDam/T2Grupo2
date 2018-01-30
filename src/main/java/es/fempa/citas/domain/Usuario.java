package es.fempa.citas.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "usuario")
@Getter
@Setter
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idUsuario;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "apellidos")
	private String apellidos;
	
	@Column(name = "fechaNacimiento")
	private Date fechaNacimiento;
	
	@ManyToOne
    @JoinColumn(name = "idCiudad")
	private Integer idCiudad;
	
	@Column(name = "pass")
	private String pass;
	
	@Column(name = "cp")
	private Integer cp;
	
	@ManyToOne
	@JoinColumn(name = "idSexo")
	private Integer idSexo;
	
	@ManyToOne
	@JoinColumn(name = "idOrientacion")
	private Integer idOrientacion;
	
	@ManyToOne
	@JoinColumn(name = "idFoto")
	private Integer idFoto;
	
	@Column(name = "altura")
	private float altura;
	
	@Column(name = "peso")
	private float peso;
	
	@ManyToOne
	@JoinColumn(name = "idPelo")
	private Integer idPelo;
	
	@ManyToOne
	@JoinColumn(name = "idOjo")
	private Integer idOjos;
	
	@Column(name="descripcion")
	private String descripcion;
	
	@ManyToOne
	@JoinColumn(name = "idPais")
	private Integer idPais;
	
	@ManyToOne
	@JoinColumn(name = "idPaisOrigen")
	private Integer idPaisOrigen;
	
	@ManyToOne
	@JoinColumn(name = "idEstudios")
	private Integer idEstudios;
	
	@ManyToMany
	@JoinTable(name = "usuarioIdioma",
    joinColumns = { @JoinColumn(name = "idUsuario")},
    inverseJoinColumns = { @JoinColumn(name = "idIdioma")})
	private List<Idioma> idiomas = new ArrayList<>();
	
	@ManyToMany
	@JoinTable(name = "usuarioInteres",
	joinColumns = { @JoinColumn(name ="idUsuario")},
	inverseJoinColumns = { @JoinColumn (name = "idInteres")})
	private List<Interes> intereses = new ArrayList<>();
	
	@ManyToOne
	@JoinColumn(name = "idFumador")
	private Integer idFumador;
	
	@ManyToOne
	@JoinColumn(name = "idBebedor")
	private Integer idBebedor;
	
	@OneToMany
	@JoinColumn(name = "idEstudios")
	private Integer idOcupacion;
	
	@ManyToOne
	@JoinColumn(name = "idBuscaFumador")
	private Integer idBuscaFumador;
	
	@ManyToOne
	@JoinColumn(name = "idBuscaBebedor")
	private Integer idBuscaBebedor;
	
	@Column(name="perfilPublico")
	private boolean perfilPublico;
	
	@Column(name="edadMinima")
	private Integer edadMinima;
	
	@Column(name="edadMaxima")
	private Integer edadMaxima;
}
