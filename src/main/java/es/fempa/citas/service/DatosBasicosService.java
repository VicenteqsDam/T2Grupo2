package es.fempa.citas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import es.fempa.citas.domain.Estudios;
import es.fempa.citas.domain.Idioma;
import es.fempa.citas.domain.Ojos;
import es.fempa.citas.domain.Pelo;
import es.fempa.citas.repository.EstudiosRepository;
import es.fempa.citas.repository.IdiomaRepository;
import es.fempa.citas.repository.OjosRepository;
import es.fempa.citas.repository.PeloRepository;

public class DatosBasicosService {

	@Autowired
	public EstudiosRepository estudiosRepository;

	public List<Estudios> findAllEstudio() {
		return this.estudiosRepository.findAll();
	}

	public Estudios findId(Integer id) {
		return this.estudiosRepository.findIdEstudios(id);
	}

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
}
