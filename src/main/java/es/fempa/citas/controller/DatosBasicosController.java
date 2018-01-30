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

	@GetMapping("/findAllEstudios")
	public List<Estudios> findAllEstudios() {
		return this.dbService.findAllEstudio();
	}

	@GetMapping("/findEstudio/{id}")
	public Estudios findIdEstudios(Integer id) {
		return this.dbService.findId(id);
	}

	@GetMapping("/listaIdiomas")
	public List<Idioma> findAllIdioma() {
		return this.dbService.findAllIdioma();
	}

	@GetMapping("/listaOjos")
	public List<Ojos> findAllOjos() {
		return this.dbService.findAllOjos();
	}

	@GetMapping("/listaPelos")
	public List<Pelo> findAllPelos() {
		return this.dbService.findAllPelos();
	}
}
