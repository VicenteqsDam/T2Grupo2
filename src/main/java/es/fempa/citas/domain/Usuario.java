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
	private Ciudad idCiudad;
	
	@Column(name = "pass")
	private String pass;
	
	@Column(name = "cp")
	private Integer cp;
	
	@ManyToOne
	@JoinColumn(name = "idSexo")
	private Sexo idSexo;
	
	@ManyToOne
	@JoinColumn(name = "idOrientacion")
	private Orientacion idOrientacion;
	
	@ManyToOne
	@JoinColumn(name = "idFoto")
	private Foto idFoto;
	
	@Column(name = "altura")
	private float altura;
	
	@Column(name = "peso")
	private float peso;
	
	@ManyToOne
	@JoinColumn(name = "idPelo")
	private Pelo idPelo;
	
	@ManyToOne
	@JoinColumn(name = "idOjo")
	private Ojos idOjo;
	
	@Column(name="descripcion")
	private String descripcion;
	
	@ManyToOne
	@JoinColumn(name = "idPais")
	private Pais idPais;
	
	/*@ManyToOne
	@JoinColumn(name = "idPaisOrigen")
	private PaisOrigen idPaisOrigen;*/
	
	@ManyToOne
	@JoinColumn(name = "idEstudios")
	private Estudios idEstudios;
	
	@ManyToMany
	@JoinTable(name = "usuarioIdioma",
    joinColumns = { @JoinColumn(name = "idUsuario")},
    inverseJoinColumns = { @JoinColumn(name = "id")})
	private List<Idioma> idiomas = new ArrayList<>();
	
	/*@ManyToMany
	@JoinTable(name = "usuarioInteres",
	joinColumns = { @JoinColumn(name ="idUsuario")},
	inverseJoinColumns = { @JoinColumn (name = "idInteres")})
	private List<Interes> intereses = new ArrayList<>();*/
	
	@ManyToOne
	@JoinColumn(name = "idFumador")
	private Fumador idFumador;
	
	@ManyToOne
	@JoinColumn(name = "idBebedor")
	private Bebedor idBebedor;
	
	/*@OneToMany
	@JoinColumn(name = "idEstudios")
	private Ocupacion idOcupacion;
	
	@ManyToOne
	@JoinColumn(name = "idBuscaFumador")
	private BuscaFumador idBuscaFumador;
	
	@ManyToOne
	@JoinColumn(name = "idBuscaBebedor")
	private BuscaBebedor idBuscaBebedor;*/
	
	@Column(name="perfilPublico")
	private boolean perfilPublico;
	
	@Column(name="edadMinima")
	private Integer edadMinima;
	
	@Column(name="edadMaxima")
	private Integer edadMaxima;
}
