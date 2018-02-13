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
import es.fempa.citas.domain.Plan;
import es.fempa.citas.service.EncuentroService;

@RestController
public class EncuentroController {

	@Autowired
	private EncuentroService encuentroService;

	@GetMapping("/findAllMeeting")
	public List<Encuentro> findAllEncuentro() {
		return this.encuentroService.findAllEncuentro();
	}

	@PostMapping("/saveMeeting")
	public void saveEncuentro(@RequestBody Encuentro e) {
		this.encuentroService.saveEncuentro(e);
	}

	@RequestMapping("/findMeeting/{id}")
	public Encuentro findByIDEncuentro(@PathVariable Integer id) {
		return this.encuentroService.findEncuentro(id);
	}

	@GetMapping("/findAllPlan")
	public List<Plan> findAllPlan(Integer id) {
		return this.encuentroService.findAllPlan();
	}

	@PostMapping("/savePlan")
	public void savePlan(@RequestBody Plan p) {
		this.encuentroService.savePlan(p);
	}

	@RequestMapping("/findPlan/{id}")
	public Plan findByIDPlan(@PathVariable Integer id) {
		return this.encuentroService.findPlan(id);
	}

}
