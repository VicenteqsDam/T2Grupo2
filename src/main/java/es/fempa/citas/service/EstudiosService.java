package es.fempa.citas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import es.fempa.citas.domain.Estudios;
import es.fempa.citas.repository.EstudiosRepository;

public class EstudiosService {

	@Autowired
	public EstudiosRepository estudiosRepository;

	public List<Estudios> findAll() {
		return this.estudiosRepository.findAll();
	}

	public Estudios findId(Integer id) {
		return this.estudiosRepository.findIdEstudios(id);
	}
}
