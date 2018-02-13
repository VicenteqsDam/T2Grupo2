package es.fempa.citas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import es.fempa.citas.domain.Estudios;
import es.fempa.citas.domain.Idioma;
import es.fempa.citas.domain.Ojos;
import es.fempa.citas.domain.Pais;
import es.fempa.citas.domain.Pelo;
import es.fempa.citas.domain.BuscaBebedor;
import es.fempa.citas.domain.BuscaFumador;
import es.fempa.citas.domain.Ciudad;
import es.fempa.citas.domain.Bebedor;
import es.fempa.citas.domain.Fumador;
import es.fempa.citas.service.DatosBasicosService;

@RestController
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
	
	@GetMapping("/findAllDrinker")
	public List<Bebedor> findAllBebedor(){
		return this.dbService.findAllBebedor();
	}
	
	@GetMapping("/findAllSmoker")
	public List<Fumador> findAllFumador(){
		return this.dbService.findAllFumador();
	}
	
	@GetMapping("/findAllWantDrinker")
	public List<BuscaBebedor> findAllBuscaBebedor(){
		return this.dbService.findAllBuscaBebedor();
	}
	
	@GetMapping("/findAllWantSmoker")
	public List<BuscaFumador> findAllBuscaFumador(){
		return this.dbService.findAllBuscaFumador();
	}
	
	@GetMapping("/findAllCountry")
	public List<Pais> findAllPais(){
		return this.dbService.findAllPais();
	}
	
	@GetMapping("/findAllCity")
	public List<Ciudad> findAllCiudad(){
		return this.dbService.findAllCiudad();
	}
}
