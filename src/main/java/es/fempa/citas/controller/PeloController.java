package es.fempa.citas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import es.fempa.citas.domain.Pelo;
import es.fempa.citas.service.PeloService;

@RestController
public class PeloController {
	@Autowired
	private PeloService pelo;
	
	@GetMapping("/listaPelos")
	public List<Pelo> findAll(){
		return this.pelo.findAll();
	}
}
