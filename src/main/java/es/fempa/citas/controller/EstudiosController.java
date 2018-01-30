package es.fempa.citas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import es.fempa.citas.domain.Estudios;
import es.fempa.citas.service.EstudiosService;

public class EstudiosController {

	@Autowired
	private EstudiosService estudiosService;

	@GetMapping("/findAll")
	public List<Estudios> findAll() {
		return this.estudiosService.findAll();
	}

	@GetMapping("/find/{id}")
	public Estudios findIdEstudios(Integer id) {
		return this.estudiosService.findId(id);
	}
}
