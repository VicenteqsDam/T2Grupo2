package es.fempa.citas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.fempa.citas.domain.Bebedor;
import es.fempa.citas.domain.BuscaBebedor;
import es.fempa.citas.domain.BuscaFumador;
import es.fempa.citas.domain.Ciudad;
import es.fempa.citas.domain.Estudios;
import es.fempa.citas.domain.Fumador;
import es.fempa.citas.domain.Idioma;
import es.fempa.citas.domain.Interes;
import es.fempa.citas.domain.Ojos;
import es.fempa.citas.domain.Pais;
import es.fempa.citas.domain.Pelo;
import es.fempa.citas.repository.BebedorRepository;
import es.fempa.citas.repository.BuscaBebedorRepository;
import es.fempa.citas.repository.BuscaFumadorRepository;
import es.fempa.citas.repository.CiudadRepository;
import es.fempa.citas.repository.EstudiosRepository;
import es.fempa.citas.repository.FumadorRepository;
import es.fempa.citas.repository.IdiomaRepository;
import es.fempa.citas.repository.InteresRepository;
import es.fempa.citas.repository.OjosRepository;
import es.fempa.citas.repository.PaisRepository;
import es.fempa.citas.repository.PeloRepository;

@Service
public class DatosBasicosService {

	@Autowired
	public EstudiosRepository estudiosRepository;

	public List<Estudios> findAllEstudio() {
		return this.estudiosRepository.findAll();
	}

	/*
	 * public Estudios findId(Integer id) { return
	 * this.estudiosRepository.findIdEstudios(id); }
	 */

	@Autowired
	public IdiomaRepository idiomaRepository;

	public List<Idioma> findAllIdioma() {
		return this.idiomaRepository.findAll();
	}

	@Autowired
	public OjosRepository ojosRepository;

	public List<Ojos> findAllOjos() {
		return this.ojosRepository.findAll();
	}

	@Autowired
	public PeloRepository peloRepository;

	public List<Pelo> findAllPelos() {
		return this.peloRepository.findAll();
	}

	///// NUEVOS
	@Autowired
	public FumadorRepository fumadorRepository;

	public List<Fumador> findAllFumador() {
		return this.fumadorRepository.findAll();
	}

	@Autowired
	public BebedorRepository bebedorRepository;

	public List<Bebedor> findAllBebedor() {
		return this.bebedorRepository.findAll();
	}

	@Autowired
	public BuscaFumadorRepository buscaFumadorRepository;

	public List<BuscaFumador> findAllBuscaFumador() {
		return this.buscaFumadorRepository.findAll();
	}

	@Autowired
	public BuscaBebedorRepository buscaBebedorRepository;

	public List<BuscaBebedor> findAllBuscaBebedor() {
		return this.buscaBebedorRepository.findAll();
	}

	@Autowired
	public PaisRepository paisRepository;

	public List<Pais> findAllPais() {
		return this.paisRepository.findAll();
	}

	@Autowired
	public CiudadRepository ciudadRepository;

	public List<Ciudad> findAllCiudad() {
		return this.ciudadRepository.findAll();
	}

	@Autowired
	public InteresRepository interesRepository;

	public List<Interes> findAllInteres() {
		return this.interesRepository.findAll();
	}

}
