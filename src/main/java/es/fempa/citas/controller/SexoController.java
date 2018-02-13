package es.fempa.citas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import es.fempa.citas.domain.Sexo;
import es.fempa.citas.service.SexoService;

@RestController
public class SexoController {
	@Autowired
	private SexoService sexo;

	@GetMapping("/findAllSex")
	public List<Sexo> findAll() {
		return this.sexo.findAll();
	}
}
