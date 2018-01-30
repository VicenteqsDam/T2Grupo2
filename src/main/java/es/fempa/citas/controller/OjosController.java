package es.fempa.citas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import es.fempa.citas.domain.Ojos;
import es.fempa.citas.service.OjosService;

@RestController
public class OjosController {
	
	@Autowired
	private OjosService ojos;
	
	@GetMapping("/listaOjos")
	public List<Ojos> findAll(){
		return this.ojos.findAll();
	}
}
