package es.fempa.citas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import es.fempa.citas.domain.Amigo;
import es.fempa.citas.service.AmigoService;

@RestController

public class AmigoController {

	@Autowired
	private AmigoService amigo;

	@GetMapping("/find/friend/{id}")
	public Amigo findById(@PathVariable Integer id) {
		return this.amigo.findById(id);
	}

	@GetMapping("/findAllFriends")
	public List<Amigo> findAll() {
		return this.amigo.findAll();
	}

	/*
	 * @DeleteMapping("/delete/friend/{id}") public Amigo deleteMethod(@PathVariable
	 * Integer id) { return this.amigo.delete(); }
	 */
}
