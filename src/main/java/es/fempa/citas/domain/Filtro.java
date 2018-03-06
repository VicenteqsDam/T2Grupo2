package es.fempa.citas.domain;

import java.util.List;

public class Filtro {

	private String nombre;
	private String apellido;
	private Integer edad;
	private Sexo sexo;
	private Ciudad ciudad;
	private Pais pais;
	private Ojos ojos;
	private Pelo pelo;
	private Integer altura;
	private Integer peso;
	private Orientacion orientacion;
	private List<Interes> intereses;
	private BuscaBebedor bebe;
	private BuscaFumador fuma;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	public Ciudad getCiudad() {
		return ciudad;
	}

	public void setCiudad(Ciudad ciudad) {
		this.ciudad = ciudad;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

	public Ojos getOjos() {
		return ojos;
	}

	public void setOjos(Ojos ojos) {
		this.ojos = ojos;
	}

	public Pelo getPelo() {
		return pelo;
	}

	public void setPelo(Pelo pelo) {
		this.pelo = pelo;
	}

	public Integer getAltura() {
		return altura;
	}

	public void setAltura(Integer altura) {
		this.altura = altura;
	}

	public Integer getPeso() {
		return peso;
	}

	public void setPeso(Integer peso) {
		this.peso = peso;
	}

	public List<Interes> getIntereses() {
		return intereses;
	}

	public void setIntereses(List<Interes> intereses) {
		this.intereses = intereses;
	}

	public BuscaBebedor getBebe() {
		return bebe;
	}

	public void setBebe(BuscaBebedor bebe) {
		this.bebe = bebe;
	}

	public BuscaFumador getFuma() {
		return fuma;
	}

	public void setFuma(BuscaFumador fuma) {
		this.fuma = fuma;
	}

	public Orientacion getOrientacion() {
		return orientacion;
	}

	public void setOrientacion(Orientacion orientacion) {
		this.orientacion = orientacion;
	}

}
