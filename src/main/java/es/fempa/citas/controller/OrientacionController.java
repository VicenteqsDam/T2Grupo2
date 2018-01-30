package es.fempa.citas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import es.fempa.citas.domain.Orientacion;
import es.fempa.citas.service.OrientacionService;

@RestController
public class OrientacionController {
	@Autowired
	private OrientacionService orientacion;

	@GetMapping("/listaOrientacion")
	public List<Orientacion> findAll() {
		return this.orientacion.findAll();
	}
}
