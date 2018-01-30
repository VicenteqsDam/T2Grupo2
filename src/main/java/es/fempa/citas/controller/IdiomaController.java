package es.fempa.citas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import es.fempa.citas.domain.Idioma;
import es.fempa.citas.service.IdiomaService;

@RestController
public class IdiomaController {
	@Autowired
	private IdiomaService idioma;
	
	@GetMapping("/listaIdiomas")
	public List<Idioma> findAll(){
		return this.idioma.findAll();
	}
}
