package es.fempa.citas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import es.fempa.citas.domain.Etiqueta;
import es.fempa.citas.service.EtiquetaService;

@RestController
public class EtiquetaController {

	@Autowired
	private EtiquetaService etiqueta;

	@GetMapping("/findAllLabels")
	public List<Etiqueta> findAllEtiquetas() {
		return this.etiqueta.findAll();
	}

	@PostMapping("/saveLabel")
	public void saveEtiqueta(@RequestBody Etiqueta e) {
		this.etiqueta.saveEtiqueta(e);
	}

	@PostMapping("/deleteLabel/{id}")
	public void deleteEtiqueta(@PathVariable Integer id) {
		this.etiqueta.deleteEtiqueta(id);
	}

}
