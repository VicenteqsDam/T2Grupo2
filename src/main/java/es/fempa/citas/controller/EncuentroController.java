package es.fempa.citas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import es.fempa.citas.domain.Encuentro;
import es.fempa.citas.service.EncuentroService;

@RestController
public class EncuentroController {

	@Autowired
	private EncuentroService encuentroService;

	@GetMapping("/findAll")
	public List<Encuentro> findAll(Integer id) {
		return this.encuentroService.findAll(id);
	}

	@PostMapping("/save")
	public void saveClase(@RequestBody Encuentro e) {
		this.encuentroService.saveClase(e);
	}

	@RequestMapping("/findEncuentro/{id}")
	public Encuentro findByID(@PathVariable Integer id) {
		return this.encuentroService.findEncuentro(id);
	}
}
