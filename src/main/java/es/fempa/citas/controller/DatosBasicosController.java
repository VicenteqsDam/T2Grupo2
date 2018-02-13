package es.fempa.citas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import es.fempa.citas.domain.Estudios;
import es.fempa.citas.domain.Idioma;
import es.fempa.citas.domain.Ojos;
import es.fempa.citas.domain.Pelo;
import es.fempa.citas.service.DatosBasicosService;

public class DatosBasicosController {

	@Autowired
	private DatosBasicosService dbService;

	@GetMapping("/findAllStudies")
	public List<Estudios> findAllEstudios() {
		return this.dbService.findAllEstudio();
	}

	@GetMapping("/findAllLanguages")
	public List<Idioma> findAllIdioma() {
		return this.dbService.findAllIdioma();
	}

	@GetMapping("/findAllEyes")
	public List<Ojos> findAllOjos() {
		return this.dbService.findAllOjos();
	}

	@GetMapping("/findAllHair")
	public List<Pelo> findAllPelos() {
		return this.dbService.findAllPelos();
	}
}
